'''
13) Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2-
Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
'''

dias = ['Domíngo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta']

while True:
    numero = float(input('Digite um número de 1 à 7: '))
    if 0 < numero <= 7 and numero == (numero*10)//10:
        numero = int(numero)
        print(f'{numero}-{dias[numero-1]}')
        break
    else:
        print('valor inválido! Digite novamente:')
        continue