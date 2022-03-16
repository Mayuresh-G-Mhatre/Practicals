import java.awt.*;
import java.awt.event.*;

public class P9A extends Frame implements ActionListener {
	Label l1, l2;
	TextField t1, t2;
	Button b1, b2;
	
	public P9A() {
		t1 = new TextField(3);
		t2 = new TextField(10);
		b1 = new Button("Factorial");
		b2 = new Button("Clear");
		l1 = new Label("Enter Number:");
		l2 = new Label("Result:");
		setLayout(new GridLayout(3, 2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		
		setSize(500, 500);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}
		);
	}

	public static void main(String[] args) {
		new P9A();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			int num, fact, i;
			String result;
			fact = 1;
			num = Integer.parseInt(t1.getText());
			for(i=1; i<=num; i++) {
				fact = fact*i;
			}
			result = String.valueOf(fact);
			t2.setText(result);
	
		}
		else {
			t1.setText("");
			t2.setText("");
		}
	}
}

		