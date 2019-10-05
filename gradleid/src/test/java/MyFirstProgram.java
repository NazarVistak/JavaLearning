public class MyFirstProgram {
    public static void main(String[] args){
        hello("world");
        hello("user");
        double l=5;
        double a=4;
        double b=5;
        System.out.println("Площа квадрату зі стороною" + l + "=" + area(l) );
        System.out.println("Площа прямокутника =" + area(a,b));
    }
    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
    public static double area(double l) {
        return l*l;
    }
    public static double area(double a, double b) {
        return a*b;
    }
}
