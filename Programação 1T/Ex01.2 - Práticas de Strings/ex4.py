# 4) Composição com Marcadores (%)
'''
1. Marcação simples
• Crie as variáveis:
nome = "Alice"
idade = 20
• Imprima uma frase do tipo: "Alice tem 20 anos." usando %s, %d e o operador %.
• Experimente controlar a quantidade de casas do número, fazendo com que idade apareça
com 4 casas (e zeros a esquerda).
'''
nome = 'Alice'
idade = 20
print('%s tem %.4f anos.' %(nome, idade))

'''
2. Formatando float
• Crie a variável:
porcentagem = 79.567
• Imprima a frase:
"Atualmente, as mulheres recebem 79.57% do salário médio dos homens."
usando um marcador %.2f para o valor de porcentagem.
'''
porcentagem = 79.567
print('Atualmente, as mulheres recebem %.2f%% do salário médio dos homens.' %(porcentagem))