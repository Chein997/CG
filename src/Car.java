import java.awt.*;

public class Car {
    private int x;
    private int y;
    private int width;
    private int height;
    private double wheelAng = 0;

    public Car(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void wheelRotation() {
        wheelAng += 0.05;
        if (wheelAng > 2 * Math.PI) {
            wheelAng = 0;
        }
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        int carX = (int) (this.x + (this.width * 0.2));
        int carY = (int) (this.y - this.height * 0.07);

        //колеса
        //rear
        int wheelX = carX - (int) (this.width * 0.12);
        int wheelY = carY + (int) (this.height * 0.215);
        g.setColor(Color.BLACK);
        g.rotate(wheelAng, wheelX + this.width / 20, wheelY + this.width / 20);
        g.drawOval(wheelX, wheelY, this.width / 10, this.width / 10);
        g.fillOval(wheelX, wheelY, this.width / 10, this.width / 10);
        g.setColor(Color.GRAY);
        g.fillOval((int) (wheelX + (this.width * 0.01)), (int) (wheelY + (this.width * 0.018)), this.width / 50, this.width / 50);
        g.rotate(-wheelAng, wheelX + this.width / 20, wheelY + this.width / 20);

        //front
        g.setColor(Color.BLACK);
        g.rotate(wheelAng, (int) (wheelX + (this.width * 0.43)) + this.width / 20, wheelY + this.width / 20);
        g.drawOval((int) (wheelX + (this.width * 0.43)), wheelY, this.width / 10, this.width / 10);
        g.fillOval((int) (wheelX + (this.width * 0.43)), wheelY, this.width / 10, this.width / 10);
        g.setColor(Color.GRAY);
        g.fillOval((int) (wheelX + (this.width * 0.43)), (int) (wheelY + (this.width * 0.04)), this.width / 50, this.width / 50);
        g.rotate(-wheelAng, (int) (wheelX + (this.width * 0.43)) + this.width / 20, wheelY + this.width / 20);

        //кузов
        g.setColor(Color.GREEN);
        g.drawRect(carX, carY, this.width / 4, (int) ((double) this.height / 3.5));
        g.drawRect(carX - (int) (this.width * 0.15), carY, (int) ((double) this.width / 6.6), this.height / 5);
        g.drawRect(carX + (this.width / 4), (int) (carY + ((double) this.height / 10)), this.width / 5, this.height / 10);

        g.fillRect(carX, carY, this.width / 4, (int) ((double) this.height / 3.5));
        g.fillRect(carX - (int) (this.width * 0.15), carY, (int) ((double) this.width / 6.6), this.height / 5);
        g.fillRect(carX + (this.width / 4), (int) (carY + ((double) this.height / 10)), this.width / 5, this.height / 10);

        //door
        g.setColor(Color.BLACK);
        g.drawRect(carX + (this.width / 15), carY + (int) ((double) this.height * 0.03), this.width / 7, (int) ((double) this.height / 4));
        g.drawRect(carX + (this.width / 13), carY + (int) ((double) this.height * 0.165), this.width / 40, (int) ((double) this.height / 110));
        g.fillRect(carX + (this.width / 13), carY + (int) ((double) this.height * 0.165), this.width / 40, (int) ((double) this.height / 110));

        g.setColor(Color.CYAN);
        g.drawRect(carX + (int) ((double) (this.width / 11.5)), carY + (int) ((double) this.height * 0.04), this.width / 10, (int) ((double) this.height / 10));
        g.fillRect(carX + (int) ((double) (this.width / 11.5)), carY + (int) ((double) this.height * 0.04), this.width / 10, (int) ((double) this.height / 10));
        g.drawRect(carX - (int) ((double) (this.width * 0.12)), carY + (int) ((double) this.height * 0.04), this.width / 6, (int) ((double) this.height / 10));
        g.fillRect(carX - (int) ((double) (this.width * 0.12)), carY + (int) ((double) this.height * 0.04), this.width / 6, (int) ((double) this.height / 10));


    }
}
//0.5 0.38