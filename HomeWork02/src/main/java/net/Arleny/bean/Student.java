package net.Arleny.bean;

public class Student {
    private String name;
    private Address address;
    private int age;

    public String getName() {
        return name;
    }

    public Student(String name, Address address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
