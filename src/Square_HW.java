import static java.lang.Math.*;

public class Square_HW extends Figure {
    float Area, Perimeter;

    public Square_HW(float radius, float sideA, float sideB) {
        super(0, 2.3f, 0);
    }

    @Override
    public float CalculateAreaCirc(float radius) {
        return 0;
    }

    @Override
    public float CalculatePerimeterCirc(float radius) {
        return 0;
    }

    @Override
    public float CalculateAreaRec(float sideA, float sideB) {
        return 0;
    }

    @Override
    public float CalculatePerimeterRec(float sideA, float sideB) {
        return 0;
    }

    public Square_HW() {
        super(0, 2.3f, 0);
    }


    @Override
    public float CalculateAreaSquare(float sideA) {
        Area = (float) (pow(sideA, 2));

        return Area;
    }

    @Override
    public float CalculatePerimeterSquare(float sideA) {
        Perimeter = (float) (4 * sideA);

        return Perimeter;
    }

    public String getOut(String choose) {
        String info = null;
        if (choose.equals("Площадь")) {
            info = "Площадь квадрата = " + Area;
        }
        else if (choose.equals("Периметр")) {
            info = "Периметр квадрата = " + Perimeter;
        }

        return info;
    }
}
