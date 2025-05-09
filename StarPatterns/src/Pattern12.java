import java.util.Scanner;

/*🔷 12. Symmetrical Number Pyramid

    1                 1
    1 2             2 1
    1 2 3         3 2 1
    1 2 3 4     4 3 2 1
    1 2 3 4 5 5 4 3 2 1

 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int intialSpace = num*2-2;
        for(int i=0;i<num;i++){
            //printing numbers
            for(int j=0;j<i+1;j++){
                System.out.print(j+1 + " ");
            }
            //printing spaces
            for(int j=0;j<intialSpace;j++){
                System.out.print("  ");
            }
            //printing numbers
            for(int j=i+1;j>0;j--){
                System.out.print(j + " ");
            }

            intialSpace -= 2;
            System.out.println();
        }
    }
}
