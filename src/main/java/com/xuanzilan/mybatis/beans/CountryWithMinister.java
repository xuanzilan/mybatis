package com.xuanzilan.mybatis.beans;

import java.util.Set;

public class CountryWithMinister extends Country {
    private Set<Minister> list;

    public Set<Minister> getList() {
        return list;
    }

    public void setList(Set<Minister> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + getCid() +
                ", cname='" + getCname() + '\'' +
                ", list=" + list +
                '}';
    }
}
