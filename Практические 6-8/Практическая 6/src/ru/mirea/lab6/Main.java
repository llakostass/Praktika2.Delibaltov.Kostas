package ru.mirea.lab6;
class Main{
    public static void main(String args[]){
        MovableCircle A = new MovableCircle(2,2,0,0,5);
        System.out.println(A.toString());
        A.moveDown(10);
        System.out.println(A.toString());
        MovableRectangle d = new MovableRectangle(0,0,4,3,10,5);
        d.moveDown(10);
        System.out.println(d.toString());
        Cars F = new Cars("vaz2109","electro",0,250);
        System.out.println(F.getName());

    }
}
