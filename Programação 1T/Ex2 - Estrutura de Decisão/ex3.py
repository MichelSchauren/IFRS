# 3) Crie um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
# escrever:F - Feminino, M - Masculino, Outro.

letra = input('Digite uma letra: ')

if letra == 'M' or letra == 'm':
    print('M - Masculino')
elif letra == 'F' or letra == 'f':
    print('F - Feminino')    
else:
    print(f'{letra} - Comunidade LGBTQIA+ ou indefinido')