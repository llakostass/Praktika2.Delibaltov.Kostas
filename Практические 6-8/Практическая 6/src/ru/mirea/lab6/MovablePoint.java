package ru.mirea.lab6;

public class MovablePoint implements Movable
{
    private int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void moveUp(int y) {this.y += y;}
    public void moveDown(int y) {this.y -= y;}
    public void moveRight(int x) {this.x += x;}
    public void moveLeft(int x) {this.x -= x;}

}
