intervalos = {
    (0, 2000): 0,
    (2000.01, 3000): 0.08,
    (3000.01, 4500): 0.18,
    (4500): 0.28
    }

salario = float(input())
imposto = 0

for i, intervalo in enumerate(intervalos.keys()):
    if intervalo[0] <= salario <= intervalo[1]:
        for percentual in intervalos.values():
            print(percentual)
