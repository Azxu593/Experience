package net.Arleny.bean;

/**
 * @author Administrator
 * @version 1.0
 * @description : TODO
 * @date 9/24/2021 1:22 PM
 */
public class Student {
    private String name;
    private String clazz;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, String clazz, String address) {
        this.name = name;
        this.clazz = clazz;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
