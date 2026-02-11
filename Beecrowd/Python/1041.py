ponto = tuple(map(float, input().split()))
x = ponto[0]
y = ponto[1]

if ponto == (0, 0):
    print('Origem')
elif y == 0:
    print('Eixo X')
elif x == 0:
    print('Eixo Y')
elif x > 0 and y > 0:
    print('Q1')
elif x < 0 and y > 0:
    print('Q2')
elif x < 0 and y < 0:
    print('Q3')
elif x > 0 and y < 0:
    print('Q4')
