import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;  

public class GamePanel extends JPanel implements Runnable {

    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3; // 3x scale
    final int tileSize = originalTileSize * scale; // 48x48 tile

    final int maxscreenCol = 16;
    final int maxscreenRow = 12;
    final int screenWidth = tileSize * maxscreenCol; // 768
    final int screenHeight = tileSize * maxscreenRow; // 576

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        // Game loop
        while (gameThread != null) {
            // Update game state
            // Render game
        }
    
    // GamePanel implementation goes here
}