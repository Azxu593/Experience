package net.Arleny.bean;

public class Address {

    private String sheng;
    private String shi;
    private String xian;

    public String getSheng() {
        return sheng;
    }

    public Address(String sheng, String shi, String xian) {
        this.sheng = sheng;
        this.shi = shi;
        this.xian = xian;
    }

    public Address() {
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    @Override
    public String toString() {
        return "Address{" +
                "sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                ", xian='" + xian + '\'' +
                '}';
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
