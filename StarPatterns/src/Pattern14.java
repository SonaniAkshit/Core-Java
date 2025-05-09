import java.util.Scanner;

/* 🔠 14. Alphabet Triangle

    A
    A B
    A B C
    A B C D
    A B C D E

 */
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            for(char j='A';j<'A'+i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
