# MDC (mínimo divisor comum)
def calcMDC(a: int, b: int) -> int:
    while b != 0:
        t = b
        b = a % b
        a = t
    return a

t = int(input())
for i in range(t):
    entrada = list(map(int, input().split()))

    print(calcMDC(entrada[0], entrada[1]))