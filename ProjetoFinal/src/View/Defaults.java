
package View;

import java.awt.*;
import javax.swing.*;

public class Defaults {
    
    //dimensionar imagem toda
    public static ImageIcon getResizeImage(String path, int width, int height){
        ImageIcon imageIcon = new ImageIcon(
                new ImageIcon(path)
                            .getImage()
                            .getScaledInstance(
                                    width,
                                    height,
                                    Image.SCALE_SMOOTH
                            )
        );
        
        return imageIcon;
    }
}
