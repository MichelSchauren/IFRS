#include <stdio.h>
#include <stdlib.h>

int main(void) {
    const char *meses[12] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    int mes;
    if (scanf("%d", &mes) != 1) return 0;
    if (mes < 1 || mes > 12) return 0;

    printf("%s\n", meses[mes-1]);
    system("pause");
    return 0;
}