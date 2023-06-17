/* Display class
 * @description:
 * @authors: Amun Ahmad & Jethro Lin
 * @version: 6/9/2023
 */

package jagame;

import java.awt.Color;
import javax.swing.JFrame;

public class Display {
    private static JFrame window;

    public Display(String title, int width, int height) {
        this.window = new JFrame(title);
        this.window.setSize(width, height);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setVisible(true);
    }

    public void quit() {
        this.window = null;
    }

    public void update() {
        this.window.repaint();
    }

    /* GETTERS */

    public JFrame getFrame() {
        return this.window;
    }
}
