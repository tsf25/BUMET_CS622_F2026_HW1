package main;

import mvc.control.GameController;

/*
 * Main is where the program starts.
 */
public class Main {

    public static void main(String[] args) {

        GameController controller = new GameController();

        controller.startGame();

        controller.moveLeftPaddleUp();
        controller.moveRightPaddleDown();

        controller.scoreLeftPlayer();

        System.out.println(
                "Left paddle position: "
                + controller.getPong().getLeftPaddle().getYPosition()
        );

        System.out.println(
                "Left player score: "
                + controller.getPong().getLeftScore()
        );
    }
}