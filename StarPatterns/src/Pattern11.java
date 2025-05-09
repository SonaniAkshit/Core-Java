import java.util.Scanner;

/*🔢 11. Binary Triangle

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

 */
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int printNum;
        for(int i=1;i<=num;i++){
            if(i%2 == 0) printNum = 0;
            else printNum = 1;

            for(int j=0;j<i;j++){
                System.out.print(" "+printNum);
                printNum = 1 - printNum;
            }
            System.out.println();
        }
    }
}
