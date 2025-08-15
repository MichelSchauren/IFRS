'''
19) Crie um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de
centenas, dezenas e unidades do mesmo. Observando os termos no plural a colocação do "e",
da vírgula, entre outros. Exemplo:
• 326 = 3 centenas, 2 dezenas e 6 unidades
• 12 = 1 dezena e 2 unidades
• Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16.
'''

def Tem_s(n):
    if n == 1:
        return ''
    else:
        return 's'

try:
    numero = int(input('Digite uma número de 0 à 999: '))
except:
    print('Número inválido!')
else:
    if 0 <= numero < 1000:
        resultado = f'{numero} = '
        if numero >= 100:
            centena = f'{str(numero)[-3]} centena{Tem_s(int(str(numero)[-3]))}, '
            resultado += centena
        if numero >= 10:
            dezena = f'{str(numero)[-2]} dezena{Tem_s(int(str(numero)[-2]))} e '            
            resultado += dezena
        unidade = f'{str(numero)[-1]} unidade{Tem_s(int(str(numero)[-1]))}.'
        resultado += unidade

        print(resultado)
    else:
        print('Número inválido!')