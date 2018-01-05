package com.zym;

public class pojo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        pojo pojo=new pojo();
        pojo.setName("曾椰敏");
        System.out.print(pojo.getName());
    }
}
