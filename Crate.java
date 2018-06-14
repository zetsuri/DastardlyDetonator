import java.awt.Graphics;
import java.awt.Color;
import java.io.File;
import java.awt.image.*;
import javax.imageio.*;

/**
 * Crate
 * Represents an unpassable crate that can be destroyed.
 */
class Crate extends Obstruction {
  int height=32;
  int width=32;
  BufferedImage image;

  Crate(int x, int y){
    super(x, y);
    //Try to load the sprite
    try {
      image = ImageIO.read(new File("img/crate.png"));
    } catch(Exception e){
      System.out.println("Error loading img/crate.png");
    }
  }

  public void draw(Graphics g) {
    try {
        g.drawImage(image, this.getX(), this.getY(), null);
    //If it failed to load the sprite
    } catch(Exception e){
        g.setColor(Color.GREEN);
        g.fillRect((int)(this.getX()), (int)(this.getY()), height, width);
    }
  }
}