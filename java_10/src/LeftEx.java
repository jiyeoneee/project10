import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftEx extends JFrame {
	public LeftEx() {
		setTitle("Left Ű�� ���ڿ� ��ü");  //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java"); 
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			@Override //�������̵�
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel la = (JLabel)e.getSource();
					StringBuffer text  = new StringBuffer(la.getText());
					la.setText(text.reverse().toString());
				}
			} // left ���������� ���ڰ� ������
		});
		c.add(label);
		setSize(200,100);
		setVisible(true);
		
		label.setFocusable(true); 
		label.requestFocus();// Ű �Է� ��Ŀ�� ���� 
	}
	static public void main(String [] args) {
		new LeftEx();
	}
}