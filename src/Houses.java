import java.awt.*;

public class Houses {
    private int x;
    private int y;
    private int width;
    private int height;

    public Houses(final int x, final int y, final int width, final int height) {
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

        //first house
        int houseX1 = (int) (double) this.x + (int) (this.width * 0.2);
        int houseY1 = (int) ((double) this.height * 0.325);
        int verhX = houseX1 + (int) ((double) this.width / 1.5) / 2;
        int verhY = houseY1 - (int) (this.height * 0.2);

        g.setColor(Color.BLACK);
        g.drawRect(houseX1, houseY1, (int) ((double) this.width / 1.5), this.height / 3);
        g.setColor(new Color(234, 200, 83));
        g.fillRect(houseX1, houseY1, (int) ((double) this.width / 1.5), this.height / 3);
        g.setColor(Color.BLACK);
        g.drawLine(houseX1, houseY1, verhX, verhY);
        g.drawLine(verhX, verhY, houseX1 + (int) ((double) this.width / 1.5), houseY1);

        g.setColor(new Color(178, 34, 34)); // Красная крыша
        int[] xPoints1 = {houseX1, verhX, houseX1 + (int) ((double) this.width / 1.5)};
        int[] yPoints1 = {houseY1, verhY, houseY1};
        g.fillPolygon(xPoints1, yPoints1, 3);

        //win1
        g.setColor(Color.BLACK);
        g.drawRect(houseX1 + (int) (this.width * 0.08), houseY1 + (int) (this.height * 0.1), (int) ((double) this.width / 7), this.height / 7);
        g.setColor(Color.CYAN);
        g.fillRect(houseX1 + (int) (this.width * 0.08), houseY1 + (int) (this.height * 0.1), (int) ((double) this.width / 7), this.height / 7);
        g.drawOval(houseX1 + (int) (this.width * 0.28), houseY1 - (int) (this.height * 0.15), (int) ((double) this.width / 10), this.height / 10);
        g.fillOval(houseX1 + (int) (this.width * 0.28), houseY1 - (int) (this.height * 0.15), (int) ((double) this.width / 10), this.height / 10);

        //door1
        g.setColor(Color.BLACK);
        g.drawRect(houseX1 + (int) (this.width * 0.4), houseY1 + (int) (this.height * 0.083), (int) ((double) this.width / 6), this.height / 4);
        g.setColor(new Color(150, 75, 0));
        g.fillRect(houseX1 + (int) (this.width * 0.4), houseY1 + (int) (this.height * 0.083), (int) ((double) this.width / 6), this.height / 4);
        g.setColor(Color.GRAY);
        g.drawOval(houseX1 + (int) (this.width * 0.415), houseY1 + (int) (this.height * 0.2), (int) ((double) this.width / 70), this.height / 70);
        g.fillOval(houseX1 + (int) (this.width * 0.415), houseY1 + (int) (this.height * 0.2), (int) ((double) this.width / 70), this.height / 70);

        //second house
        int houseX2 = (int) (double) this.x + (int) (this.width * 1.15);
        int houseY2 = (int) ((double) this.height * 0.325);
        int verhX2 = houseX2 + (int) ((double) this.width / 1.5) / 2;
        int verhY2 = houseY2 - (int) (this.height * 0.1);

        g.setColor(Color.BLACK);
        g.drawRect(houseX2, houseY2, (int) ((double) this.width / 1.5), this.height / 3);
        g.setColor(Color.GRAY);
        g.fillRect(houseX2, houseY2, (int) ((double) this.width / 1.5), this.height / 3);
        g.setColor(Color.BLACK);
        g.drawLine(houseX2, houseY2, verhX2, verhY2);
        g.drawLine(verhX2, verhY2, houseX2 + (int) ((double) this.width / 1.5), houseY2);

        g.setColor(new Color(165, 42, 42)); // Темно-красная крыша
        int[] xPoints2 = {houseX2, verhX2, houseX2 + (int) ((double) this.width / 1.5)};
        int[] yPoints2 = {houseY2, verhY2, houseY2};
        g.fillPolygon(xPoints2, yPoints2, 3);

        //win2
        g.setColor(Color.BLACK);
        g.drawRect(houseX2 + (int) (this.width * 0.4), houseY2 + (int) (this.height * 0.1), (int) ((double) this.width / 7), this.height / 7);
        g.setColor(Color.CYAN);
        g.fillRect(houseX2 + (int) (this.width * 0.4), houseY2 + (int) (this.height * 0.1), (int) ((double) this.width / 7), this.height / 7);
        g.drawOval(houseX2 + (int) (this.width * 0.3), houseY2 - (int) (this.height * 0.08), (int) ((double) this.width / 15), this.height / 15);
        g.fillOval(houseX2 + (int) (this.width * 0.3), houseY2 - (int) (this.height * 0.08), (int) ((double) this.width / 15), this.height / 15);

        //door2
        g.setColor(Color.BLACK);
        g.drawRect(houseX2 + (int) (this.width * 0.08), houseY2 + (int) (this.height * 0.083), (int) ((double) this.width / 6), this.height / 4);
        g.setColor(new Color(150, 75, 0));
        g.fillRect(houseX2 + (int) (this.width * 0.08), houseY2 + (int) (this.height * 0.083), (int) ((double) this.width / 6), this.height / 4);
        g.setColor(Color.GRAY);
        g.drawOval(houseX2 + (int) (this.width * 0.215), houseY2 + (int) (this.height * 0.2), (int) ((double) this.width / 70), this.height / 70);
        g.fillOval(houseX2 + (int) (this.width * 0.215), houseY2 + (int) (this.height * 0.2), (int) ((double) this.width / 70), this.height / 70);


    }
}
