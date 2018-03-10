class isPrime{
  //What is the time complexity of this function?
  public static boolean isPrime(int n) {
    for (int x = 2; x * x <= n; x++) { //x <= sqrt(n) is the same
      System.out.println(n + " % " + x + " = " + n%x);
      if (n % x == 0) {
        System.out.println(n + " is a NOT a prime!");
        return false;
      }
    }
    System.out.println(n + " is a prime!");
    return true;
  }
  //The for loop will start when x = 2 and when x*x = n. 
  //Or in other words, it stops when x = sqrt(n).
  //This runs in O(sqrt(n)) time.

  public static void main(String[] args) {
    System.out.println("Enter a number to check if it is a prime:");
    int n;
    do {
      n = Integer.parseInt(System.console().readLine());
    } while(isPrime(n) == false);
  }
}
