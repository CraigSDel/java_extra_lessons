package web.app.craigstroberg.twentytwenty.july.july04;

// Timon Java lessons
// Craig Stroberg - https://craig-stroberg.web.app

public class Runner {

    private String name;
    private Integer age;

    public Runner(String n, Integer a) {
        name = n;
        age = a;
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
        return "toString - name: " + name + " age: " + age;
    }
}

