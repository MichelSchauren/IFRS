# 8) Crie um programa que pergunte o preço de três produtos e informe 
# qual produto você deve comprar, sabendo que a decisão é sempre pelo 
# mais barato.

sunga_do_pedro = eval(input('Qual o valor da sunga do Pedro? R$'))
fimose_do_samuel = eval(input('Qual o valor da fimose do Samuel? R$'))
calcinha_matheus = eval(input('Qual o valor da calcinha fio dental do Matheus? R$'))

if sunga_do_pedro < fimose_do_samuel and sunga_do_pedro < calcinha_matheus:
    menor = 'Sunga do Pedro'
elif fimose_do_samuel < sunga_do_pedro and fimose_do_samuel < calcinha_matheus:
    menor = 'Fimose do Samuel'
else:
    menor = 'Calcinha do Matheus'

print(f'Você deve comprar a {menor}')