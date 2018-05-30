package com.xuanzilan.mybatis.beans;

import java.util.Set;

/**
 * @author dengshaoheng
 */
public class Country {
    private int cid;
    private String cname;
//    private Set<Minister> list;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
