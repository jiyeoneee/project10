import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Left2Ex extends JFrame {
	public Left2Ex() {
		setTitle("Left Ű�� ���ڿ� �̵�");  //�������� Ÿ��Ʋ �ޱ�
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java"); //��ҿ� love java
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel a = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(a.getText()); //StringBuffer ���
					String x = text.substring(0,1);
					String y = text.substring(1);
					a.setText(y.concat(x)); //left�Ҷ����� �������� �۾��� �̵�
				}
			}
		});
		c.add(label);
		setSize(200,100);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
	}
			
	static public void main(String [] args) {
		new Left2Ex();
	}
}
