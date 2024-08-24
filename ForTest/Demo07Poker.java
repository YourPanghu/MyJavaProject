package ForTest;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo07Poker {
    public static void main(String[] args){
		//1.创建一个数组 -> color -> 专门存花色
		String[] color = "♠-♥-♣-♦".split("-");
		
		//2.创建一个数组 -> number -> 专门存牌号
		String[] number = "2-3-4-5-6-7-8-9-10-J-Q-K-A".split("-");
		//3.创建map集合，key为序号，value为组合好的牌面
		HashMap<Integer, String> poker = new HashMap<>();
		//4.创建一个ArrayList，专门存储key
		ArrayList<Integer> list = new ArrayList<>();
		/*
			先存0和1给大王小王
		*/
		list.add(0);
		list.add(1);
		
		//5.组合牌，存储到map中
		int key = 2;
		for(String num : number){
			for(String huaSe : color){
				String pokerNumber = huaSe + num;
				poker.put(key,pokerNumber);
				list.add(key);
				key++;
			}
		}
		
		poker.put(0,"大🤡");
		poker.put(1,"小🤡");
		
		System.out.println(list);
		System.out.println(poker);
		
		
	}
}
