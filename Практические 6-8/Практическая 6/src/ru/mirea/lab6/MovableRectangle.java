package ru.mirea.lab6;

public class MovableRectangle implements Movable
{
    MovablePoint topLeft,bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed, int ySpeed)
    {
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public void moveUp(int y)
    {
        topLeft.moveUp(y);
        bottomRight.moveUp(y);
    }
    public void moveDown(int y)
    {
        topLeft.moveDown(y);
        bottomRight.moveDown(y);
    }
    public void moveRight(int x)
    {
        topLeft.moveRight(x);
        bottomRight.moveRight(x);
    }
    public void moveLeft(int x)
    {
        topLeft.moveLeft(x);
        bottomRight.moveLeft(x);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
