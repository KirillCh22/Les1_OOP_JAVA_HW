import static java.lang.Math.*;

public class Circle extends Figure {
    float Area, Perimeter;

    public Circle(float radius, float sideA, float sideB) {
        super(2.4f, 0, 0);
    }

    public Circle() {
        super(4.5f, 0,0);
    }

    @Override
    public float CalculateAreaCirc(float radius) {
        Area = (float) (PI * pow(radius, 2));

        return Area;
    }

    @Override
    public float CalculatePerimeterCirc(float radius) {
        Perimeter = (float) (2 * PI * radius);

        return Perimeter;
    }

    @Override
    public float CalculateAreaRec(float sideA, float sideB) {
        return 0;
    }

    @Override
    public float CalculatePerimeterRec(float sideA, float sideB) {
        return 0;
    }

    @Override
    public float CalculateAreaSquare(float sideA) {
        return 0;
    }

    @Override
    public float CalculatePerimeterSquare(float sideA) {
        return 0;
    }


    public String getOut(String choose) {
        String info = null;
        if (choose.equals("Площадь")) {
            info = "Площадь круга = " + Area;
        }
        else if (choose.equals("Периметр")) {
            info = "Периметр круга = " + Perimeter;
        }

        return info;
    }
}
