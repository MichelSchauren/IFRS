#include <stdio.h>

int main(void) {
    int h, m;
    int Hin, Min, Hfi, Mfi;
    scanf("%d %d %d %d", &Hin, &Min, &Hfi, &Mfi);

    h = Hfi - Hin;
    m = Mfi - Min;

    if (h < 0 || (h == 0 && m <= 0)) {
        h += 24;
    }

    if (m < 0) {
        m += 60;
        h -= 1;
    }

    printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h, m);

    return 0;
}