package NonStaticMethod;
public class Nonstaticmain {
    public static void main(String[] args) {
        int n=12,m=13;
        NonStaticMethod result=new NonStaticMethod();
        int s=result.sum(n,m);
        System.out.println(s);
    }
}
