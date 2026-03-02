import java.util.*;

class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();
        
        boolean found = false;
        int index = -1;  // Use 'index' not 'position'
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == search) {
                found = true;
                index = i;  // This stores the actual array index (0, 1, 2...)
                break;
            }
        }
        
        if(found) {
            System.out.println("Element Found at index " + index);  // Shows 0, 1, 2...
        } else {
            System.out.println("Element Not Found");
        }
        
        sc.close();
    }
}
