# 2D Adventure Game 🎮

A tile-based 2D adventure game built with Java Swing. Features smooth player movement with sprite animations, a scrolling camera system, collision detection, and a 50x50 tile world map.

## ✨ Features

- **Player Control**: Move with WASD or Arrow keys
- **Sprite Animations**: 8-directional walking animations (2 frames per direction)
- **World Map**: 50x50 tile world (2400x2400 pixels) loaded from text files
- **Camera System**: 16x12 tile viewport that follows the player
- **Collision Detection**: Prevents walking through walls and water
- **Optimized Rendering**: Only draws visible tiles for better performance
- **60 FPS**: Smooth gameplay with consistent frame rate

## 🎯 Controls

| Key | Action |
|-----|--------|
| W / ↑ | Move Up |
| A / ← | Move Left |
| S / ↓ | Move Down |
| D / → | Move Right |

## 🚀 Quick Start

### Prerequisites
- Java JDK 8 or higher

### Compile & Run
```bash
# Navigate to project directory
cd java1

# Compile all source files
javac src/*.java

# Run the game
java -cp src:res Main
```

## 📁 Project Structure

```
java1/
├── src/
│   ├── Main.java              # Entry point
│   ├── GamePanel.java         # Game loop & rendering
│   ├── Player.java            # Player controls & movement
│   ├── Entity.java            # Base entity class
│   ├── Keyhandler.java        # Keyboard input
│   ├── TileManager.java       # Tile rendering & map loading
│   ├── Tile.java              # Tile properties
│   └── CollisionChecker.java  # Collision detection
└── res/
    ├── player/                # Player sprites (8 frames)
    ├── tiles/                 # Environment tiles (ground, water, wall, etc.)
    └── maps/                  # World map data (worldmap.txt)
```

## 🎨 Tiles

| Tile | Type | Walkable |
|------|------|----------|
| 0 | Ground | ✅ |
| 1 | Water | ❌ |
| 2 | Wall | ❌ |
| 3 | Grass | ✅ |
| 4 | Trees | ✅ |
| 5 | Sand | ✅ |

## 🔧 Technical Details

- **Tile Size**: 16x16 pixels (scaled 3x to 48x48)
- **Screen Resolution**: 768x576 (16x12 tiles)
- **World Size**: 2400x2400 (50x50 tiles)
- **Player Speed**: 4 pixels per frame
- **Animation Speed**: Frame changes every 12 ticks (~0.2s)
- **Collision Hitbox**: 32x32 pixels with offset

## 🛠️ Development Progress

- [x] Game window and main loop (60 FPS)
- [x] Player sprite rendering
- [x] Keyboard input handling (WASD + Arrows)
- [x] Walking animations (8 frames total)
- [x] Tile system with rendering
- [x] World map loading from text files
- [x] Camera system following player
- [x] Collision detection system
- [x] Optimized tile rendering (only visible tiles)
- [ ] NPCs and enemies
- [ ] Items and inventory
- [ ] Sound effects and music
- [ ] Multiple maps and transitions

## 📝 Map Format

Maps are text files with single-digit tile numbers:
```
0010000210102011
0022022201010000
2020202000000200
...
```

## 🤝 Contributing

Feel free to fork this project and add your own features!

## 📄 License

MIT License - Free to use and modify
