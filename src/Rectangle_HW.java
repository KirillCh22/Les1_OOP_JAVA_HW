public class Rectangle_HW extends Figure {
    float Area, Perimeter;

    public Rectangle_HW(float radius, float sideA, float sideB) {
        super(0, 2.3f, 5.3f);
    }

    @Override
    public float CalculateAreaCirc(float radius) {
        return 0;
    }

    @Override
    public float CalculatePerimeterCirc(float radius) {
        return 0;
    }


    public Rectangle_HW() {
        super(0, 4.5f, 8.6f);
    }

    @Override
    public float CalculateAreaRec(float sideA, float sideB) {
        Area = (float) (sideA * sideB);

        return Area;
    }

    @Override
    public float CalculatePerimeterRec(float sideA, float sideB) {
        Perimeter = (float) (2 * (sideA + sideB));

        return Perimeter;
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
            info = "Площадь прямоугольника = " + Area;
        }
        else if (choose.equals("Периметр")) {
            info = "Периметр прямоугольника = " + Perimeter;
        }

        return info;
    }

}
