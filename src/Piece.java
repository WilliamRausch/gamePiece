public class Piece {
    int positionX;
    int positionY;
    boolean frozen;
    public Piece(){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }
    public Piece(int positionX, int positionY, boolean frozen){
        this.positionX = positionX;
        this.positionY = positionY;
        this.frozen = frozen;
    }
    public void move(int xMove, int yMove){
        if(!frozen) {
            positionX = positionX + xMove;
            positionY = positionY + yMove;
            System.out.println("X: "+positionX + "Y: " + positionY);
        }else{
            System.out.println("YOU ARE FROZEN!");
        }
        System.out.println("X: "+positionX + "Y: "+ positionY);
    }
    public void freeze(){
        System.out.println("frozen!");
        frozen = true;
    }
    public void unfreeze(){
        System.out.println("unfrozen!");
        frozen = false;
    }
    public int getPositionX(){
        System.out.println(positionX) ;
        return positionX;
    }
    public int getPositionY(){
        System.out.println(positionY);
        return positionY;
    }
    public boolean isFrozen(){
        return frozen;
    }

}
