package ru.mirea.lab6;

public class Cars implements Nameable
{
    private String motor, name;
    private int volume_tank, max_speed;

    public Cars(String name,String motor, int volume_tank, int max_speed) {
        this.name = name;
        this.motor = motor;
        this.volume_tank = volume_tank;
        this.max_speed = max_speed;
    }

    public String getName()
    {
        return this.name;
    }

}
