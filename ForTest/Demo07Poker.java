package ForTest;

import java.util.ArrayList;
import java.util.Collections;
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
		
		//System.out.println(list);
		// System.out.println(poker);

        //6.洗牌，打乱集合中的key
		Collections.shuffle(list);
		//7.创建四个list集合
		ArrayList<Integer> p1 = new ArrayList<>();
		ArrayList<Integer> p2 = new ArrayList<>();
		ArrayList<Integer> p3 = new ArrayList<>();
		ArrayList<Integer> dipai = new ArrayList<>();
		
		//8.发牌
		for(int i=0; i<list.size(); i++){
			Integer key1 = list.get(i);
			if(i>=51){
				dipai.add(key1);
			}else if(i%3 == 0){
				p1.add(key1);
			}else if(i%3 == 1){
				p2.add(key1);
			}else if(i%3 == 2){
				p3.add(key1);
			}
		}
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
		//System.out.println(dipai);
		
		//9.排序
		Collections.sort(p1);
		Collections.sort(p2);
		Collections.sort(p3);
		Collections.sort(dipai);
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
		//System.out.println(dipai);
		
		lookPoker("韬哥",p1,poker);
		lookPoker("金莲",p2,poker);
		lookPoker("三上",p3,poker);
		lookPoker("大郎",dipai,poker);
		
		
	}

    private static void lookPoker(String name, ArrayList<Integer> list, HashMap<Integer, String> map) {
        System.out.print(name + ":");
		
		for(Integer key : list){
			String value = map.get(key);
			System.out.print(value + " ");
		}

        System.out.println();
    }
}
