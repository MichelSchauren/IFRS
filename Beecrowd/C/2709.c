// Desisti do desafio, começou a sair erro do nada! Sendo que o código ta funcionando.

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <stdint.h>
#include <locale.h>

bool eh_primo(long long n) {
    if (n < 2) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;

    for (long long i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
}

int main(void) {
    int n, passo;
    long long res;

    int *moedas = NULL;
    size_t cap = 0;

    while (scanf("%d", &n) == 1) {
        if ((size_t)n > cap) {
            int *tmp = realloc(moedas, n * sizeof(int));
            if (!tmp) { free(moedas); return 1; }
            moedas = tmp;
            cap = n;
        }

        for (int i = 0; i < n; i++) {
            scanf("%d", &moedas[i]);
        }

        if (scanf("%d", &passo) != 1) break;
        if (passo == 0) continue;

        res = 0;
        for (int j = n-1; j > 0; j -= passo) {
            res += moedas[j];
        }

        if (eh_primo(res)) {
            printf("You\xE2\x80\x99re a coastal aircraft, Robbie, a large silver aircraft.\n");
            break;
        } else {
            printf("Bad boy! I\xE2\x80\x99ll hit you.\n");
        }
    }

    free(moedas);
    return 0;
}