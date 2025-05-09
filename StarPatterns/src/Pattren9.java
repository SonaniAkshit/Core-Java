import java.util.Scanner;

/*💎 9. Diamond

         *
        ***
       *****
      *******
     *********
     *********
      *******
       *****
        ***
         *
         
 */
public class Pattren9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num*2;i++){
            int spaces;
            int stars;

            //manage spaces according to i
            if(i<num) spaces = num-i-1;
            else spaces = i-num;

            //manage stars according to i
            if(i<num) stars = 2*i+1;
            else stars = 2 * (2 * num - i - 1) + 1;

            //print spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
