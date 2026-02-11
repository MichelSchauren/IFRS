N = int(input())
while N != 0:
    strings = []
    
    for i in range(N):
        string = input()
        strings.append(string)
        
    strings.sort(key=len)

    verificados = {}
    for string in strings:
        verificados[string] = 1

        ramificacoes = [0]
        for key, r in verificados.items():
            if key in string and key != string:
                ramificacoes.append(r)
                
        verificados[string] += max(ramificacoes)

    print(verificados)
    print(max(verificados.values()))
    N = int(input())

'''
while True:
    N = int(input())
    if N == 0:
        break

    strings = [input().strip() for _ in range(N)]
    strings.sort(key=len)

    verificados = {}
    for string in strings:
        max_r = 0
        for key, r in verificados.items():
            if key in string and key != string and r > max_r:
                max_r = r
        verificados[string] = 1 + max_r

    print(max(verificados.values()))
'''

