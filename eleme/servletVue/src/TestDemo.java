//import org.junit.jupiter.api.Test;

import org.junit.Test;

public class TestDemo {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "TestDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public TestDemo() {
    }

//    public TestDemo(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }

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

    @Test
    public void test01(){
        TestDemo td = new TestDemo();
        System.out.println(td.toString());
    }
}
