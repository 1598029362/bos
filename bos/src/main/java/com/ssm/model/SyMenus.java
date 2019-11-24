package com.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class SyMenus {
    private Short id;

    private String parentid;

    private String type;

    private String text;

    private String url;

    private String tip;

    private List<SyRole> menus_role;

    public List<SyRole> getMenus_role() {
        return menus_role;
    }

    private List<SyMenus> children=new ArrayList<>();//保存根节点对应的子节点的集合


    public List<SyMenus> getChildren() {
        return children;
    }

    public void setChildren(List<SyMenus> children) {
        this.children = children;
    }

    public void setMenus_role(List<SyRole> menus_role) {
        this.menus_role = menus_role;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    @Override
    public String toString() {
        return "SyMenus{" +
                "id=" + id +
                ", parentid='" + parentid + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", tip='" + tip + '\'' +
                ", menus_role=" + menus_role +
                ", children=" + children +
                '}';
    }
}