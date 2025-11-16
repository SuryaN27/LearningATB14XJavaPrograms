package ex_01_JavaPrograms;

public class Test1 {
    String name;
    int age;
    public Test1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name =" + this.name+  " Age =" + this.age);
    }
    public static void main(String[] args) {
        Test1 ob=new Test1("Surya",26);
        Test1 ob2=new Test1("Ravi",27);
        ob.display();
        ob2.display();



    }
}
