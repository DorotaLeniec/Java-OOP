package figury;

/**
 * Created by dorka on 13.07.2017.
 */
public class FigureTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(2);

        Figure[] figures = {new Circle(2), new Square(2), new Triangle(4,5,6)};
        for (Figure figure : figures) {
            System.out.println(figure.countArea());
            System.out.println(figure.countCircumference());
        }


        System.out.println("Pole kola "+circle.countArea());
        System.out.println("Obwód koła "+circle.countCircumference());
        System.out.println("Pole kwadratu "+square.countArea());
        System.out.println("Obwód kwadratu "+square.countCircumference());

    }
}
