package week2;

public class Program14_RectangleInfo {
    public static void main(String[] args) {
        //Define the width and height of the rectangle
        double width = 5.6;
        double height = 8.5;

        //Calculate the area of the rectangle
        double area = width * height;


        //Calculate the perimeter of the rectangle
        double perimeter = 2 *(width +height);

        //Display the calculated area and perimeter
        System.out.println("Area is" + width+ " *" + height +"=" + String.format("%.2f" ,area));
        System.out.println("Perimeter is 2*("+width+"+"+height +") =" +String.format("%.2f", perimeter));
    }
}
