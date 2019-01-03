import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<num; i++) {
            if(prime(arr[i])){
                count++;
            }
        }

        System.out.println(count);
    }
    public static boolean prime(int n) {
        if(n<2) {
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i ==0) {
                return false;
            }
        }
        return true;
    }

}
