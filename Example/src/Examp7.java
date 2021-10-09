public class Examp7 {
    public static void main(String[] args) {
        new B2(2,3).add();
    }
}

class B1{
    private int a=10;
    protected int b=30;

    public B1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    protected void sum(int a,int b){
        new B1(a,b).get();
    }

    private void get(){
        System.out.println(a+b);
    }
}

class B2 extends B1{
    private B2(int a, int b){
        super(a,b);
    }

    protected int c=10;

    protected void add(){
        sum(10,20);
    }
}
