#include <stdio.h>
#include <string.h>

int main(void) {
    int n;

    scanf("%d", &n);
    char msgs[n+1][1000];

    for (int i=0; i <= n; i++) {
        fgets(msgs[i], 1000, stdin);
        msgs[i][strcspn(msgs[i], "\n")] = '\0';
    }

    for (int i=0; i <= n; i++) {
        for (size_t j=0; j < strlen(msgs[i]); i++) {
            msgs[i][j] += 1;
        }

        printf("%s\n", msgs[i]);
    }

    return 0;
}