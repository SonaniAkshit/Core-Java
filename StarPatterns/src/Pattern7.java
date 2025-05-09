import java.util.Scanner;

/* ⛰️ 7. Pyramid

         *
        ***
       *****
      *******
     *********

 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){

            //Spaces
            for(int j=0; j<num-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int l=0; l<2*i+1; l++){
                System.out.print("*");
            }
            //Spaces
            for(int k=0; k<num-i-1; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
