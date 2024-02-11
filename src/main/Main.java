package main;
public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());
        System.out.println("*****************************************************************");

        Player player1=new Player("Goksu",-30,Weapon.GUN);
        System.out.println("Kalan can:" + player1.healthRemaining() );
         player1.restoreHealth(60);
        System.out.println("KalanCan:" + player1.healthRemaining() );
        player1.loseHealth(130);
        System.out.println("KalanCan:" + player1.healthRemaining() );

    }
}