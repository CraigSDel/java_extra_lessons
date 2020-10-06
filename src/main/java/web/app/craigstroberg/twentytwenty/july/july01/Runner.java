package web.app.craigstroberg.twentytwenty.july.july01;

// Timon Java lessons
// Craig Stroberg - https://craig-stroberg.web.app

public class Runner {

    private static String name;
    private static Integer age;

    public static void main(String[] args) {
        name = "Jane";
        age = 17;
        System.out.println("Hello " + name + ", you are a good runner. You run fast for a " + age + " year old.");
        setName("Beth");
        System.out.println(getName());
        System.out.println("Hello " + name + ", you are a good runner. You run fast for a " + age + " year old.");
    }

    // when defining a method we need this
    // void - empty space - we are not going to return something
    // accessor returnType name(parameters)
    public static void setName(String Name) {
        name = Name;
    }

    public static String getName() {
        return name;
    }

    // Primitives 	- byte, short, int, long, float, double, char, boolean
    // accessors / modifier	- private private static, public static, public
    // returnType 	- void - You can call Jane but she wont give you anything back
    //		- Java Class or Primitive
    // methodNames 	- camelCase
    // parmeters 	-

    // public void giveJaneFlowers(String flowers){
    // }
}

