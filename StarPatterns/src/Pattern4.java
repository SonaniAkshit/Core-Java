import java.util.Scanner;

/* 🔢 4. Same Number Triangle

    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5

 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0 ; j<i+1; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}
