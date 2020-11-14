package pack;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = new FuncInterface() {
            @Override
            public void abstractFun1(int x) {
                System.out.println(2 * x);
            }

            @Override
            public void abstractFun2(int x) {
                System.out.println(x);
            }
        };
        Scanner sc = new Scanner(System.in, "Windows-1250");
        int y = sc.nextInt();
        // This calls above lambda expression and prints 10.
        fobj.abstractFun1(y);
        fobj.abstractFun2(y);
        fobj.normalFun();
        sc.close();
    }
}
