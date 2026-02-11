#include <stdio.h>
#include <string.h>

#define TAM 103

int main(void) {
    int n;
    const int leds[10] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

    scanf("%d", &n);
    fflush(stdin);
    char nums[n+1][TAM];

    for (int i=0; i < n; i++) {
        fgets(nums[i], TAM, stdin);
        fflush(stdin);
    }

    for (int i=0; i < n; i++) {
        int Nleds = 0;
        for (size_t j=0; j < strlen(nums[i])-1; j++) {
            int pos = nums[i][j] - '0';

            Nleds += leds[pos];
        }
        printf("%d leds\n", Nleds);
    }

    return 0;
}