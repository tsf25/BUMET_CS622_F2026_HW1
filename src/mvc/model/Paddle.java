package mvc.model;

/*
 * Paddle represents a player paddle in Pong.
 *
 * Paddle inherits from GameObject.
 */
public class Paddle extends GameObject {

    private int speed;

    /*
     * Constructor.
     */
    public Paddle(int xPosition, int yPosition, int speed) {

        super(xPosition, yPosition);
        this.speed = speed;
    }

    /*
     * Overloaded move method.
     *
     * This version only needs a direction.
     * -1 means up.
     *  1 means down.
     */
    public void move(int direction) {

        setYPosition(getYPosition() + direction * speed);
    }

    /*
     * Overridden move method.
     *
     * This method comes from GameObject.
     */
    @Override
    public void move(int xChange, int yChange) {

        setYPosition(getYPosition() + yChange);
    }

    /*
     * Getter for speed.
     */
    public int getSpeed() {
        return speed;
    }

    /*
     * Setter for speed.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}