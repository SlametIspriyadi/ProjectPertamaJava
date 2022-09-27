package projectpertama;


public class Bit {
    public static void main(String[] args) {
        int a=3, b=5, c;
        c = a&b;
        System.out.println("a AND b = " + c);
        c = a|b;
        System.out.println("a OR b = " + c);
        c = a^b;
        System.out.println("a Ex OR b " + c);
        c = ~a;
        System.out.println("not a= " +c);
        c = a<<2;
        System.out.println("a geser kiri = " +c);
        c = a>>2;
        System.out.println("a geser kanan = " + c);
    }
}
