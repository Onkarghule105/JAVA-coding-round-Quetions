class p {
    public  void m1(int x,int y){
       int sum;
       sum=x+y;
       System.out.println(sum);
    }
}
class  c extends p{
    public void m2() {
        System.out.println("child");

    }
}
class Test{
    public static void main(String[] args) {
        p p=new p();
        p.m1(3,3);


        c c=new c();
        c.m2();
        c.m1(4,5);

    }
}
