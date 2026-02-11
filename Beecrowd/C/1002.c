#include <stdio.h>

int main(void) {
    double n, raio, area;

    n = 3.14159;
    scanf("%lf", &raio);
    area = n * raio*raio;

    printf("A=%.4f\n", area);

    return 0;
}