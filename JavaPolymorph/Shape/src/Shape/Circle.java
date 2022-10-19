package Shape;

public class Circle extends Shape {
    private double radius; //半径
    private double diameter; //直径

    public Circle(double r) { //parameter
        this.radius = r;
        this.diameter = radius * 2;
    }

    
    // public Circle(double d) { //parameter
    //     this.diameter = d;
    // }


    // @Override
    // public double getArea() {
    //     return Math.PI * this.radius * this.radius;
    // }

    //円周の求め方 = (円周）= （直径）×（円周率）
    @Override
    public double getAround(){
        return this.diameter * Math.PI;
    }

}
