import java.util.Scanner;

/*🔠 16. Same Alphabet Triangle

    A
    B B
    C C C
    D D D D
    E E E E E

 */
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        char ch = 'A';
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
