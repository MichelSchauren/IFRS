# 7) Faça um Programa que leia três números e mostre o maior e o menor deles.

n1 = eval(input('Digite um número: '))
n2 = eval(input('Digite outro número: '))
n3 = eval(input('Digite mais um número: '))

if n1 > n2 and n1 > n3:
    maior = n1
elif n2 > n1 and n2 > n3:
    maior = n2
else:
    maior = n3

if n1 < n2 and n1 < n3:
    menor = n1
elif n2 < n1 and n2 < n3:
    menor = n2
else:
    menor = n3

print(f'O maior número é {maior} e o menor é {menor}')