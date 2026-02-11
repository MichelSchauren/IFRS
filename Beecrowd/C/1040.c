#include <stdio.h>

int main(void) {
    int pesos[5] = {2, 3, 4, 1};
    float notas[5];
    float media = 0;

    for(int i = 0; i < 4; i++) {
        scanf("%f", &notas[i]);
        notas[i] *= pesos[i];
        media += notas[i];
    }

    printf("Media: %.1f\n", media / 10);

    if (media >= 70) {
        printf("Aluno aprovado.\n");
    } else if (media >= 50) {
        printf("Aluno em exame.\n");
        printf("Nota do exame: ");

        float exame;
        scanf("%f", &exame);
        printf("%.1f\n", exame);
        media = (media + exame*10) / 2;

        if (media >= 50) {
            printf("Aluno aprovado.\n");
        } else {
            printf("Aluno reprovado.\n");
        }
        printf("Media final: %.1f\n", media / 10);
        
    } else {
        printf("Aluno reprovado.\n");
    }

    return 0;
}