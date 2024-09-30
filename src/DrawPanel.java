import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;
    private int ticksFromStartY = 0;
    private Road road;
    private Car car;
    private Houses houses;
    private Background background;
    private int maxY = 150;
    private boolean moveUP = true;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.road = new Road(ticksFromStart, 600, 2500, 900);
        this.car = new Car(ticksFromStart, 600, 800, 800);
        this.houses = new Houses(ticksFromStart, 600, 800, 800);
        this.background = new Background(ticksFromStart, 0, 2500, 900);

    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        background.draw(gr);
        houses.draw(gr);
        road.draw(gr);
        car.setX(ticksFromStart);

        if (moveUP == true) {
            ticksFromStartY++;
            if (ticksFromStartY == maxY) {
                moveUP = false;
            }
        } else {
            ticksFromStartY--;
            if (ticksFromStartY == 0) {
                moveUP = true;
            }
        }
        car.setY(600 - ticksFromStartY);

        car.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            car.wheelRotation();
            repaint();
            ticksFromStart++;
        }
    }
}