import java.awt.*;
import java.awt.event.*;
public class MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
