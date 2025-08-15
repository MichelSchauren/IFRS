# 18) Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3
# situações:
# • Comprar apenas latas de 18 litros;
# • Comprar apenas galões de 3,6 litros;
# • Misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e
# sempre arredonde os valores para cima, isto é, considere latas cheias.

metros = float(input('Digite quantas m² você deseja pintar:'))
litros = metros/6
latas = int(litros/18)+1
galões = int(litros/3.6)+1
preçoLatas = latas*80
preçoGalões = galões*25

l = int(litros/18)
g = int((litros-l*18)*0.2777) + 1
ldesperdicio = latas*18 - litros
gdesperdicio = galões*3.6 - litros
lgdesperdicio = l*18 + g*3.6 - litros
preço = int(l*80 + g*25)

print(f'Se você comprar {latas*18} litros em latas você pagará R${preçoLatas:.2f} e desperdiçará {ldesperdicio:.1f} litros de tinta')
print(f'Se você comprar {galões*3.6} litros em galões você pagará R${preçoGalões:.2f} e desperdiçará {gdesperdicio:.1f} litros de tinta.')
print(f'Porém se você comprar {l} latas e {g} galões você pagará R${preço:.2f} e desperdiçará {lgdesperdicio:.1f} litros de tinta.')
