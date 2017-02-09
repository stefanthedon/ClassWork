package subtractdemo;

import java.util.Scanner;

public class SubtractDemo {
    
    public static int Subtract(int a, int b){
        int sub = b - a;
        return sub;
    }
    
    private static Scanner ab=new Scanner (System.in);

        public static void main(String[] args) {
            System.out.println("Input first number");
            String a = ab.nextLine();
            int b = Integer.parseInt(a);
            System.out.println("Second Number");
            String d = ab.nextLine();
            int c = Integer.parseInt(d);
            
            System.out.println("Subtraction result = " + Subtract(b,c));
            
    }
    
}
