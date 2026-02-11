#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    const double notas[6] = {10000, 5000, 2000, 1000, 500, 200};
    const double moedas[6] = {100, 50, 25, 10, 5, 1};

    double n;
    cin >> n;
    n *= 100;

    cout << "NOTAS:" << "\n";
    for (int i=0; i < 6; i++) {
        int l = 0;

        while (n >= notas[i]) {
            n -= notas[i];
            l += 1;
        }

        cout << l << " nota(s) de R$ " << fixed << setprecision(2) << notas[i]/100 << "\n";
    }

    cout << "MOEDAS:" << "\n";
    for (int i=0; i < 6; i++) {
        int l = 0;

        while (n >= moedas[i]) {
            n -= moedas[i];
            l += 1;
        }

        cout << l << " moeda(s) de R$ " << fixed << setprecision(2) << moedas[i]/100 << "\n";
    }
    return 0;
}