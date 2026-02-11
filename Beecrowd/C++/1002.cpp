#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {
    const double n = 3.14159;
    double raio;
    cin >> raio;

    double area = n * pow(raio, 2);

    cout << "A=" << fixed << setprecision(4) << area << "\n";
}