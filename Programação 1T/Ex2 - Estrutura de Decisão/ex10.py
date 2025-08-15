'''
10) Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-Matutino, ou VVespertino, ou N-Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!", "Boa Noite!" ou
"Valor Inválido!", conforme o caso.
'''

turno = input('Qual o turno que você estuda?(M-Matutino, V-Vespertino, N-Noturno): ')

if turno == 'M':
    print('Bom Dia!')
elif turno == 'N':
    print('Boa Tarde!')
elif turno == 'V':
    print('Boa Noite!')
else:
    print('Valor Inválido!')