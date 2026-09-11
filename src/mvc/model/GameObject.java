package mvc.model;

/*
 * GameObject is the parent class.
 * It contains information common to objects in Pong.
 */
public class GameObject {

    private int xPosition;
    private int yPosition;

    /*
     * Constructor with parameters.
     */
    public GameObject(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    /*
     * Moves the object.
     */
    public void move(int xChange, int yChange) {
        xPosition = xPosition + xChange;
        yPosition = yPosition + yChange;
    }

    /*
     * Getter for xPosition.
     */
    public int getXPosition() {
        return xPosition;
    }

    /*
     * Setter for xPosition.
     */
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    /*
     * Getter for yPosition.
     */
    public int getYPosition() {
        return yPosition;
    }

    /*
     * Setter for yPosition.
     */
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}