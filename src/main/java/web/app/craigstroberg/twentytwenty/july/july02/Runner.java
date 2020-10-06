package web.app.craigstroberg.twentytwenty.july.july02;
// Timon Java lessons
// Craig Stroberg - https://craig-stroberg.web.app

public class Runner {

    public String cellphone;
    private String name;
    private Integer age;

    // private - only within the current class
    // public - to everyone
    // protected - to everyone in the same package or if they inherit the class
    // default - to everyone in the same package
    public Runner(String n, Integer a) {
        System.out.println("Printing what we sent to Runner Constructor");
        System.out.println("n = " + n);
        System.out.println("a = " + a);

        System.out.println("Printing the name and age before we set it");
        System.out.println("name = " + name);
        System.out.println("age = " + age);

        name = n;
        age = a;

        System.out.println("Printing the name and age after we set it");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "toString - name: " + name + " age: " + age + " cellphone " + cellphone;
    }
}

