package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameBoard extends JFrame {

    public class Gametile extends GameBoard{
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        paintFirstLine(g);
        paintSecondLine(g);
        paintThirdLine(g);
        paintForthLine(g);
        paintFifthLine(g);
        paintFiguras(g);
        paintBorders(g);
        paintTurtle(g);
    }
    /**
     * Рисува фигурите на дъската
     * @param g
     */
    public void paintFiguras(Graphics g) {
        printGreenFiguras(g);
        printYellowFiguras(g);
    }

    /**
     * Рисува Зелените фигурки
     * @param g
     */
    public void printGreenFiguras(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(25, 425, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(125, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(130, 430, 40, 40);
        g.setColor(Color.yellow);
        g.fillOval(225, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(230, 430, 40, 40);
        g.setColor(Color.yellow);
        g.fillOval(325, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(330, 430, 40, 40);
        g.setColor(Color.yellow);
        g.fillOval(425, 425, 50, 50);
        g.setColor(Color.green);
        g.fillOval(430, 430, 40, 40);
    }

    /**
     * Рисува Жълтите фигурки
     * @param g
     */
    public void printYellowFiguras(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(25, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(30, 30, 40, 40);
        g.setColor(Color.green);
        g.fillOval(125, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(130, 30, 40, 40);
        g.setColor(Color.green);
        g.fillOval(225, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(230, 30, 40, 40);
        g.setColor(Color.green);
        g.fillOval(325, 25, 50, 50);
        g.setColor(Color.yellow);
        g.fillOval(330, 30, 40, 40);
        g.fillRect(425,25,50,50);
    }

    /**
     * Рисува квадратите на петият ред
     * @param g
     */
    public void paintFifthLine(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 400, 100, 100);
        g.setColor(Color.red);
        g.fillRect(100, 400, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 400, 100, 100);
        g.setColor(Color.red);
        g.fillRect(300, 400, 100, 100);
        g.setColor(Color.black);
        g.fillRect(400, 400, 100, 100);
    }

    /**
     * Рисува квадратите на четвъртият ред
     * @param g
     */
    public void paintForthLine(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 300, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(100, 300, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 300, 100, 100);
        g.setColor(Color.gray);
        g.fillRect(300, 300, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(400, 300, 100, 100);

    }

    /**
     * Рисува квадратите на третият ред
     * @param g
     */
    public void paintThirdLine(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 200, 100, 100);
        g.setColor(Color.white);
        g.fillRect(100, 200, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 200, 100, 100);
        g.setColor(Color.GRAY);
        g.fillOval(225, 225, 50, 50);
        g.setColor(Color.white);
        g.fillRect(300, 200, 100, 100);
        g.setColor(Color.white);
        g.fillRect(400, 200, 100, 100);
    }

    /**
     * Рисува квадратите на вторият ред
     * @param g
     */
    public void paintSecondLine(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 100, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(100, 100, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 100, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(300, 100, 100, 100);
        g.setColor(Color.GRAY);
        g.fillRect(400, 100, 100, 100);
    }

    /**
     * Рисува квадратите на първият ред
     * @param g
     */
    public void paintFirstLine(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 100, 100);
        g.setColor(Color.black);
        g.fillRect(100, 0, 100, 100);
        g.setColor(Color.white);
        g.fillRect(200, 0, 100, 100);
        g.setColor(Color.black);
        g.fillRect(300, 0, 100, 100);
        g.setColor(Color.RED);
        g.fillRect(400, 0, 100, 100);
    }

    /**
     * Конструктор за игровата дъска
     */
    public GameBoard() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * Рисува границите на полетата
     * @param g
     */
    public void paintBorders(Graphics g){
        g.setColor(Color.BLACK);
        for (int i = 0; i < 5; i++)
        {
            g.drawLine(i * 100, 0, i * 100, 500);
            g.drawLine(0, i * 100, 500, i * 100);
        }
    }

    /**
     * Рисува костенурките на рандом позиции
     * @param g
     */
    public void paintTurtle(Graphics g){
        Random random = new Random();
        int position = random.nextInt(2);
        int position2 = random.nextInt(2) + 3;
        g.setColor(Color.red);
        g.fillOval(25 + (100 * position), 225, 50, 50);
        g.setColor(Color.white);
        g.fillOval(30 + (100 * position), 230, 40, 40);

        g.setColor(Color.red);
        g.fillOval(25 + (100 * position2), 225, 50, 50);
        g.setColor(Color.white);
        g.fillOval(30 + (100 * position2), 230, 40, 40);
    }
}