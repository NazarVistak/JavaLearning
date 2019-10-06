package JavaLearning;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");

        Square s = new Square(5);
        Rectangle r = new Rectangle(4, 5);

        System.out.println("Площа квадрату зі стороною" + s.l + "=" + s.area());
        System.out.println("Площа прямокутника =" + r.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
}
