'''
25) Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o
operador módulo (resto da divisão).
'''

try:
    n = int(input('Digite um número inteiro: '))
except:
    print('Valor inválido')
else:
    if n/2 == n//2:
        print('O número é PAR!')
    else:
        print('O número é IMPAR!')