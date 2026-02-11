def calcular_triangulo(a, b, c):
    if max(a, b, c) >= a+b+c - max(a, b, c):
        return -1
    else:
        return a+b+c

def calcular_trapezio(a, b, c):
    area = (a + b)*c/2
    return area

A, B, C = map(float, input().split())

perimetro_tri = calcular_triangulo(A, B, C)

if perimetro_tri > 0:
    print(f'Perimetro = {perimetro_tri:.1f}')
else:
    area_tra = calcular_trapezio(A, B, C)
    print(f'Area = {area_tra:.1f}')
