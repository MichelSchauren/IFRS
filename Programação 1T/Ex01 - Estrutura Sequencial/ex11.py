# 11) Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
# • O produto do dobro do primeiro com metade do segundo.
# • A soma do triplo do primeiro com o terceiro.
# • O terceiro elevado ao cubo.

num1 = int(input('Digite um número inteiro:'))
num2 = int(input('Digite outro número inteiro:'))
numR = float(input('Digite um número real:'))

result1 = (num1*2)*(num2/2)
result2 = num1*3 + numR
result3 = numR**3

print(f'O produto do dobro do primeiro com metade do segundo é {result1}')
print(f'A soma do triplo do primeiro com o terceiro é {result2}')
print(f'O terceiro elevado ao cubo é {result3}')
