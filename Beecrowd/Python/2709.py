def verificar_primo(valor: int):
    if valor < 2:
        return False
    else:
        for n in range(2, valor//2+1):
            if valor % n == 0:
                return False
    return True

rodadas = []
while True:
    try:
        # Constantes
        quant_moedas = int(input())
        moedas = []

        for m in range(quant_moedas):
            moedas.append(int(input()))

        salto = int(input())

        # Calculos
        soma = 0
        for i in range(0, quant_moedas, salto):
            soma += moedas[-i-1]

        if verificar_primo(soma):
            rodadas.append(True)
            break
        else:
            rodadas.append(False)
            continue
                          
    except EOFError:
        break

for rodada in rodadas:
    if rodada:
        print("You’re a coastal aircraft, Robbie, a large silver aircraft.")
    else:
        print("Bad boy! I’ll hit you.")
