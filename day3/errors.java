public class errors {

    private String s;
    private int age;

    public errors() {
        s = "";
        age = 0;

    }
    public errors(String n, int a) {
        this.s = n;
        this.age = a;
    }
    public void dis() {
        System.out.println(s +  " , " + age);
    }

    public static void main(String[] args) {
        errors o = new errors();
        o.dis();
        errors o1 = new errors("s", 100);
        o1.dis();

    }

}
