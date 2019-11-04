package design_pattern._3_prototype;

public class Sheep implements Cloneable{

    private String name;
    private Integer age;

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Sheep() {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep=new Sheep("afdssad",10);
        System.out.println(sheep+",hash="+sheep.hashCode());
        Sheep sheep1= (Sheep) sheep.clone();
        Sheep sheep2= (Sheep) sheep.clone();
        Sheep sheep3= (Sheep) sheep.clone();
        System.out.println(sheep1+",hash="+sheep1.hashCode());
        System.out.println(sheep2+",hash="+sheep2.hashCode());
        System.out.println(sheep3+",hash="+sheep3.hashCode());
    }
}
