from math import lcm as mmc

N = int(input())
nesticodes = list(range(1, N+1))
loxosceles = [aranha + N for aranha in nesticodes]

print(mmc(*loxosceles))
