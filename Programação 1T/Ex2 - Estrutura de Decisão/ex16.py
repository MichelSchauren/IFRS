'''
16) Faça um programa que calcule as raízes de uma equação do segundo grau (equação quadrática),
na forma ax² + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências,
informando ao usuário nas seguintes situações:
• Se o usuário informar o valor de a igual a zero, a equação não é do segundo grau e o programa não
deve fazer pedir os demais valores, sendo encerrado;
• Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o
programa;
• Se o delta calculado for igual a zero a equação possui somente uma raiz real; informe-a ao usuário;
• Se o delta for positivo, a equação possui duas raízes reais; informe-as ao usuário;
'''

print('Vamos resolver uma equação de segundo grau.')
print('Com base na formula ( ax² + bx + c = 0)')

def desenhar():
    print('''
    ax² + bx + c = 0
          
    Se (a = 0) então:
    0x² + bx + c = 0
          
    0 vezez qualquer coisa é 0, então:
    0 + bx + c = 0
    bx + c = 0 => E isso é uma equação do primeiro grau. ENTENDEU!
          
    se não entendeu pega na minha e balança.
''')

while True:
    try:
        a = float(input('Informe a variável (a): '))
        if a == 0:
            print('Se (a = 0) então não é uma equação do segundo grau. ')
            desenhe = input('Entendeu ou quer que desenhe? ')
            if desenhe == 'desenha' or desenhe == 'sim' or desenhe == 'desenhe':
                desenhar()
            break

        b = float(input('Informe a variável (b): '))
        c = float(input('Informe a variável (c): '))
    except (ValueError, TypeError):
        print('Epra digitar um número seu merda!')
        continue
    except:
        print('Algo deu errado! TENTE NOVAMENTE.')
        continue
    else:
        delta = b**2 - 4*a*c
        x1 = (-b + delta**(1/2))/2
        x2 = (-b - delta**(1/2))/2

        if delta < 0:
            print('A equação não possui raizes reais.')
        elif delta == 0:
            print('A equação só possui 1 raiz real.')
            print(f'x = {x1}')
        else:
            print(f"x' = {x1:.3f}")
            print(f'x" = {x2:.3f}')
        break

