# 8) Fatiamento
'''
1. Pegando pedaços
• Crie a variável mensagem = "Eu adoro programar em Python".
• Imprima só a parte "Eu adoro programar". (Dica: use algo como mensagem[:18])
• Depois, imprima só "em Python".
'''
mensagem = "Eu adoro programar em Python"
print(mensagem[:18])
print(mensagem[19:])
'''
2. Invertendo palavra
• Crie a variável palavra = "espelho".
• Use fatiamento para imprimir a palavra de trás para frente ([::-1]).
Esses exercícios curtos cobrem as principais operações discutidas: criação de strings, obtenção de tamanho
com len(), índices (positivos e negativos), concatenação, composição (marcadores %, format() e fstrings), formatação (casas decimais, zeros à esquerda, alinhamento) e fatiamento. Eles podem ser feitos de
maneira rápida e vão dar uma boa revisão de cada tópico.
'''
palavra = "espelho"
print(palavra[::-1])