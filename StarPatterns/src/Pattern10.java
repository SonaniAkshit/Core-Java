import java.util.Scanner;

/*⏳ 10. Hourglass Triangle

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

 */
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        for(int i=0;i<num*2-1;i++){
            int stars;

            if(i<num) stars = i+1;
            else stars = 2 * num - i - 1;

            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
