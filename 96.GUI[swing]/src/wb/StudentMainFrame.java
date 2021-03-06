package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StudentMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMainFrame frame = new StudentMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentMainFrame() {
		setTitle("학생관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton studentListBtn = new JButton("1.학생리스트");
		studentListBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		studentListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1.학생리스트버튼클릭시 실행되는 메쏘드");
			}
		});
		studentListBtn.setBounds(22, 10, 213, 23);
		contentPane.add(studentListBtn);
		
		JButton studentCalculateBtn = new JButton("2.학생총점평균평점계산");
		studentCalculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2.학생총점평균평점계산");
			}
		});
		studentCalculateBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		studentCalculateBtn.setBounds(22, 43, 213, 23);
		contentPane.add(studentCalculateBtn);
	}
}
