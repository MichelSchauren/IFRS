# 9) Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a
# temperatura em graus Celsius.

grausF = float(input('Grau Fahrenheit:'))
grausC = (grausF-32)*5/9

print(f'Grau Celsius:{grausC:.1f}')
