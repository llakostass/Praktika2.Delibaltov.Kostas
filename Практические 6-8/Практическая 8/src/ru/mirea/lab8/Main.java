package ru.mirea.lab8;

public class Main {
    public static String recursion(int n)
    {
        int sum = 0, j = 0;
        if (n == 1)
        {
            System.out.print("1");
        }
        else
        {
            for (int i = 1; sum < n; i++)
            {
                sum += i;
                j = i;
            }
            System.out.print(recursion(--n) + j);
        }
        return"";
    }
    public static String recursion2(int a, int b) {
        if (a > b)
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + recursion2(a - 1, b);
        } else
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + recursion2(a + 1, b);
        }
    }
    public static int recursion3(int n)
    {
       if (n<10) return n;
       else return recursion3(n/10) + n%10;
    }
    public static void recursion4(int n, int k)
    {
        if (k > n / 2)
        {
            System.out.println(n);
            return;
        }
        if (n % k == 0)
        {
            System.out.println(k);
            recursion4(n / k, k);
        }
        else  recursion4(n, ++k);
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        recursion(10);
        System.out.println();
        System.out.println(recursion2(20,10));
        System.out.println(recursion3(777));
        recursion4(111,2);
    }
}
