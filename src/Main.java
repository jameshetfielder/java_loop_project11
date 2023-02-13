import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberPiece;
        int count = 1;
        int number = 0;
        int maxNumber = 0;
        int minNumber = 0;
        int comp1 = 0;
        int comp2 = 0;
        int a = 0;
        boolean situation = true;

        System.out.print("Enter number of numbers: ");
        numberPiece = input.nextInt();

        do {
            if (count <= numberPiece) {
                System.out.print("Enter " + count + ". number:");
                number = input.nextInt();
                count++;
                if (a == 0) {
                    comp2 = number;
                    a++;
                }
                if (number > comp1) {
                    comp1 = number;
                    maxNumber = comp1;
                }
                if (comp2 >= number) {
                    comp2 = number;
                    minNumber = comp2;
                }
            } else situation = false;
        }
        while (situation);

        System.out.println("Max number is:" + maxNumber);
        System.out.print("Min number is:" + minNumber);
    }
}
