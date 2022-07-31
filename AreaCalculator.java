package Challenge;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
    }
    public static double area(double radius){
        if (radius <0){
            return -1.0;
        }
        double areaOfCircle = Math.PI*(radius * radius);
        return areaOfCircle;
    }

    public static double area(double x, double y)
        {
           if(x <0 || y < 0){
               return -1.0;
        }else {
               double areaOfRectangle = x*y;
               return areaOfRectangle;
           }
    }
}
