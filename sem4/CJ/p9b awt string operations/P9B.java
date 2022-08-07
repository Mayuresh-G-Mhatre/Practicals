import java.awt.*;
import java.awt.event.*;

public class P9B extends Frame implements ActionListener {
	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4;
	
	public P9B() {
		l1 = new Label("1st String");
		l2 = new Label("2nd String");
		l3 = new Label("Result");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		b1 = new Button("Reverse of 1st");
		b2 = new Button("Concat of 1st+2nd");
		b3 = new Button("Length for 1st String");
		b4 = new Button("Clear");
		
		setLayout(new GridLayout(5, 2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setSize(500, 500);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}
		);
	}

	public static void main(String[] args) {
		new P9B();
	}
	
	public void actionPerformed(ActionEvent e) {
		String result;
		StringBuilder str;
		if(e.getSource() == b1) {
			str = new StringBuilder();
			str.append(t1.getText());
			str.reverse();
			t3.setText(str.toString());
		}
		else if(e.getSource() == b2) {
			result = t1.getText().concat(t2.getText());
			t3.setText(result);
		}
		else if(e.getSource() == b3) {
			str = new StringBuilder();
			str.append(t1.getText());
			int a = str.length();
			t3.setText(String.valueOf(a));
		}
		else {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}
		