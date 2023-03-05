package org.example.main.plugin;

public class TestObject {
    private String name;
    private int age;

    public TestObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TestObject() {
    }

    public String getName() {
        return name;
    }

    public TestObject setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public TestObject setAge(int age) {
        this.age = age;
        return this;
    }
}
