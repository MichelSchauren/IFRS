# 6) Faça um Programa que leia três números e mostre o maior deles.

n1 = eval(input('Digite um número: '))
n2 = eval(input('Digite outro número: '))
n3 = eval(input('Digite mais um número: '))

if n1 > n2 and n1 > n3:
    print(f'O maior número é {n1}')
elif n2 > n1 and n2 > n3:
    print(f'O maior número é {n2}')
else:
    print(f'O maior número é {n3}')