public class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog() {
        this("Unknown", 0, 0.0);
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Dog other) {
        if(age<other.age){
            return -1;
        } else if(age>other.age){
            return 1;
        } else {
            return name.compareTo(other.name);
        }
    }
}
