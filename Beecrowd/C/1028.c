#include <stdio.h>

// MDC (min divisor comum)
unsigned short calcMDC(unsigned short a, unsigned short b) {
    unsigned short t;
    while (b != 0) {
        t = b;
        b = a % b;
        a = t;
    }
    return a;
}

int main (void) {
    unsigned int t;
    scanf("%hu", &t);
    unsigned short output[t];

    for (unsigned int i = 0; i < t; i++) {
        unsigned short a, b;
        scanf("%hu %hu", &a, &b);

        output[i] = calcMDC(a, b);
    }

    // imprimir todos os resultados
    for (unsigned int i = 0; i < t; i++) {
        printf("%hu\n", output[i]);
    }
}