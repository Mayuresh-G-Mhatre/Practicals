import java.awt.*;
import java.awt.event.*;
public class P10A extends Frame implements ActionListener {
	Label l1, l2, l3, l4, l5;
	TextField t1, t2, t3;
	Button b1, b2, b3, b4;

	public P10A() {
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
		
		setLayout(new GridLayout(5,2));
		add(l1);
		add(t1);
		add(l2);
		add(t2);		
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(l4);
		add(l5);
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
	}
	public static void main(String[] args) {
		new P10A();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			String data = "Name: "+t1.getText();
			l4.setText(data);
			String data1  = "Phone: "+t2.getText()+"    Address: "+t3.getText();
			l5.setText(data1);
		}
		else {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			l4.setText("");
			l5.setText("");
		}
	}
}