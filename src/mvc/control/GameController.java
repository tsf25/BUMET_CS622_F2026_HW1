package mvc.control;

import mvc.model.Pong;

// GameController controls the Pong game.

public class GameController 
{

    private Pong pong;

    // Constructor.

    public GameController() 
    {
        pong = new Pong();
    }

    // Starts the game.
  
    public void startGame() 
    {
        System.out.println("Pong game started.");
    }

    // Moves the left paddle up.

    public void moveLeftPaddleUp() 
    {
        pong.getLeftPaddle().move(-1);
    }

    // Moves the left paddle down.
    public void moveLeftPaddleDown() 
    {
        pong.getLeftPaddle().move(1);
    }

    // Moves the right paddle up.
    public void moveRightPaddleUp() 
    {
        pong.getRightPaddle().move(-1);
    }

    // Moves the right paddle down.
    public void moveRightPaddleDown() 
    {
        pong.getRightPaddle().move(1);
    }

    // Adds a point to the left player.

    public void scoreLeftPlayer() 
    {
        pong.increaseLeftScore();
    }

    // Adds a point to the right player.
   
    public void scoreRightPlayer() 
    {
        pong.increaseRightScore();
    }

    // Getter for Pong.

    public Pong getPong() 
    {
        return pong;
    }
}