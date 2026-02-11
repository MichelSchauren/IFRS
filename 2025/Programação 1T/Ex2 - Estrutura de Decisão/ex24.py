'''
24) Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do
saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis
serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O
programa não deve se preocupar com a quantidade de notas existentes na máquina.
• Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de
50, uma nota de 5 e uma nota de 1;
• Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de
50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
'''

while True:
    try:
        saque = float(input('Digite o valor do saque(min:10; máx:600): '))

        if saque < 10 or saque > 600:
            print('O valor mínimo do saque é 10 e o máximo é 600.')
            continue
    except:
        print('Valor inválido! TENTE NOVAMENTE.')
        continue
    else:
        notas = [100, 50, 10, 5, 1]
        troco = 0
        for n in notas:
            quantas = 0

            while troco + n <= saque:
                quantas = quantas+1
                troco += n

            if quantas > 1:
                print(f'{quantas} notas de {n}')
            elif quantas == 1:
                print(f'{quantas} nota de {n}')
        break