package week2;

public class Program02_StaticVariablesExample {
    private static String country = "UK";
    private static int population = 67-961-439;// United Kingdom population estimate

    public static void displayCountryInfo() {
        System.out.println("Country:" + country);
        System.out.println("Population:" + population + "million");

    }

    public static void main(String[] args) {
        displayCountryInfo();
    }
}
