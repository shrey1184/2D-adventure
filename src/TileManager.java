import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;

public class TileManager {
    GamePanel gp;
    Tile[] tile;
    int[][] mapTileNum;

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[10];
        mapTileNum = new int[gp.maxscreenCol][gp.maxscreenRow];
        getTileImage();
        loadMap("/maps/map_16x12.txt");
    }
    
    public void getTileImage() {
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/ground.png"));
            System.out.println("Ground tile loaded: " + (tile[0].image != null));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/water.png"));
            System.out.println("Water tile loaded: " + (tile[1].image != null));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));
            System.out.println("Wall tile loaded: " + (tile[2].image != null));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadMap(String FilePath) {
        try {
            InputStream is = getClass().getResourceAsStream(FilePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while(row < gp.maxscreenRow) {
                String line = br.readLine();
                
                col = 0;
                while(col < gp.maxscreenCol) {
                    // Get each character and convert to number
                    char c = line.charAt(col);
                    int num = Character.getNumericValue(c);
                    mapTileNum[col][row] = num;
                    col++;
                }
                row++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D g2) {
        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;
        
        while(col < gp.maxscreenCol && row < gp.maxscreenRow) {

            int tileNum = mapTileNum[col][row];
            g2.drawImage(tile[tileNum].image, x, y, gp.tileSize, gp.tileSize, null);
            col++;
            x += gp.tileSize;
            
            if(col == gp.maxscreenCol) {
                col = 0;
                x = 0;
                row++;
                y += gp.tileSize;
            }
        }
    }
}