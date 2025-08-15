'''
12) Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do
Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato
e o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que
deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa
deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
• Salário Bruto até 900 (inclusive): isento
• Salário Bruto até 1500 (inclusive): desconto de 5%
• Salário Bruto até 2500 (inclusive): desconto de 10%
• Salário Bruto acima de 2500: desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a
quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100.00
(-) IR (5%) : R$ 55.00
(-) INSS (10%) : R$ 110.00
FGTS (11%) : R$ 121.00
Total de descontos : R$ 165.00
Salário Líquido : R$ 935.00
'''

valor_hora = float(input('Digite o valor recebido por hora: '))
horas = int(input('Digite quantas são as horas trabalhadas: '))
salario_bruto = valor_hora*horas

if salario_bruto <= 900:
    descontoIR = 0
elif 900 < salario_bruto <= 1500:
    descontoIR = 0.05
elif 1500 < salario_bruto <= 2500:
    descontoIR = 0.1
elif 2500 < salario_bruto:
    descontoIR = 0.2
else:
    descontoIR = 0
    print('Algo deu errado!!!')

IR = salario_bruto*descontoIR
INSS = salario_bruto*0.1
FGTS = salario_bruto*0.11
total_descontos = IR + INSS + FGTS

print(f'''
Salário Bruto: ({valor_hora} * {horas}) : R$ {salario_bruto:.2f}
(-) IR ({descontoIR*100}%) : R$ {IR:.2f}
(-) INSS (10%) : R$ {INSS:.2f}
FGTS (11%) : R$ {FGTS:.2f}
Total de descontos : R$ {total_descontos:.2f}
Salário Líquido : R$ {salario_bruto - total_descontos:.2f}
''')