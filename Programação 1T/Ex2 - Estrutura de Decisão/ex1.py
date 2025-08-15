# Peça dois números e depois diga qual o maior

n1 = (input('Digite um número: '))
n2 = (input('Digite outro número: '))

if n1 > n2:
    print(f'O maior número que você digitou é {n1}')
elif n1 == n2:
    print(f'Os dois números são iguais')
else:
    print(f'O maior número que você digitou é {n2}')