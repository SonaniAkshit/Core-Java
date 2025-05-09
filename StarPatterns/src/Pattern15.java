import java.util.Scanner;

/* 🔠 15. Inverted Alphabet Triangle

    A B C D E
    A B C D
    A B C
    A B
    A

 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            for(char j='A';j<'A'+num-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
