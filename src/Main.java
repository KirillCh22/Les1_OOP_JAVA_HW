import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        ////
        Circle circle = new Circle();
        circle.CalculateAreaCirc(4.5f);
        circle.CalculatePerimeterCirc(4.5f);
        String AreaCircle = circle.getOut("Площадь");
        System.out.println(AreaCircle);
        String PerimeterCircle = circle.getOut("Периметр");
        System.out.println(PerimeterCircle);

        ///
        Rectangle_HW rectangle_hw = new Rectangle_HW();
        System.out.println("/////////////////////////");
        rectangle_hw.CalculateAreaRec(6.7f, 9.3f);
        rectangle_hw.CalculatePerimeterRec(6.7f, 9.3f);
        String AreaRec = rectangle_hw.getOut("Площадь");
        System.out.println(AreaRec);
        String PerimeterRec = rectangle_hw.getOut("Периметр");
        System.out.println(PerimeterRec);


        ///
        Square_HW square_hw = new Square_HW();
        System.out.println("/////////////////////////");
        square_hw.CalculateAreaSquare(5.5f);
        square_hw.CalculatePerimeterSquare(5.5f);
        String AreaSquare = square_hw.getOut("Площадь");
        System.out.println(AreaSquare);
        String PerimeterSquare = square_hw.getOut("Периметр");
        System.out.println(PerimeterSquare);



    }
}
