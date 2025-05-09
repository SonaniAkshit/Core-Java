import java.util.Scanner;

/*❌ 19. Cross

    * * * * * * * * * *
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *
    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * *

 */
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        // upper triangle
        for(int i=0;i<num;i++){
            //stars
            for(int j=0;j<num-i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0;j<2*i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=0;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower triangle
        int space = 2*num-2;
        for(int i=0;i<num;i++){
            //stars
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            space -= 2;
            System.out.println();
        }
    }
}
