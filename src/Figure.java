public abstract class Figure {
    private float radius;
    private float sideA;
    private float sideB;

    public Figure(float radius, float sideA, float sideB) {
        this.radius = radius;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float CalculateArea(float radius, float sideA, float sideB) {
        float area = sideA * sideB;

        return area;
    }

    public float CalculatePerimeter(float radius, float sideA, float sideB) {
        float perimeter = 2 * (sideA + sideB);

        return perimeter;
    }

    public abstract float CalculateAreaCirc(float radius);

    public abstract float CalculatePerimeterCirc(float radius);

    public abstract float CalculateAreaRec(float sideA, float sideB);

    public abstract float CalculatePerimeterRec(float sideA, float sideB);

    public abstract float CalculateAreaSquare(float sideA);

    public abstract float CalculatePerimeterSquare(float sideA);
}