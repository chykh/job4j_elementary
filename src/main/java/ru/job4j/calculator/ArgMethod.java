package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static int func1(int x) {
        return x * x + 1;
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 33;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        int result = ArgMethod.func1(100);
        System.out.println(result);
    }
}
