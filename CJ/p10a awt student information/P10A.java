import java.awt.*;
import java.awt.event.*;
public class P10A extends Frame implements ActionListener {
	Panel p1, p2;
	Label l1, l2, l3, l4, l5, l6;
	TextField t1, t2, t3;
	Button b1, b2;

	public P10A() {
		p1 = new Panel();
		p2 = new Panel();
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		b1 = new Button("Submit");
		b2 = new Button("Clear");
		l1 = new Label("Name");
		l2 = new Label("Phone");
		l3 = new Label("Address");
		l4 = new Label("Result");
		l5 = new Label("");
		l6 = new Label("");
		
		setLayout(new GridLayout(2,1));
		add(p1);
		p1.setLayout(new GridLayout(4, 2));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);		
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);
		p1.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(500,500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}
		);

		add(p2);
		p2.setLayout(new GridLayout(1, 3));
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
	}
	public static void main(String[] args) {
		new P10A();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			String data = "Name: "+t1.getText();
			l4.setText(data);
			String data1 = "Phone: "+t2.getText();
			l5.setText(data1);
			String data2 = "Address: "+t3.getText();
			l6.setText(data2);
		}
		else {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			l4.setText("");
			l5.setText("");
			l6.setText("");
		}
	}
}