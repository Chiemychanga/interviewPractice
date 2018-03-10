#include <iostream>
using namespace std;

//What is the time complexity of this function?
bool isPrime(int n) {
  for (int x = 2; x * x <= n; x++) {
    cout << n << "%" << x << "=" << (n%x) << endl;
    if (n % x == 0) {
      return false;
    }
  }
  return true;
}
//The for loop will start when x = 2 and when x*x = n. 
//Or in other words, it stops when x = sqrt(n).
//This runs in O(sqrt(n)) time.

int main() {
  int n = 0;
  do {
    cout << "Enter a number to check if it is a prime:";
    cin >> n; cin.ignore(100,'\n'); 
  }while(!isPrime(n));
  return 0;
}
