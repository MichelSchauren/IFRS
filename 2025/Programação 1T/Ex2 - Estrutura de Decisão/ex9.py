# 9) Faça um Programa que leia três números e mostre-os em ordem decrescente.

numeros = [input('Digite um número: '), input('Digite outro número: '), input('Digite mais um número: ')]

numeros = sorted(numeros)
print(f'{numeros[0]}, {numeros[1]}, {numeros[2]}')