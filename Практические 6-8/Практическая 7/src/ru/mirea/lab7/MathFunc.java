package ru.mirea.lab7;

public class MathFunc implements MathCalculable
{
    public double pow(double x, int a)
    {
        double y = 1;
        for (int i = 0; i < a; i++)
        {
            y *= x;
        }
        return y;
    }
    public double abs_complex(double a,double b)
    {
        return Math.sqrt(a*a + b*b);
    }
    public double area(double radius)
    {
        return pow(radius,2)*PI;
    }

}
