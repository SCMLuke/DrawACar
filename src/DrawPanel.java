import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Car myCar = new Car(Color.magenta,70,200,100,80);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        myCar.drawVehicle(g);
    }
}
