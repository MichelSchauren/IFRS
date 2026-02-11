#include <stdio.h>

int main(void) {
    const float notas[6] = {10000, 5000, 2000, 1000, 500, 200};
    const float moedas[6] = {100, 50, 25, 10, 5, 1};
    float n;

    scanf("%f", &n);
    n *= 100;

    // Notas
    printf("NOTAS:\n");
    for (int i=0; i < 6; i++) {
        int l = 0;

        while (n >= notas[i]) {
            n -= notas[i];
            l += 1;
        }

        printf("%d nota(s) de R$ %.2f\n", l, notas[i]/100);
    }

    // Moedas
    printf("MOEDAS:\n");
    for (int i=0; i < 6; i++) {
        int l = 0;

        while (n >= moedas[i]) {
            n -= moedas[i];
            l += 1;
        }

        printf("%d moeda(s) de R$ %.2f\n", l, moedas[i]/100);
    }

    return 0;
}