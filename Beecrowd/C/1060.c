#include <stdio.h>

int main(void) {
    short positivos = 0;

    for (short i = 0; i < 6; i++) {
        double n;
        scanf("%lf", &n);
        if (n > 0) positivos++;
    }

    printf("%d valores positivos\n", positivos);
}