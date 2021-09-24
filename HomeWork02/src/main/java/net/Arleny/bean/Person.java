package net.Arleny.bean;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @description : TODO
 * @date 9/24/2021 1:01 PM
 */
public class Person {

    private String name;
    private Integer age;
    private List<Address> addressList;

    public Person(String name, Integer age, List<Address> addressList) {
        this.name = name;
        this.age = age;
        this.addressList = addressList;
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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addressList=" + addressList +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("master");
        System.out.println("hebing master");
        System.out.println("hebing hot-fix");
    }
}
