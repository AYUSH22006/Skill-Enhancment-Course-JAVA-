public class array_2d_ {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; 

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j; 
            }
        }

        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
