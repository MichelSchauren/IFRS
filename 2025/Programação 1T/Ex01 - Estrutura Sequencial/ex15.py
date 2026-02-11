# 15) Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no
# mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11%
# para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
# • Salário bruto, quanto pagou de IR e ao INSS, quanto pagou ao sindicato e o salário líquido.
# • Calcule os descontos e o salário líquido, conforme a tabela abaixo:
# + Salário Bruto: R$
# - IR (11%): R$
# - INSS (8%): R$
# - Sindicato (5%): R$
# = Salário Líquido: R$
# Obs.: Salário Bruto - Descontos → Salário Líquido.

salarioHora = float(input('Digite quanto você ganha por hora trabalhada:'))
horasTrabalhadas = float(input('Digite quantas horas você trabalha no mês:'))

salarioBruto = salarioHora*horasTrabalhadas
IR = 0.11*salarioBruto
INSS = 0.08*salarioBruto
sindicato = 0.05*salarioBruto
salarioLiquido = salarioBruto - IR - INSS - sindicato

print(f'+ Salário Bruto: R${salarioBruto:.2f}')
print(f'- IR (11%): R${IR:.2f}')
print(f'- INSS (8%): R${INSS:.2f}')
print(f'- Sindicato (5%): R${sindicato:.2f}')
print(f'= Salário Líquido: R${salarioLiquido:.2f}')
