package com.ssafy.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import com.ssafy.dao.FoodDao;
import com.ssafy.dao.FoodDaoImpl;
import com.ssafy.vo.Food;
import com.ssafy.vo.FoodPageBean;

public class FoodServiceImpl implements FoodService{
	private FoodDao dao;
	private String[] allergys={"대두","땅콩","우유","게","새우","참치","연어","쑥","소고기","닭고기","돼지고기","복숭아","민들레","계란흰자"};

	public FoodServiceImpl() {
		 dao =new FoodDaoImpl();
	}
	public List<Food> searchAll(FoodPageBean bean) {
		return dao.searchAll(bean);
	}
	public Food search(int code) {
		Food f = dao.search(code);

		StringBuilder sb = new StringBuilder();
		HashSet<String> alSet = new HashSet<String>();
		
		StringTokenizer stk = new StringTokenizer(f.getMaterial(),",");
		int lenAller = allergys.length;
		while(stk.hasMoreTokens()) {
			// 알레르기 성분이 있는지 확인
			// 토큰 하나씩 반복하는데, 알러지 하나씩도 반복해야한다.
			String s = stk.nextToken();
			for(int i = 0; i < lenAller; i++) {
				// 포함이 돼어있다면, 하나 추가
				if( s.contains(allergys[i]) ) {
					alSet.add(allergys[i]);
				}
			}
		} // end of while
		
		for (String string : alSet) {
			sb.append(string);
			sb.append(", ");
		}
		f.setAllergy(sb.toString());
		
		
		// 유발(대두, 땅콩, 우유, 게, 새우, 참치, 연어, 쑥, 소고기, 닭고기, 돼지고기, 복숭아, 민들레, 계란 흰자)
		// code에  맞는 식품 정보를 검색하고, 검색된 식품의 원재료에 알레르기 성분이 있는지 확인하여 Food 정보에 입력한다.
		
		//allergys
		
		return f;
	}
	public List<Food> searchBest() {
		return dao.searchBest();
	}
	public List<Food> searchBestIndex() {
		return dao.searchBestIndex();
	}
}
