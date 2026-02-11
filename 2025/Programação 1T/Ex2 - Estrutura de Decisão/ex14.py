'''
14) Faça um programa que lê duas notas parciais obtidas por um aluno numa disciplina ao longo de
um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento     Conceito
Entre 9.0 e 10.0            A
Entre 7.5 e 9.0             B
Entre 6.0 e 7.5             C
Entre 4.0 e 6.0             D
Entre 4.0 e zero            E
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem
“APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
'''
while True:
    nota1 = float(input('Digite a primeira nota do aluno: '))
    nota2 = float(input('Digite a segunda nota do aluno: '))
    media = (nota1 + nota2) / 2

    if not(0 <= nota1 <= 10) or not(0 <= nota2 <= 10):
        print('Nota(s) Inválida(s)! Por favor, digite novamente:')
        conceito = 'Indefinido'        
    elif 0 <= media < 4:
        conceito = 'E'
        break
    elif 4 <= media < 6:
        conceito = 'D'
        break
    elif 6 <= media < 7.5:
        conceito = 'C'
        break
    elif 7.5 <= media < 9:
        conceito = 'B'
        break
    elif 9 <= media <= 10:
        conceito = 'A'
        break
    else:
        print('Nota(s) Inválida(s)! Por favor, digite novamente:')
        conceito = 'Indefinido'
        continue

if conceito is 'A' or 'B' or 'C':
    aprovacao = 'APROVADO'
else:
    aprovacao = 'REPROVADO'

print(f'''
    1º Nota: {nota1:.1f}
    2º Nota: {nota2:.1f}
    Media: {media:.1f} - {conceito}
    {aprovacao}
''')