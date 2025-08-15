# Variaveis e Operadores matematicos - 25/03/2025

n1 = 50
n2 = 2

soma = n1 + n2 #somar
diferença = n1 - n2 #subtrair
produto = n1*n2 #multiplicar
razão = n1/n2 #dividir
razãointeira = n1//n2 #divide mais aredondando o número
resto = n1%n2 #resto da divisão
exponenciação = n1**n2 #faz n1 elevado a n2
radiciação = n1**(1/n2) #radiciação

operações = [soma, diferença, produto, razão, razão, exponenciação, radiciação]

i = 0
while i < operações.len():
    print(operações[i])
    i = i+1
