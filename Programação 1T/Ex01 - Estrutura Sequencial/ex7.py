# 7) Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

lado = float(input('Quantos cm tem o lado do seu quadrado?'))
area = lado**2
dobroArea = area*2

print(f'A área do seu quadrado é {area}cm²')
print(f'O dobro da área do seu quadrado é {dobroArea}cm²')
