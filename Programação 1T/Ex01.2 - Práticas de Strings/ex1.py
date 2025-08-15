# 1) Strings e len()
'''
1. Crie e meça
• Crie uma variável chamada saudacao que receba o valor "Olá, mundo!".
• Em seguida, imprima a mensagem "O tamanho da string é: " seguida do valor
obtido por len(saudacao).
'''
saudacao = 'Olá, mundo!'
print(f'O tamanho da string é: {len(saudacao)}')

'''
2. String vazia
• Crie uma variável chamada vazio que contenha uma string vazia ("").
• Verifique e imprima o valor de len(vazio).
• Em seguida, atribua algum texto a vazio e imprima novamente o novo tamanho.
'''
vazio = ""
print(len(vazio))
vazio = "algum texto para vazio"
print(len(vazio))