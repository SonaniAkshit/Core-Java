import java.util.Scanner;

/*🔢 13. Number Sequence Triangle

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

 */
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int count = 1;
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
