public class calculator {
    double ar;
    public void area(double l,double b){
        ar=l*b;
        System.out.println("ar of rectangle="+ar);
    }
    public void area(double r){
    ar=Math.PI*r*r;
    System.out.println("ar of circle="+ar);

    }
    public void area(double l,double b,double h){
        ar=2*(l*b+b*h+h*l);
        System.out.println("ar of cuboid="+ar);
    }
}
