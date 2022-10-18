package Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.height = h;
        this.width = w;
    }

    public double getWidth() {
        return width;
    }

    

    //長方形の周りの長さの求め方は、(縦 * 横)* 2

    @Override
public double getAround() {
return 2 * (this.width * this.height);
}    

public double getArea() {
return this.width * this.height;
}

public void setWidth(double width) {
this.width = width;
}
public double getHeight() {
return height;
}
public void setHeight(double height) {
this.height = height;
}

}