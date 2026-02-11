from decimal import Decimal, getcontext

getcontext().prec = 10

notas = list(map(Decimal, input().split()))
pesos = [2, 3, 4, 1]
media = Decimal('0')

for i, nota in enumerate(notas):
    nota_real = nota * Decimal(str((pesos[i]/10)))
    media += nota_real
    print(media)
print(f'Media: {media:.1f}')

if media >= 7:
    print('Aluno aprovado.')
elif media < 5:
    print('Aluno reprovado.')
elif 5 <= media < 7:
    print('Aluno em exame.')
    nota_exame = Decimal(input())
    media_final = (nota_exame + media)/2
    
    print(f'Nota do exame: {nota_exame:.1f}')
    if media_final >= 5:
        print('Aluno aprovado.')
    elif media_final < 5:
        print('Aluno reprovado.')
    print(f'Media final: {media_final:.1f}')
