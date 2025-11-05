// PATTERN PRINTING - PYRAMID(star pattern pyramid)
// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         // Outer loop for each row
//         for (int i = 1; i <= n; i++) {
//             // Inner loop for printing spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             // Inner loop for printing stars
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             // Move to the next line after each row
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------------------------------------
// PATTERN PRINTING - INVERTED PYRAMID(star pattern inverted pyramid)

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         // Outer loop for each row
//         for (int i = n; i >= 1; i--) {
//             // Inner loop for printing spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             // Inner loop for printing stars
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             // Move to the next line after each row
//             System.out.println();
//         }
//     }
// }



//-------------------------------------------------------------------------------------

// PATTERN PRINTING - HOLLOW PYRAMID(star pattern hollow pyramid)

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         // Outer loop for each row
//         for (int i = 1; i <= n; i++) {
//             // Inner loop for printing spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             // Inner loop for printing stars and spaces
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 if (k == 1 || k == (2 * i - 1) || i == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             // Move to the next line after each row
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------------------------------------

// PATTERN PRINTING - DIAMOND(star pattern diamond)

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         // Upper half of the diamond
//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // Lower half of the diamond
//         for (int i = n - 1; i >= 1; i--) {
//             // Print leading spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------------------------------------

// PATTERN PRINTING - HOLLOW DIAMOND(star pattern hollow diamond)

// public class patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         // Upper half of the hollow diamond
//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             // Print stars and spaces
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 if (k == 1 || k == (2 * i - 1)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         // Lower half of the hollow diamond
//         for (int i = n - 1; i >= 1; i--) {
//             // Print leading spaces
//             for (int j = n; j > i; j--) {
//                 System.out.print(" ");
//             }
//             // Print stars and spaces
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 if (k == 1 || k == (2 * i - 1)) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//-------------------------------------------------------------------------------------
