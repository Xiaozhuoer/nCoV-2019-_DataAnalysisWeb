package cn.xzer.springboot.model;

import java.util.Date;

public class NCoVCN {
    private Date eventtime;
    private String country;
    private String countrycode;
    private String province;
    private String provincecode;
    private String city;
    private String citycode;
    private Integer confirmed;
    private Integer suspected;
    private Integer cured;
    private Integer dead;


    public Date getEventtime() {
        return eventtime;
    }

    public void setEventtime(Date eventtime) {
        this.eventtime = eventtime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getSuspected() {
        return suspected;
    }

    public void setSuspected(Integer suspected) {
        this.suspected = suspected;
    }

    public Integer getCured() {
        return cured;
    }

    public void setCured(Integer cured) {
        this.cured = cured;
    }

    public Integer getDead() {
        return dead;
    }

    public void setDead(Integer dead) {
        this.dead = dead;
    }

    @Override
    public String toString() {
        return "NCoVCN{" +
                "eventtime=" + eventtime +
                ", country='" + country + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", province='" + province + '\'' +
                ", provincecode='" + provincecode + '\'' +
                ", city='" + city + '\'' +
                ", citycode='" + citycode + '\'' +
                ", confirmed=" + confirmed +
                ", suspected=" + suspected +
                ", cured=" + cured +
                ", dead=" + dead +
                '}';
    }
}
