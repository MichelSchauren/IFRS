'''
17) Faça um Programa que peça um número correspondente a um determinado ano e em seguida
informe se este ano é ou não bissexto.
'''
while True:
    try:
        ano = int(input('Digite um ano: '))
    except:
        print('Algo deu errado! Digite novamente.')
        continue
    else:
        if (ano/4*10)//10 == ano/4:
            if (ano/100*10)//10 == ano/100:
                if (ano/400*10)//10 == ano/400:
                    print('Esse ano é bissexto.')
                else:
                    print('Esse ano não é bissexto.')
            else:    
                print('Esse ano é bissexto.')
        else:
            print('Esse ano não é bissexto.')
        break