# 2) Índices e Índices Negativos
'''
1. Caracteres isolados
• Crie uma variável fruta com o valor "Abacaxi".
• Imprima o primeiro caractere (fruta[0]), o terceiro (fruta[2]) e o último usando índice
negativo.
'''

fruta = 'Abacaxi'
print(f'O primeiro caractere é {fruta[0]}')
print(f'O terceiro caractere é {fruta[2]}')
print(f'O último caractere é {fruta[-1]}')

'''
2. Posições no sobrenome
• Peça ao usuário que digite o sobrenome dele e armazene em uma variável sobrenome.
• Imprima na tela:
• O primeiro caractere.
• O penúltimo caractere usando índice negativo.
• O tamanho total (usando len).
'''

sobrenome = input('Digite seu sobrenome: ')
print(f'O primeiro caractere é {sobrenome[0]}')
print(f'O penultimo caractere é {sobrenome[-2]}')
print(f'O tamanho total do sobrenome é {len(sobrenome)}')