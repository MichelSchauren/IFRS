import pygame as pg
from pygame.locals import *
from sys import exit
import random

# Constantes
LARGURA = 800
ALTURA = 600
TITULO = 'Pong'
FONTE = 'gabriela'
FPS = 30
VEL_PLAYER = 8

PRETO = (0, 0, 0)
BRANCO = (255, 255, 255)

# Display
pg.init()
tela = pg.display.set_mode((LARGURA, ALTURA))
titulo = pg.display.set_caption(TITULO)
relogio = pg.time.Clock()

# Classes
class Player:
    def __init__(self, x=int, y=int, teclas=tuple, pos_pontuacao=int, largura=15, altura=100, cor=BRANCO):
        self.pontuacao = 0
        self.pos_pontuacao = pos_pontuacao
        self.cor = cor
        self.rect = pg.Rect(x, y, largura, altura)
        self.teclas = teclas

    def mover(self, movimentacao=int):
        if self.rect.top <= 0 and movimentacao < 0:
            pass
        elif self.rect.bottom >= ALTURA and movimentacao > 0:
            pass
        else:
            self.rect.y += movimentacao

    def desenhar(self):
        pg.draw.rect(tela, self.cor, self.rect)

class Bola:
    def __init__(self, x=LARGURA//2, y=ALTURA//2, tam=10, cor=BRANCO):
        self.rect = pg.Rect(x, y, tam*2, tam*2)
        self.raio = tam
        self.cor = cor
        self.vel_x = 0
        self.vel_y = 0

    def mover(self):
        # alterar direções
        for player in players.values():
            if self.rect.colliderect(player.rect):
                self.set_vel()
                self.vel_x *= -1
        if self.rect.top <= 0 or self.rect.bottom >= ALTURA:
            self.set_vel()
            self.vel_y *= -1
        # mover
        self.rect.x += self.vel_x
        self.rect.y += self.vel_y

    def set_vel(self, nova_direcao=False):
        if nova_direcao:
            direcao = random.choice((1, -1))
            self.vel_x = random.randint(10, 15)*direcao
        self.vel_y = random.randint(-8, 8)
        
    def desenhar(self):
        pg.draw.circle(tela, self.cor, self.rect.center, self.raio)

# Objetos
players = {
    'player1': Player(10, 250, (K_w, K_s), LARGURA//4),
    'player2': Player(LARGURA-25, 250, (K_UP, K_DOWN), LARGURA//4*3)
    }

bola = Bola()
bola.set_vel(True)

# Funções
def mostrar_texto(mensagem, cor, pos, tam):
    fonte = pg.font.match_font(FONTE)
    fonte = pg.font.Font(fonte, tam)
    texto = fonte.render(mensagem, True, cor)
    texto_rect = texto.get_rect()
    texto_rect.center = pos
    tela.blit(texto, texto_rect)

# Loop do Jogo
rodando = True
while rodando:
    relogio.tick(FPS)
    # Eventos
    for event in pg.event.get():
        if event.type == QUIT:
            pg.quit()
            exit()
    # Movimentação do player
    for player in players.values():
        if pg.key.get_pressed()[player.teclas[0]]:
            player.mover(-VEL_PLAYER)
        if pg.key.get_pressed()[player.teclas[1]]:
            player.mover(VEL_PLAYER)
                    
    # Atualizar jogo
    bola.mover()

    if bola.rect.right >= LARGURA:
        players['player1'].pontuacao += 1
        bola.rect.center = (LARGURA//2, ALTURA//2)
        bola.set_vel()
        
    if bola.rect.left <= 0:
        players['player2'].pontuacao += 1
        bola.rect.center = (LARGURA//2, ALTURA//2)
        bola.set_vel(True)

    # Desenhar
    tela.fill(PRETO)

    pg.draw.line(tela, BRANCO, (LARGURA//2, 0), (LARGURA//2, ALTURA), 4)

    for player in players.values():
        player.desenhar()
        mostrar_texto(str(player.pontuacao), BRANCO, (player.pos_pontuacao, 60), 64)
    bola.desenhar()

    pg.display.flip()
