#Entrada de dados e conversão de tipos - 02/04/2025

nome = input('Digite seu nome:')
if nome == 'Michel' or 'Pedro':
    print(f'{nome} é foda')
else:
    print(f'{nome} é uma pessoa bem gay')

altura = float(input('Digite sua altura:'))
idade = int(input('Digite sua idade:'))
print(f'Sua altura é {altura}')
print(f'Sua idade é {idade}')

# input() da ao úsuario a chance de interagir com o programa
# int() converte para um número inteiro
# float() converte para um número com vírgula
