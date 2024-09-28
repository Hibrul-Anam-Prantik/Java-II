package Task_LA_09;

public class Vehicle2010User
{
    public static void main(String[] args){
        Vehicle2010 car1 = new Vehicle2010();
        car1.position();
        car1.moveLowerLeft();
        car1.position();

        Vehicle2010 car2 = new Vehicle2010();
        car2.position();
        car2.moveUpperRight();
        car2.position();
        car2.moveLowerRight();
        car2.position();
    }
}

class Vehicle{
    public int x;
    public int y;

    public void moveUp(){
        y = y+1;
    }
    public void moveDown(){
        y = y-1;
    }
    public void moveLeft(){
        x = x-1;
    }
    public void moveRight(){
        x = x+1;
    }
    public void position(){
        System.out.println("("+ x + ","+ y + ")");
    }
}

class Vehicle2010 extends Vehicle
{
    void moveLowerLeft() {moveDown();moveLeft();}
    void moveUpperRight() {moveUp(); moveRight();}
    void moveLowerRight() {moveDown(); moveRight();}
}