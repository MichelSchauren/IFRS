'''
3) Faça um programa que leia e valide as seguintes informações:
a) Nome: maior que 3 caracteres;
b) Idade: entre 0 e 150;
c) Salário: maior que zero;
d) Gênero: 'f', 'm' ou em branco;
e) Estado Civil: 's' (solteiro), 'c' (casado), 'v' (viuvo), 'd' (divorciado) ou em branco;
'''

while True:
    nome = input('Nome: ')
    idade = int(input('Idade: '))
    salario = float(input('Salário: '))
    genero = input('Gênero (m/f): ')
    estado_civil = input("Estado Civil: 's' (solteiro), 'c' (casado), 'v' (viuvo), 'd' (divorciado) ou em branco: ")

    if len(nome) <= 3:
        print('Nome Inválido!')
    elif idade < 0 or idade > 150:
        print('Idade Inválida!')
    elif salario < 0:
        print('Salário Inválido!')
    elif not genero in 'mf ':
        print('Gênero Inválido!')
    elif not estado_civil in 'scvd ':
        print('Estado civil Inválido!')
    else:
        print('TUDO CERTO!')
        break

while True:
    nome = input('Nome: ')

    if len(nome) <= 3:
        print('nome inválido!')
    else:
        break