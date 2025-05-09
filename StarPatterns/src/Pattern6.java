import java.util.Scanner;

/*🔽 6. Inverted Number Triangle

    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
