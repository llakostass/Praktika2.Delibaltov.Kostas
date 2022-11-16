package ru.mirea.lab7;

public class Main {
    public static void main(String[] args)
    {
        MathCalculable mf = new MathFunc();
        System.out.println(mf.pow(2,10));
        System.out.println(mf.abs_complex(3,4));
        System.out.println(mf.area(10));
        WorkStrings st = new ProcessStrings();
        String s ="qwerty";
        System.out.println(st.func(s));
        System.out.println(st.reverse(s));
        System.out.println(st.length(s));

    }
}