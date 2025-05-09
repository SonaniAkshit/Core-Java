import java.util.Scanner;

/* 🔷 1. Solid Square

    *  *  *  *  *
    *  *  *  *  *
    *  *  *  *  *
    *  *  *  *  *
    *  *  *  *  *

*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("  *");
            }
            System.out.println(" ");
        }
    }
}
