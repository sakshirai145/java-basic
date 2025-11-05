

// PRINT N NATURAL NUMBERS

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             System.out.println(i);
//         }

//     }
// }





//-------------------------------------------------------------------------------------
// PRINT REVERSSE OF A NUMBER USING WHILE LOOP

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to reverse: ");
//     int num = sc.nextInt();
//     int reversed = 0;
//     while (num != 0) {
//         int digit = num % 10;
//         reversed = reversed * 10 + digit;
//         num /= 10;
//     }
//     System.out.println("Reversed number: " + reversed);
        
//     }
// }
    
//-------------------------------------------------------------------------------------
// REVERSE A NUMBER USING FOR LOOP
// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int rev = 0;

//         // Using for loop
//         for (; num != 0; num = num / 10) {
//             int digit = num % 10;   // get last digit
//             rev = rev * 10 + digit; // build reverse number
//         }

//         System.out.println("Reversed number: " + rev);

//         sc.close();
//     }
// }
//-------------------------------------------------------------------------------------


// CHECK IF A NUMBER IS PRIME OR NOT



// import java.util.Scanner;

// public class loop {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         boolean n = isPrime(num);
//         if(n){
//             System.out.println("It is a prime number");
//         }
//         else{
//             System.out.println("It is not a prime number");
//         }
//         sc.close();
//     }

//     // Method to check if a number is prime
//     public static boolean isPrime(int n) {
//         if (n <= 1) return false;
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
// }

//-------------------------------------------------------------------------------------

// PRINT FIBONACCI SERIES UPTO N TERMS

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // Number of terms in the Fibonacci series
//         System.out.print("Enter the number of terms for Fibonacci series: ");
//         int n = sc.nextInt();
//         int a = 0, b = 1;

//         System.out.print("Fibonacci Series up to " + n + " terms: ");
//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }



//-------------------------------------------------------------------------------------


// FACTORIAL OF A NUMBER

// import java.util.Scanner;

// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // Number to calculate factorial
//         System.out.print("Enter a number to calculate factorial: ");
//         int num = sc.nextInt();
//         long factorial = 1;

//         for (int i = 1; i <= num; i++) {
//             factorial *= i; // Multiply i to the factorial
//         }

//         System.out.println("Factorial of " + num + " is: " + factorial);
//     }
// }

