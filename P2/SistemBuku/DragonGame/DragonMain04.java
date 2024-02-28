package SistemBuku.DragonGame;

public class DragonMain04 {

    public static void main(String[] args) {
        Dragon04 dragon = new Dragon04();
        dragon.x = 3;
        dragon.y = 2;
        dragon.width = 5;
        dragon.height = 5;
        dragon.moveDown();
        dragon.moveRight();
        dragon.moveLeft();
        
        dragon.moveUp();
        dragon.moveUp();
        dragon.moveUp();
    }
}