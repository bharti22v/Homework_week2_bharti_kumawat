package week2;

public class Program03_VariableMethodExample {

    private String instanceVariable = "Instance Variable";
    private static int staticVariable = 100;
    public void instanceMethod(){
        System.out.println("Inside instanceMethod:");
        System.out.println("Instance Variable:" + instanceVariable);
        System.out.println("Static Variable:" +  staticVariable);
        staticMethod();

    }
    public static void staticMethod(){
       Program03_VariableMethodExample VariableMethodExample example = new Program03_VariableMethodExample()VariableMethodExample();
        System.out.println("Inside staticMethod:");
        System.out.println("Instance Variable:" + example.instanceVariable);
        System.out.println("Static variable:" + staticVariable);
    }

    public static void main(String[] args) {
       Program03_VariableMethodExample VariableMethodExample instance = new VariableMethodExample();
        instance.instanceMethod();
        staticMethod();

    }
}
