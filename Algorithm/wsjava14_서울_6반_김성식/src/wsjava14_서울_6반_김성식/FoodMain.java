package wsjava14_서울_6반_김성식;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FoodMain {
	
	JFrame f;
	JButton b;
	JList li ;
	JTextArea ta;
	
	JTextField tf;
	JButton foodBt; // 식품명 검색
	JButton makerBt; // 제조사 검색
	
	JButton aFoodBt; // 식품명 정렬
	JButton aMakerBt; // 제조사 정렬
	
	
	FoodDAO dao;

	public FoodMain() {
		try {
			dao = new FoodDAO();
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
				showNutriList();
			}
		});
		li.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Food n = (Food)dao.search(li.getSelectedIndex());
				
				Nutri temp = new Nutri();
				List<Nutri> tempList = dao.getnList();
				for(int i = 0; i < tempList.size(); i++) {
					if(tempList.get(i).getDesc().equals(n.getName())) {
						temp = tempList.get(i);
					}
				}
				System.out.println();
				System.out.println(temp.toString());
				try {
					ta.setText(n.getMaterial());
				}
				catch(Exception e1) {
					
				}
			}
		});
		
		foodBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				showListName(text);
			}
		});
		
		makerBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				showListMaker(text);
			}
		});
		
		aFoodBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList(dao.arrangeName());
			}
		});
		
		aMakerBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList(dao.arrangeMaker());
			}
		});
	}
	
	public void showNutriList() {
		List<Nutri> data = dao.getNutrisData();
		
		System.out.println(Arrays.toString(data.toArray()));
	}

	protected void showList() {
		// dao한테서 파싱한 결과가 들어 있는 ArrayList 바당오기
		// 받아온 ArrayListfh ghkaus(JList)에 뿌리기
		List<Food> data = dao.getFoodsData();
//		System.out.println("123");
		
		li.removeAll();
		
		// ArrayList를 배열로 바꾼다음에 집어넣어주면
		// 하나씩 하나씩 꺼내서 list에 한줄씩 보여준다.
		// System.out.println(Arrays.toString(data.toArray()));
		li.setListData(data.toArray());
	}
	
	protected void showList(ArrayList<Food> data) {
		
		li.removeAll();
		li.setListData(data.toArray());
	}
	
	protected void showListName(String name) {
		// dao한테서 파싱한 결과가 들어 있는 ArrayList 바당오기
		// 받아온 ArrayListfh ghkaus(JList)에 뿌리기
		List<Food> data = dao.selectName(name);

		li.removeAll();
	
		li.setListData(data.toArray());
	}
	
	protected void showListMaker(String maker) {
		// dao한테서 파싱한 결과가 들어 있는 ArrayList 바당오기
		// 받아온 ArrayListfh ghkaus(JList)에 뿌리기
		List<Food> data = dao.selectMaker(maker);
		
		li.removeAll();

		li.setListData(data.toArray());
	}
	
	

	private void createGUI() {
		f = new JFrame("FoodList");
		JPanel p = new JPanel();
		JPanel nPanel = new JPanel();
		b = new JButton("Food List 호출");
		
		tf = new JTextField();
		tf.setColumns(10);

		
		foodBt = new JButton("식품명 검색");
		makerBt = new JButton("제조사 검색");
		
		aFoodBt = new JButton("식품명 정렬");
		aMakerBt = new JButton("제조사 정렬");
		
		li = new JList();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(li);
		
		ta = new JTextArea();
		ta.setLineWrap(true);
		
		p.setLayout(new BorderLayout());
		p.add(nPanel,"North");
		nPanel.add(b);
		nPanel.add(tf);
		nPanel.add(foodBt);
		nPanel.add(makerBt);
		nPanel.add(aFoodBt);
		nPanel.add(aMakerBt);
		
		p.add(scrollPane);
		
		f.setLayout(new GridLayout(2,1,5,5));
		f.add(p);
		f.add(ta);
		f.setSize(700, 600);
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		new FoodMain();

	}
}
