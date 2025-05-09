import java.util.Scanner;

/*❌ 20. X

    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * *
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *

 */
public class Pattern20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        int space = 2*num-2;
        for(int i=0;i<num*2-1;i++){
            int stars = 0;
            if(i<num) stars = i+1;
            else stars = (num*2)-i-1;
            //stars
            for(int j=0;j<stars;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=0;j<stars;j++){
                System.out.print("* ");
            }
            if(i<num-1) space -= 2;
            else space+=2;
            System.out.println();
        }
    }
}
