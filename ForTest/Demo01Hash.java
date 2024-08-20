package ForTest;

public class Demo01Hash {
    public static void main(String[] args){
		Person p1 = new Person("韬哥",19);
		Person p2 = new Person("韬哥",19);
		System.out.println(p1);
		System.out.println(p2);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println("===========================");
        
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
	}
}
