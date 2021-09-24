package net.Arleny.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class pet {

    @Value(value = "tomcat")
    private String name;
    @Value(value = "220.00")
    private String weight;

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
