public class Rectangle {
    public double width;
    public double height;

    public double area(){
        double area;
        return area=width*height;

    }
    public double perimeter(){
        double perimeter;
        return perimeter=2*width+2*height;

    }
    public double diagonal(){
        double diagonal;
        return diagonal=Math.sqrt(width*width+height*height);
    }
}
