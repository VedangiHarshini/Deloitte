package stringdemos;

public class Demo6 {
	public static void main(String[] args) {
		String s= "The quick brown fox jumps over the lazy dog ";
		String s1 ="The quick brown Fox jumps over the lazy Dog";
		String s2 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println(s.charAt(12));
		System.out.println(s.indexOf("is"));
		System.out.println(s.concat(" and killed it"));
		System.out.println(s.endsWith("dogs"));
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.length());
		System.out.println(s.matches(s1));
		System.out.println(s.replace("the","A"));
		//System.out.println(s.split("jumps"));
		
		
		//System.out.println(s.split());
		
		//System.out.println(s.);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('e'));
		
	}

}
