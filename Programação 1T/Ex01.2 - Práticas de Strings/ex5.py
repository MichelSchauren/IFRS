# 5) Composição com str.format()

'''
1. Posicionando valores
• Crie as variáveis:
produto = "notebook"
preco = 3500.99
• Use a sintaxe de format para exibir:
"O notebook custa 3500.99 reais."
• Experimente mudar o número de casas decimais no format.
'''
produto = "notebook"
preco = 3500.99
print('O {} custa R${:.2f}.'.format(produto, preco))

'''
2. Marcador nomeado
• Crie as variáveis:
aluno = "João"
nota = 9.5
• Monte a frase: "João obteve nota 9.5 na prova final."
usando "{aluno}" e "{nota}" como marcadores nomeados no format.
'''
aluno = 'João'
nota = 9.5
print('{} obteve nota {:.1f} na prova final.' .format(aluno, nota))