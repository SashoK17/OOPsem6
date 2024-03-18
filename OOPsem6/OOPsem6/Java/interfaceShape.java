public class interfaceShape {

}
interface TwoDimensionalShape {
    double area();
}

interface ThreeDimensionalShape {
    double area();
    double volume();
}

class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

class Cube implements ThreeDimensionalShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
// Теперь интерфейсы TwoDimensionalShape и ThreeDimensionalShape предоставляют только методы, соответствующие их размерности, что соответствует принципу разделения интерфейсов. Класс Circle реализует интерфейс TwoDimensionalShape, а класс Cube реализует интерфейс ThreeDimensionalShape, что позволяет им предоставлять только необходимую функциональность в соответствии с их размерностью.