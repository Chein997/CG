import java.awt.*;

public class Road {

    private int x;
    private int y;
    private int width;
    private int height;

    public Road(final int x, final int y, final int width, final int height) {
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


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //дорога
        g.setColor(Color.BLACK);
        g.drawRect(this.x, (int) ((double) this.height * 0.6), this.width, this.height / 3);
        g.setColor(Color.GRAY);
        g.fillRect(this.x, (int) ((double) this.height * 0.6), this.width, this.height / 3);

        //полоски
        g.setColor(Color.WHITE);
        g.fillRect((int) ((double) this.x), (int) ((double) this.height * 0.76), (int) (this.width * 0.05), (int) (this.height * 0.025));

        for (int i = 1; i < 10; i++) {
            g.fillRect(this.x + i * (int) (this.width * 0.07), (int) (this.height * 0.76), (int) (this.width * 0.05), (int) (this.height * 0.025));
        }

    }

}
