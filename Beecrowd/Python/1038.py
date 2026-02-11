compra = list(map(int, input().split()))
produtos = [0, 4, 4.5, 5, 2, 1.5]

total = produtos[compra[0]]*compra[1]
print(f'Total: R$ {total:.2f}')
