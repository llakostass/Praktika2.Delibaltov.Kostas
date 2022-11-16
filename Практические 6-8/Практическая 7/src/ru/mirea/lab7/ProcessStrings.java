package ru.mirea.lab7;

public class ProcessStrings implements WorkStrings
{
    public int length(String s)
    {
        return s.length();
    }
    public String func (String s)
    {
        String s2 = "";
        for (int i = 1; i < s.length(); i += 2)
        {
            s2 += s.charAt(i);
        }
        return s2;
    }
    public String reverse(String s)
    {
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i --)
        {
            s2 += s.charAt(i);
        }
        return s2;
    }

}
