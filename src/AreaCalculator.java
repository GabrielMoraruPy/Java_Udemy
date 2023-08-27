public class AreaCalculator {

    public static void main(String[] args){
        System.out.println(area(4));
        System.out.println(area(10, 5));
        System.out.println(area(1.75, 5.5));
    }

    public static double area(double radius){
        double area = radius * radius * Math.PI;
        if (radius < 0){
            area = -1;
        }

        return area;
    }

    public static double area(double x, double y){
        double area = x * y;
        if (x < 0 || y < 0){
            area = -1;
        }
        return area;
    }
}
