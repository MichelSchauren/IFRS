'''
20) Uma loja oferece descontos diferentes segundo o valor total da compra de um cliente. Escreva
um programa que leia o valor total da compra e apresente:
• O valor do desconto aplicado;
• O valor final a pagar após o desconto;
• E uma mensagem correspondente ao nível do cliente:
Valor da Compra             Desconto    Mensagem
Acima de R$ 1000            15%         "Cliente Premium"
Entre R$ 500 e R$ 1000      10%         "Cliente Especial"
Abaixo de R$ 500            5%          "Cliente Comum"
'''

while True:
    try:
        compra_total = float(input('Digite o valor total da compra: '))
        if compra_total == 0:
            print('Parabéns por comprar vento.')
            continue
        elif compra_total < 0:
            print('Por favor! Digite um valor positivo.')
            continue
    except:
        print('Valor Inválido! TENTE NOVAMENTE.')
        continue
    else:
        if 1000 <= compra_total:
            desconto = 0.15
            mensagem = 'Cliente Premium' 
        elif 500 <= compra_total < 1000:
            desconto = 0.1
            mensagem = 'Cliente Especial'
        elif 0 < compra_total < 500:
            desconto = 0.05
            mensagem = 'Cliente Comum'
        else:
            desconto = 0
            mensagem = 'Cliente Retardado'

        print(f'''
        {mensagem}
        Desconto aplicado: {desconto*100:.0f}%
        Total: R${compra_total - compra_total*desconto:.2f}
        ''')
    break