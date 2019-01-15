package com.computer;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerManager man = new ComputerManager(5);
		
		man.add(new Monitor("LG", 300000, 25.2, 1));
		man.add(new Monitor("SAMSUNG", 350000, 28.2, 2));
		man.add(new Mouse("LOGITEC", 75000, true, 3));
		man.add(new KeyBoard("LG", 100000, "type-A", 4));
		man.add(new MainFrame("LG", 850000, "intel", 5));
		man.add(new Monitor("ABC", 450000, 50.2, 6));
		
		System.out.println("\n葛电 单捞磐");
		Parts[] p = man.allParts();
		for (Parts parts : p) {
			if(parts != null)
				parts.info();			
		}
		System.out.println("\n何前 八祸");
		Parts p1 = man.findPart(3);
		p1.info();
		
		System.out.println("\n何前 昏力");
		man.deletePart(1);

	}

}
