# 7) Formatação de Valores (casas decimais, zeros à esquerda,alinhamento)
'''
1. Alinhamento de texto
• Crie a variável linguagem = "Python".
• Imprima em linha única a string alinhada à direita em 10 espaços, depois centralizada em 10
espaços.
• Exemplo:
print(f">>{linguagem:>10}<<")
print(f">>{linguagem:^10}<<")
'''
linguagem = 'Python'
print(f">>{linguagem:>10}<<")
print(f">>{linguagem:^10}<<")

'''
2. Zeros à esquerda
• Crie uma variável codigo = 42.
• Use f-string ou format() para exibir esse número com 5 dígitos, preenchendo com zeros à
esquerda: "00042".
'''
codigo = 42
print(f'{codigo:05d}')
