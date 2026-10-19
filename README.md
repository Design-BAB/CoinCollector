# 🦊 Fox Coin Collector

**Fox Coin Collector** is a 2D arcade game built with Java. Play as a fox collecting coins across a grassy field while avoiding snails that appear as your score increases. Collect as many coins as possible before an enemy ends your run!

This project was developed to practice Java game development, and to learn the libGDX framework.

## 🎮 Gameplay

### Controls

| Key | Action |
|---|---|
| `W` / `↑` | Move up |
| `S` / `↓` | Move down |
| `A` | Move left |
| `D` | Move right |
| `R` | Restart after game over |

### Rules

- **Collect coins:** Each coin collected earns one point.
- **Watch for snails:** Every coin collected spawns a new snail, increasing the challenge as you play.
- **Avoid collisions:** Touching a snail ends the game.
- **Beat your score:** Your current score is displayed in the bottom-left corner.
- **Play again:** Press `R` to restart after a game over.

## 🛠️ Built With

- **Java** — Game logic and object-oriented programming
- **libGDX** — Cross-platform game development framework
- **LWJGL3** — Desktop application backend
- **Gradle** — Build automation and dependency management

## 📂 Project Structure

```text
core/
├── src/main/java/com/BryanBecerra/
│   ├── Main.java       # Game loop, rendering, collisions, and game state
│   ├── GameObj.java    # Base class for game objects and bounding boxes
│   ├── Player.java     # Player movement, scoring, and sprite flipping
│   ├── Coin.java       # Collectible coin and random respawning
│   └── Snail.java      # Enemy behavior and collision handling
│
└── assets/
    ├── fox.png
    ├── coin.png
    └── grass.png
```

## 🧠 Concepts Practiced

- **libGDX application lifecycle:** Managing initialization, rendering, and resource disposal with `create()`, `render()`, and `dispose()`.
- **Game loop fundamentals:** Updating game objects and rendering frames.
- **Delta-time movement:** Making player movement independent of frame rate.
- **Collision detection:** Using rectangular bounding boxes to detect interactions between game objects.
- **Randomized spawning:** Placing collectibles at new random locations.
- **Enemy behavior:** Introducing enemies dynamically as the player collects coins.
- **Game state management:** Handling gameplay, game-over conditions, and restarting.
- **Object-oriented design:** Organizing game objects through inheritance and encapsulation.
- **Resource management:** Disposing of graphics resources such as `Texture`, `SpriteBatch`, and `BitmapFont`.

[GitHub Profile](https://github.com/Design-BAB)
