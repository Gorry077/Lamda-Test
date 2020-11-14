package pack;

public interface FuncInterface {
     void abstractFun1(int x);
     void abstractFun2(int x);
    default void normalFun(){
        System.out.println("in normalFun() function");
    }
}
