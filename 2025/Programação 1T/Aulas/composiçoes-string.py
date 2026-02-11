# Composição de Strings - 16/04/2025

nome = "Ada Lovelace"
ano = 1843
atual = 2025
percentual = 77.7
profissão = 'programadora'

# Composição com marcadores de %
print('%s é considerada a 1º %s.' %(nome, profissão))
print("Em %d, %s criou o código que hoje é considerado o 1º programa de computador." % (ano, nome))
print("No Brasil de %d as mulheres recebem apenas %.1f%% do salário médio dos homens." % (atual, percentual))

# Composição com o método .format()
print("No Brasil de {} as mulheres recebem apenas {:.1f}% do salário médio dos homens." .format(atual, percentual))

# %s serve para strings.
# %d serve para inteiros.
# %f serve para flooats.
