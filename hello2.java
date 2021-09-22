package basic;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Java strings methods";
String [] w=s1.split("\\s");
for(String words:w) {
	System.out.println(words);
}
	}

}
