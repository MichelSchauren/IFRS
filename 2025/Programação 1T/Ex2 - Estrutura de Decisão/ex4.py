# 4) Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

letra = input('Digite uma letra: ')
vogais = 'AaEeIiOoUu'

if len(letra) != 1:
    print('Digite apenas uma letra')
else:
    if letra in vogais:
        print(f'{letra} - Vogal')
    else:
        print(f'{letra} - Consoante')