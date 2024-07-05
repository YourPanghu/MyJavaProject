package ForTest;
/* 遍历字符串 charAt() */

public class Demo05String{
	public static void main(String[] args){
		String s = "abcdefg";
		for(int i=0; i<s.length(); i++){
			System.out.print(s.charAt(i)+"  ");
		}
	}
}