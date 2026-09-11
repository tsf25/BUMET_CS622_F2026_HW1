# BUMET_CS622_F2026_HW1
HW1, Arcade Game, OOP Concepts
Pong OOP Project

About the Project
I chose Pong because it is a simple game and I am still a beginner learning Java and OOP. I wanted a project that would let me focus on the OOP concepts instead of spending too much time on complicated game programming. Pong also has simple objects like paddles and players, which made it easier to represent them as Java classes.
I used the resources in the References section mainly for inspiration and to understand how Pong can be organized in Java. I looked at different examples of game objects, paddles, movement, and scores. These examples helped me come up with the structure for my own GameObject, Paddle, Pong, and GameController classes. I did not copy a complete game; I used the examples as a guide and created a simpler version that focuses on the OOP concepts we learned in class.

Classes
GameObject
GameObject is the main parent class.
It has:
    • xPosition
    • yPosition
    • A move() method
The positions are used to keep track of where an object is.
Paddle
Paddle represents a Pong paddle.
It extends GameObject, so it gets the position information from GameObject.
It also has a speed variable.
I have two different move() methods in this class. This is an example of method overloading.
I also changed the move(int, int) method from GameObject. This is an example of method overriding.
Pong
Pong represents the Pong game.
It has:
    • A left paddle
    • A right paddle
    • Left player score
    • Right player score
The class creates the two paddles and has methods to increase the scores.
GameController
GameController is used to control the game.
It has methods to:
    • Move the left paddle up and down
    • Move the right paddle up and down
    • Increase the players' scores
Main
Main is where the program starts.
It creates the GameController and calls some methods to test the program.

OOP Concepts I Used
Inheritance
I used inheritance between GameObject and Paddle.
public class Paddle extends GameObject
This means that Paddle gets things from GameObject.
I used this because a paddle is a type of game object.
Method Overriding
The GameObject class has:
move(int xChange, int yChange)
The Paddle class has its own version of this method.
@Override
public void move(int xChange, int yChange)
This is method overriding.
Method Overloading
The Paddle class has two move() methods:
move(int direction)

move(int xChange, int yChange)
They have the same name but different parameters, so this is method overloading.
Encapsulation
I made the variables private, for example:
private int xPosition;
I then use getters and setters to get or change these values.
Constructors
I used constructors when creating my objects.
For example, when creating a Paddle, I give it a starting x position, y position, and speed.

Why I Kept the Game Simple
I did not try to make a complete Pong game with graphics, keyboard controls, or a ball.
I kept it simple because the main purpose of the assignment is to show that I understand the OOP concepts.

This assignment helped me understand how classes and objects can be used to organize a program.
I also got practice with:
    • Inheritance
    • Overriding
    • Overloading
    • Constructors
    • Getters and setters
    • Private variables
    • Parameters
    
One thing I understand better now is that different classes can have different jobs instead of putting all the code into one class.
I believe this is really important in a professional scenario when you are dealing with much bigger projects.

References
I used these websites and videos to help me learn about Pong and Java OOP while working on the assignment:
    • https://github.com/AlmasB/FXGL/wiki/Simple-Game---Pong
    • https://github.com/LuisFelipeFrancisco/Pong-Java/tree/main/Pong/src
    • https://www.youtube.com/watch?v=1wD2CdFlDaE
    • https://medium.com/@rintoprie/oop-for-beginners-a-game-based-approach-to-learning-01acf2643cd6
    • https://codereview.stackexchange.com/questions/27665/single-player-pong-game-in-java
    • https://stackoverflow.com/questions/645303/proper-oo-pong
    • https://iq.opengenus.org/pong-in-java/
    • https://github.com/tazmanianDeviloper/metcs622_Assignment1_Taymaz_Davoodi-main
