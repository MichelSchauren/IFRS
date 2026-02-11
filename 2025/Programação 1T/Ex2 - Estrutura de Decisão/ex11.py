'''
11) As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe
contrataram para desenvolver o programa que calculará os reajustes.

Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte
critério, baseado no salário atual:

• Salários até R$ 280,00 (incluindo): aumento de 20%
• Salários entre R$ 280,00 e R$ 700,00: aumento de 15%
• Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
• Salários de R$ 1500,00 em diante: aumento de 5%
• Após o aumento ser realizado, informe na tela:
►O salário antes do reajuste;
►O percentual de aumento aplicado;
►O valor do aumento;
►O novo salário, após o aumento
'''

salario = float(input('Digite o salário do colaborador: R$'))

if 0 <= salario <= 280:
    aumento = '20%'
    valor_aumento = salario*0.2
elif 280 < salario <= 700:
    aumento = '15%'
    valor_aumento = salario*0.15
elif 700 < salario <= 1500:
    aumento = '10%'
    valor_aumento = salario*0.1
elif 1500 < salario:
    aumento = '5%'
    valor_aumento = salario*0.05
else:
    aumento = '[Inválido]'
    valor_aumento = 0
    novo_salario = 0
    print('Isso não é um salário válido!')

print(f'Salário antigo: R${salario:.2f};')
print(f'Aumento: {aumento};')
print(f'Valor do aumento: R${valor_aumento:.2f};')
print(f'Novo salário: R${salario + valor_aumento:.2f};')