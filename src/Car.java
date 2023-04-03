import java.awt.*;

public class Car extends Vehicle {
    public Car (Color vehicleColour,int height,int width,int xPosition, int yPosition) {
        this.setVehicleColour(vehicleColour);
        this.setHeight(height);
        this.setWidth(width);
        this.setxPosition(xPosition);
        this.setyPosition(yPosition);
    }

    @Override
    public void drawVehicle(Graphics g) {
        Color mainColour = this.getVehicleColour();
        g.setColor(mainColour);
        g.fillRect(this.getxPosition(),this.getyPosition(),this.getWidth(),this.getHeight());

        int wheelSize = this.getWidth()/4;
        int leftWheelX = this.getxPosition()+(this.getWidth()/8);
        int wheelY = this.getyPosition() + (this.getHeight() - (wheelSize /2));
        g.setColor(Color.darkGray);
        g.fillOval(leftWheelX,wheelY,wheelSize,wheelSize);

        int rightWheelX = leftWheelX + (this.getWidth()/2);
        g.fillOval(rightWheelX, wheelY, wheelSize, wheelSize);

        g.setColor(Color.cyan);
        g.drawRect(leftWheelX+wheelSize/2,this.getyPosition() - this.getHeight()/2,this.getWidth()/2,this.getHeight()/2);

        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(this.getxPosition()+this.getWidth()/2,this.getyPosition() - this.getHeight()/2,this.getxPosition()+this.getWidth()/2,this.getyPosition());
    }
}
