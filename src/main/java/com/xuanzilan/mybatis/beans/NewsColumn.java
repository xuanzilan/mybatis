package com.xuanzilan.mybatis.beans;

import java.util.Set;

public class NewsColumn {
    private int nid;
    private String nname;
    private Set<NewsColumn> list;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public Set<NewsColumn> getList() {
        return list;
    }

    public void setList(Set<NewsColumn> list) {
        this.list = list;
    }
}
