
public class SearchSortedMatrix {
    
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0, col = matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if(matrix[row][col] == key){
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Not find key");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;
        boolean j = staircaseSearch(matrix,key);
        
    }
}

/*
 * 1. Brute Force o(n^2)
 * 2. Row wise (nlogn)
 * 3. staircas search o(n+m)
 *      (0,m-1) (n-1,0 )
 */
