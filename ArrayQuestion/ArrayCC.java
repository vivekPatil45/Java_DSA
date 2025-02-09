import java.util.Scanner;
public class ArrayCC {

    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
    
    public static void main(String[] args) {
        // int marks[] = new int[100];
        int marks[] = { 1, 2, 3, 4, 5 };

        Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks.length);

    }
}
