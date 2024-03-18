interface Shape {
    void setWidth(int width);
    void setHeight(int height);
    int area();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}

class Square implements Shape {
    private int side;

    @Override
    public void setWidth(int width) {
        this.side = width;
    }

    @Override
    public void setHeight(int height) {
        this.side = height;
    }

    @Override
    public int area() {
        return this.side * this.side;
    }
}

// Теперь классы Rectangle и Square реализуют общий интерфейс Shape, что позволяет использовать их взаимозаменяемо без нарушения ожидаемого поведения программы.