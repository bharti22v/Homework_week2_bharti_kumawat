package week2;

public class VariableMethodExamples {
    private String instanceVariable1 = "Instance Variable 1";
    private String instanceVariable2 = "Instance Variable 2";
    private static int staticVariable1 = 100;
    private static double staticVariable2 = 3.14;
    public void instanceMethod(){
        System.out.println("Inside instanceMethod:");
        System.out.println("instance Variable 1:" + instanceVariable1);
        System.out.println("Instance Variable 2:" + instanceVariable2);
        System.out.println("Static variable 1:" + staticVariable1);
        System.out.println("Static variable 2:" + staticVariable2);
        staticMethod();
        }
        public static void staticMethod(){
        VariableMethodExamples examples = new VariableMethodExamples();
        System.out.println("Inside staticMethod:");
        System.out.println("Instance Variable 1:" + examples.instanceVariable1);
        System.out.println("Instance Variable 2:" + examples.instanceVariable2);
        System.out.println("Static Variable 1:" + staticVariable1);
        System.out.println("Static Variable 2:" + staticVariable2);
    }
    public static void main(String[] args){
        VariableMethodExamples instance = new VariableMethodExamples();
        instance.instanceMethod();
        staticMethod();
    }
}
