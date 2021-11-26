public class MethodHiding {
    public static void main(String[] args) {
        s1 ss = new s1();
        ss.run();
    }
}
class s{
     static void  run(){
         System.out.println("He is running");

    }
}
class s1 extends s{
    static void run(){
        System.out.println("he is also running");
    }
}
