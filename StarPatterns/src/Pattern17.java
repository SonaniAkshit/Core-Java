import java.util.Scanner;

/*🔠 17. Symmetrical Alphabet Pyramid

            A
          A B A
        A B C B A
      A B C D C B A
    A B C D E D C B A

 */
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            //spaces
            for(int j=0;j<num-i-1;j++){
                System.out.print("  ");
            }
            //alphabets
            char alphabet = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=0;j<i*2+1;j++){
                System.out.print(alphabet + " ");
                if(j<breakpoint) alphabet++;
                else alphabet--;
            }
            //spaces
            for(int j=0;j<num-i-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
