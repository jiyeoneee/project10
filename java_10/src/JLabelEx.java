import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelEx extends JFrame {
	public JLabelEx() {
		setTitle("���콺 �ø��� ������");			//�������� Ÿ��Ʋ �ޱ�
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		JLabel label = new JLabel("Love Java");
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel a = (JLabel)e.getSource();
				a.setText("Love Java"); //���콺�� �ø� ��
			}
			public void mouseExited(MouseEvent e) {
				JLabel a = (JLabel)e.getSource();
				a.setText("�����"); //���콺�� ���� ��
			}			
		});
		add(label);
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new JLabelEx();
	}
}