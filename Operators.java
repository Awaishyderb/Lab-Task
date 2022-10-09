public class Operators {

    public static void main(String[] arg){

//  Arithmetic Operators
        int a = 25 , b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
//  Logical Operators
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(a & b);
        System.out.println(a | b);
//  Assignment operators
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a /= b);
        System.out.println(a *= b);
        System.out.println(a %= b);
//  Increment & decrement Operators
        System.out.println("Post Increment" + a++);
        System.out.println("Post Decrement" + a--);
        System.out.println("Pre Increment" + ++a);
        System.out.println("Pre Decrement" + --a);

    }

}
