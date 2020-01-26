//*******************************************************************
// Main
//
// First graphic, using an example from the internet.
//
// History:
// 01/11/2020 Initial version
//*******************************************************************

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Main extends Canvas {
  public static void main(String[] args) {
    JFrame frame = new JFrame("My Drawing");
    Canvas canvas = new Main();
    canvas.setSize(400, 400);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }

  public void paint(Graphics g) {
    g.fillOval(100, 100, 200, 200);
  }
}
