import java.awt.*;

public abstract class Vehicle {
    private Color vehicleColour;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;

    public abstract void drawVehicle(Graphics g);

    public Color getVehicleColour() {
        return vehicleColour;
    }

    public void setVehicleColour(Color vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
