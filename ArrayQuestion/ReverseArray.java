public class ReverseArray {

    public static void reverse(int num[]){
        int s = 0, l = num.length - 1;
        
        while(s<=l){
            int temp = num[l];
            num[l] = num[s];
            num[s] = temp;
            s++;
            l--;
        }


    }
    public static void main(String[] args) {
        
        int num[] = {2,4,6,8,10};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}