import java.util.Scanner;

public class Cpn_program {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        float matric = 0,inter = 0,test = 0,cpn;


        System.out.println("Enter your Matric Percentage");
        matric = scanner.nextFloat();
        matric = matric * 0.1f;

        System.out.println("Enter your Intermediate Percentage");
        inter = scanner.nextFloat();
        inter = inter * 0.2f;

        System.out.println("Enter Your Test Marks");
        test = scanner.nextInt();
        test = test * 0.7f;

        cpn = matric + inter + test;
        System.out.println("Your CPN is: " + cpn);

    }
}
