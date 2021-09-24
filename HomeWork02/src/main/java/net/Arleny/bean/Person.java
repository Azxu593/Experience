package net.Arleny.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private String name;

    private List<Address> addresses;

    private Map<String,List<Student>> map;

    private Set<String> set;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                ", map=" + map +
                ", set=" + set +
                '}';
    }

    public Person() {
    }

    public Person(String name, List<Address> addresses, Map<String, List<Student>> map) {
        this.name = name;
        this.addresses = addresses;
        this.map = map;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Map<String, List<Student>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<Student>> map) {
        this.map = map;
    }
}
