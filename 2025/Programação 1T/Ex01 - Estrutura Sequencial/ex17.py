# 17) Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
# quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros
# quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6
# litros, que custam R$ 25,00.

metros = float(input('Digite quantas m² você deseja pintar:'))
litros = metros/6
latas = int(litros/18)+1
galões = int(litros*0.2777)+1
preçoLatas = latas*80
preçoGalões = galões*25

print(f'Latas necessarias: {latas}')
print(f'Preço: R${preçoLatas:.2f}')
print(f'Galões necessarios: {galões}')
print(f'Preço: R${preçoGalões:.2f}')
