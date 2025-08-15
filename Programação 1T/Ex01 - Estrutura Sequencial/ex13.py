# 13) Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu
# peso ideal, utilizando as seguintes fórmulas:
# • Para homens: (72.7*h) - 58
# • Para mulheres: (62.1*h) – 44.7

h = float(input('Qual a sua altura em metros?'))
pesoIdealH = 72.7*h - 58
pesoIdealM = 62.1*h - 44.7

print(f'Se você for homem o seu peso ideal é de {pesoIdealH} quilos.')
print(f'Se for mulher o peso ideal é de {pesoIdealM} quilos.')
