public class All_DataTypes {
    public static void main(String[] arg) {

        int int1 = -2147483648, int2 = 2147483647;
        byte byte1 = -128,  byte2 = 127;
        short short1  = -32768, short2 = 32767;
        double double1 = -1.23456e300d,double2 = 1.23456e300d;
        long long1 = -922337219, long2 = 999999999;
        boolean hello = true,hi = false;
        char char1 = 'A',char2 = 'z';
        String string = "Awais",string2 = "Hyder";

        System.out.println("Int: " + int1 + " to " + int2);
        System.out.println("Byte: " + byte1 + " to " + byte2);
        System.out.println("Short: " + short1 + " to " + short2);
        System.out.println("Double: " + double1 + " to " + double2);
        System.out.println("Long: " + long1 + " to " + long2);
        System.out.println("hello is " + hello + " Hi is " + hi);
        System.out.println("Char: " + char1 + " " + char2);
        System.out.println("String: " + string + " " + string2);

    }
}
