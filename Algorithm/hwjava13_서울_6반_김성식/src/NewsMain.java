

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/*
 * DAO가 하는 일이 1. XML문서를 읽어서 파싱
 * 2. 파싱한 결과를 LIST에 담아놓는다.
 * 
 * Main GUI Event 처리
 * 
 */
public class NewsMain {
	JFrame f;
	JButton b ;
	JList li ;
	JTextArea ta;
	NewsDAO dao;

	public NewsMain() {
		try {
			dao = new NewsDAO();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		createGUI();
		addEvent();
	}

	private void addEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList();
			}
		});
		li.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				News n = (News)dao.search(li.getSelectedIndex());
//				News n = (News)li.getSelectedValue();
				try {
					ta.setText(n.getDesc());
				}
				catch(Exception e1) {
					
				}
			}
		});
	}

	protected void showList() {
		// dao한테서 파싱한 결과가 들어 있는 ArrayList 바당오기
		// 받아온 ArrayListfh ghkaus(JList)에 뿌리기
		List<News> data = dao.getNewsList("http://rss.etnews.com/Section902.xml");
		
		li.removeAll();
		
		// ArrayList를 배열로 바꾼다음에 집어넣어주면
		// 하나씩 하나씩 꺼내서 list에 한줄씩 보여준다.
		System.out.println(Arrays.toString(data.toArray()));
		li.setListData(data.toArray());
	}

	private void createGUI() {
		f = new JFrame("NewsList");
		JPanel p = new JPanel();
		b = new JButton("News List 호출");
		li = new JList();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(li);
		
		ta = new JTextArea();
		ta.setLineWrap(true);
		
		p.setLayout(new BorderLayout());
		p.add(b, "North");
		p.add(scrollPane);
		
		f.setLayout(new GridLayout(2,1,5,5));
		f.add(p);
		f.add(ta);
		f.setSize(400, 500);
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		new NewsMain();
	}


}
