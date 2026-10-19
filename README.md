🦊 Fox Coin Collector
A small 2D coin‑collecting game built with Java and libGDX.
Guide the fox around the field, grab coins, avoid snails, and score as many points as you can before the timer hits zero.

Built as a learning project while picking up libGDX and game‑loop fundamentals.

🎮 How to Play
Key	Action
W / Up Arrow	Move up
S / Down Arrow	Move down
A	Move left
D	Move right


Gameplay Rules
Touch a coin to earn a point.

Each collected coin respawns at a new random location.

Every coin collected spawns a snail — avoid them.

Colliding with a snail ends the game.

Your score appears in the bottom‑left corner.

Press R to restart after a game over.

🧰 Built With
Java

libGDX (LWJGL3 desktop backend)

Gradle

📁 Project Structure
Code
core/src/main/java/com/BryanBecerra/
├── Main.java       # Game loop: update, collisions, rendering, reset logic
├── GameObj.java    # Base class: texture, position, bounding box
├── Player.java     # The fox: movement, scoring, sprite flipping
├── Coin.java       # Collectible that respawns randomly
└── Snail.java      # Enemy that moves and ends the game on collision

core/assets/
├── fox.png
├── coin.png
└── grass.png
📚 Concepts Practiced
libGDX application lifecycle (create, render, dispose)

Frame‑rate‑independent movement using delta time

Rectangle‑based collision detection

Randomized spawning logic

Basic enemy behavior

Game state management (running vs. game over)

Object‑oriented design (inheritance, encapsulation)

Proper cleanup of GPU resources (Texture, SpriteBatch, BitmapFont)

👤 Author
Bryan Becerra  
GitHub: your GitHub link here
