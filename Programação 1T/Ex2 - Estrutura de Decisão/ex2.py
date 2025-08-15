# 2) Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

valor = float(input('Digite um número: '))

if valor > 0:
    print('O número digitado é positivo')
elif valor < 0:
    print('O número digitado é negativo')    
else:
    print('O número digitado é 0')