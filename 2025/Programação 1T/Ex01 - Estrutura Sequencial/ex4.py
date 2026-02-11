#4) Faça um Programa que peça as 4 notas bimestrais e mostre a média.

nota1 = float(input('Qual a sua nota do 1º trimestre?'))
nota2 = float(input('Qual a sua nota do 2º trimestre?'))
nota3 = float(input('Qual a sua nota do 3º trimestre?'))
nota4 = float(input('Qual a sua nota do 4º trimestre?'))

somaNotas = nota1 + nota2 + nota3 + nota4
media = somaNotas/4

print(f'A média de sua nota é {media}')
