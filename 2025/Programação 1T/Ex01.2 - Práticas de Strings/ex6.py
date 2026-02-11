# 6) f-Strings
'''
1. Interpolação direta
• Crie as variáveis:
cidade = "Paris"
ano = 2025
• Imprima a frase: "Em 2025, pretendo visitar Paris."
diretamente usando f-string, sem precisar concatenar.
'''
cidade = 'Paris'
ano = 2025
print(f'Em {ano}, pretendo visitar {cidade}.')

'''
2. Expressões dentro das chaves
• Crie uma variável lado = 4 e, dentro de uma f-string, calcule a área de um quadrado
(lado ** 2) diretamente no marcador.
• Exemplo de saída:
"A área do quadrado de lado 4 é 16."
'''
lado = 4
print(f'A área do quadrado de lado {lado} é {lado**2}.')

