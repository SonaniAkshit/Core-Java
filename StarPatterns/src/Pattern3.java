import java.util.Scanner;

/* 🔢 3. Increasing Number Triangle

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
