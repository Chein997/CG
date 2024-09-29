import java.awt.*;

public class Background {
    private int x;
    private int y;
    private int width;
    private int height;

    public Background(final int x, final int y, final int width, final int height) {
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

        g.setColor(new Color(135, 206, 235));
        g.fillRect(this.x, this.y, width, (int) (this.height / 4.5));

        g.setColor(new Color(63, 155, 11));
        g.fillRect(this.x, this.y + (int) (this.height / 4.5), this.width, (int) (this.height / 2.5));

        g.setColor(Color.YELLOW);
        g.fillOval(this.x + (int) (this.width / 4.5), this.y, 100, 100);
    }
}
