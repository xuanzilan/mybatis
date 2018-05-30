package com.xuanzilan.mybatis.beans;

/**
 * @author dengshaoheng
 */
public class Minister {
    private int mid;
    private String mname;
    private int cid;
//    private Country country;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
//        this.country = country;
//    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Minister{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", cid=" + cid +
                '}';
    }
}
