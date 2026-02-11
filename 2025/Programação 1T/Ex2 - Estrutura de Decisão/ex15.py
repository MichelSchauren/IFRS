''''
15) Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os
valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é:
equilátero, isósceles ou escaleno. Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
• Triângulo Equilátero: três lados iguais;
• Triângulo Isósceles: quaisquer dois lados iguais;
• Triângulo Escaleno: três lados diferentes;
'''

while True:
    try:
        lado1 = float(input('Digite a medida do primeiro lado do triângulo: '))
        lado2 = float(input('Digite a medida do segundo lado: '))
        lado3 = float(input('Digite a medida do terceiro lado: '))
    except (ValueError, TypeError):
        print('Epra digitar número, não letra seu retarnado!!!')
        print('Agora ve se digita certo.')
        continue
    except:
        print('Algo deu errado! Tente novamente.')
        continue
    else:
        if 0 >= lado1 or 0 >= lado2 or 0 >= lado3:
            print('Esse triângulo não existe!')
            break
        elif lado1 == lado2 == lado3:
            print('O triângulo é equilátero!')       
        elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
            print('O triângulo é isóceles!')
        else:
            print('O triângulo é escaleno!')

        if lado1**2 + lado2**2 + lado3**2 == 2*max(lado1, lado2, lado3)**2:
            print('Além disso, é um triângulo retângulo!')
        break