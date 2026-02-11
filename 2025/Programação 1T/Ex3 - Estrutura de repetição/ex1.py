'''
1) Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja
inválido e continue pedindo até que o usuário informe um valor válido.
'''

# 1º forma
rodando = True
while rodando:
    nota = float(input('Digite uma nota entre 0 e 10: '))

    if nota < 0 or nota > 10:
        print('Nota Inválida. Digite novamente!')
    else:
        rodando = False

# 2º forma
nota = float(input('Digite uma nota entre 0 e 10: '))
while nota < 0 or nota > 10:
    print('É entre 0 e 10 seu merda')
    nota = float(input('Digite uma nota entre 0 e 10: '))

# 3º forma
while True:
    nota = float(input('Digite uma nota entre 0 e 10: '))

    if nota < 0 or nota > 10:
        print('Nota Inválida. Digite novamente!')
    else:
        break