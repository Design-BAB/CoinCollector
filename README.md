🦊 Fox Coin Collector

A small 2D coin-collecting game built with Java and libGDX. Guide the fox around the screen and grab as many coins as you can before the timer runs out.

Built as a learning project while picking up libGDX.

How to Play
Key	Action
W	Move up
S	Move down
A	Move left
D	Move right
Touch a coin to score a point. Then another coin shows up to a random spot.

Your score is displayed in the bottom-left corner.
Built With
Java
libGDX (LWJGL3 desktop backend)
Gradle

Project Structure
core/src/main/java/com/BryanBecerra/
├── Main.java      # Game loop: update, collision checks, rendering
├── GameObj.java   # Base class: texture + collision rectangle
├── Player.java    # The fox: WASD movement and score
└── Coin.java      # Collectible that respawns at random positions
core/assets/
├── fox.png
└── coin.png
Concepts Practiced
libGDX application lifecycle (create, render, dispose)
Frame-rate independent movement using delta time
Rectangle-based collision detection
Object-oriented design (inheritance, encapsulation)
Proper cleanup of GPU resources (Texture, SpriteBatch, BitmapFont)
Author

Bryan Becerra: GitHub
