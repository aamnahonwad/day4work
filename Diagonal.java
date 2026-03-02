import java.util.*;

class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter " + (n*n) + " elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Primary Diagonal (top-left to bottom-right)
        System.out.print("\nPrimary Diagonal: ");
        for(int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");  // row = col
        }
        
        // Secondary Diagonal (top-right to bottom-left)
        System.out.print("\nSecondary Diagonal: ");
        for(int i = 0; i < n; i++) {
            System.out.print(matrix[i][n-1-i] + " ");  // row i, col = n-1-i
        }
        
        sc.close();
    }
}
