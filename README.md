cat << 'EOF' > README.md
# 2D Adventure

A simple 2D adventure game built in Java, featuring sprite-based movement, tile maps, animations, and a lightweight custom engine. This project is designed to be extended into a full adventure/platformer.

## 🎮 Features
- Player movement & animation  
- Sprite rendering  
- Tile-based world system  
- Collision handling  
- Expandable asset structure  
- Simple & clean Java architecture  

## 📂 Project Structure
2D-adventure/
├── src/            # Java source code  
├── res/            # Sprites, tiles, maps, sounds  
├── .gitignore  
└── README.md  

## 🚀 Getting Started

### Requirements
- Java JDK 8+  
- Any IDE (IntelliJ / Eclipse / VS Code) or terminal  

### Run (IDE)
1. Open project  
2. Mark *res/* as Resources Folder  
3. Run `Main.java`  

### Run (Terminal)
git clone https://github.com/shrey1184/2D-adventure
cd 2D-adventure
javac -d bin $(find src -name "*.java")
java -cp bin Main
# (If your main class has a package, update the path accordingly)

## 🛠 Customize / Extend
- Add tiles → res/tiles/  
- Add sprites → res/sprites/  
- Add maps → res/maps/  
- Modify physics/logic → edit Java classes  
- Create new levels, powers, enemies, items, UI, etc.

## 🤝 Contributing
Fork → Edit → Pull Request  

## 📜 License
MIT License  

## 👤 Author
Shrey Shrivastava  
GitHub: https://github.com/shrey1184
EOF
