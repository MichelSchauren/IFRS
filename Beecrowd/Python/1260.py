# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''

casos = int(input())
input()
dics = []
quant_arvores = [0 for _ in range(casos)]

for caso in range(casos):
    dic_arvores = {}
    
    while True:
        try:
            nome = input()
            if nome == '': break
            
            if nome in dic_arvores:
                dic_arvores[nome] += 1
                quant_arvores[caso] += 1
            else:
                dic_arvores[nome] = 1
                quant_arvores[caso] += 1
        except:
            break

    dic_arvores = dict(sorted(dic_arvores.items()))
    dics.append(dic_arvores)

for i, dic in enumerate(dics):
    for arvore, quant in dic.items():
        percentual = quant/quant_arvores[i]
        print(f'{arvore} {percentual:.4f}')
    if i != casos-1:
        print()
