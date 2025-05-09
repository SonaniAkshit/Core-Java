import java.util.Scanner;

/* 🔠 18. Reverse Alphabet Triangle

    E
    D E
    C D E
    B C D E
    A B C D E

 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            char start = 'A';
            start += (num - i -1);
            for(int j=0;j<i+1;j++){
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}
