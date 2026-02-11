'''
18) Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma
data válida.
'''

meses30 = [4, 6, 9, 11]
meses31 = [1, 3, 5, 7, 8, 10, 12]
fevereiro = 2

def É_bissexto(a):
    if (a/4*10)//10 == a/4:
        if (a/100*10)//10 == a/100:
            if (a/400*10)//10 == a/400:
                return True
            else:
                return False
        else:    
            return True
    else:
        return False


try:
    data = input('Digite uma data no formato dd/mm/aaaa: ')

    dia = int(data[:2])
    mes = int(data[3:5])
    ano = int(data[6:])
except:
    print('Data inválida!')
else:
    if 0 < ano <= 9999 and data[2] == data[5] == '/':
        if mes in meses30 and 0 < dia <= 30:
            print('Data válida!')
        elif mes in meses31 and 0 < dia <= 31:
            print('Data válida!')
        elif mes == fevereiro and 0 < dia <= 29:
            if dia == 29 and not É_bissexto(ano):
                print('Data inválida!')
                print('[ O dia é 29 de fevereiro de um ano não bissexto. ]')
            else:
                print('Data válida!')
        else:    
            print('Data válida!')
    else:
        print('Data inválida!')