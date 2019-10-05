package JavaLearning;

public class MyFirstProgram {
    public static void main(String[] args){
        hello("world");
        hello("user");

        Square s = new Square(5);
        Rectangle r = new Rectangle(4,5);

        System.out.println("Площа квадрату зі стороною" + s.l + "=" + area(s) );
        System.out.println("Площа прямокутника =" + area(r));
    }
    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
    public static double area(Square s) {
        return s.l*s.l;
    }
    public static double area(Rectangle r) {
        return r.a*r.b;
    }
}
