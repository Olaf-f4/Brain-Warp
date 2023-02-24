public class gameBall {

    private int faceUp, top, bottom, left, right, faceDown;


    public gameBall() {
        faceUp = 1;
        faceDown = 2;
        top = 5;
        bottom = 6;
        left = 3;
        right = 4;
    }

    public void rotateUp() {
        int oldFaceUp = this.faceUp;
        this.faceUp = this.bottom;
        this.bottom = this.faceDown;
        this.faceDown = this.top;
        this.top = oldFaceUp;
    }

    public void rotateDown() {
        int oldFaceUp = this.faceUp;
        this.faceUp = this.top;
        this.top = this.faceDown;
        this.faceDown = this.bottom;
        this.bottom = oldFaceUp;
    }

    public void rotateLeft() {
        int oldFaceUp = this.faceUp;
        this.faceUp = this.right;
        this.right = this.faceDown;
        this.faceDown = this.left;
        this.left = oldFaceUp;
    }

    public void rotateRight() {
        int oldFaceUp = this.faceUp;
        this.faceUp = this.left;
        this.left = this.faceDown;
        this.faceDown = this.right;
        this.right = oldFaceUp;
    }

    public void gameState() {
        //TOP BOTTOM LEFT RIGHT
        System.out.println("  " + this.top);
        System.out.println(this.left + " " + this.faceUp + " " + this.right);
        System.out.println("  " + this.bottom);
        System.out.println("--------------------");

    }
}

