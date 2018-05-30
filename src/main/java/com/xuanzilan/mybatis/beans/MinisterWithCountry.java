package com.xuanzilan.mybatis.beans;

public class MinisterWithCountry extends Minister{
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "MinisterWithCountry{" +
                "mid=" + getMid() +
                ", mname='" + getMname() + '\'' +
                ", cid=" + getCid() +
                ", country=" + country +
                '}';
    }
}
