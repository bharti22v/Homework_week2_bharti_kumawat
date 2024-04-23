package week2;

public class InstanceVariableExample {
    private String name;
    private int age;
    public  void displayInfo(){

    System.out.println("Name:" + this.name );
    System.out.println("Age:" + this.age);

}

public static void main(String[] args) {
    InstanceVariableExample example = new InstanceVariableExample();
    example.name = "Shakha";
    example.age = 30;
    example.displayInfo();

}

}




