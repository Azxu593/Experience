package net.Arleny.bean;

/**
 * @author Administrator
 * @version 1.0
 * @description : TODO
 * @date 9/24/2021 1:02 PM
 */
public class Address {
    private String sheng;
    private String shi;
    private String xian;

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                ", xian='" + xian + '\'' +
                '}';
    }

    public Address(String sheng, String shi, String xian) {
        this.sheng = sheng;
        this.shi = shi;
        this.xian = xian;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }
}
