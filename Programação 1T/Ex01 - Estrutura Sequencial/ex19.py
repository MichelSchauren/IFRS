# 19) Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de
# um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo
# usando este link (em minutos).

tamanhoArquivo = float(input('Digite o tamanho do arquivo em MB: '))
velocidadeLink = float(input('Digite a velocidade do link em Mbps:'))

tempo = tamanhoArquivo/velocidadeLink/60

print(f'O tempo aproximado de dawload do arquivo é de {tempo:.0f} minutos.')