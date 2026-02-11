# 8) Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no
# mês. Calcule e mostre o total do seu salário no referido mês.

salarioHora = float(input('Quanto você ganha por hora trabalhada?'))
horasTrabalhadas = int(input('Quantas horas você trabalha no mês?'))

salario = salarioHora*horasTrabalhadas

print(f'Seu salário mensal é de R${salario:.2f}')
