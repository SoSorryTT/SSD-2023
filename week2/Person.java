package week2;

public class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if(name == p.name) {
            return age-p.age;
        }
        return name.compareTo(p.getName());
    }
}
