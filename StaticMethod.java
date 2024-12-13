public class StaticMethod {
    public static void main(String[] args) {
        int n=5;
        int m=10;
        int result=sum(n, m);
        System.out.println(result);
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
}
