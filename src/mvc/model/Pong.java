package mvc.model;

// Pong represents the Pong game. It contains two Paddle objects and the scores.
 
public class Pong 
{

    private Paddle leftPaddle;
    private Paddle rightPaddle;

    private int leftScore;
    private int rightScore;

    // Constructor.
    public Pong() 
    {
        leftPaddle = new Paddle(50, 100, 5);
        rightPaddle = new Paddle(750, 100, 5);

        leftScore = 0;
        rightScore = 0;
    }

    //  Adds one point to the left player.

    public void increaseLeftScore() 
    {
        leftScore++;
    }

    // Adds one point to the right player.
    public void increaseRightScore() 
    {
        rightScore++;
    }

    //  Getter for the left paddle.
    public Paddle getLeftPaddle() 
    {
        return leftPaddle;
    }

    //  Getter for the right paddle.
    public Paddle getRightPaddle() 
    {
        return rightPaddle;
    }

    // Getter for the left score.
    public int getLeftScore() 
    {
        return leftScore;
    }

    // Getter for the right score.
    public int getRightScore() 
    {
        return rightScore;
    }
}