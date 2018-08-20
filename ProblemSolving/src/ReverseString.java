import java.util.Arrays;

public class ReverseString {
	
	public static String reverseString(String s)
	{
		//String[] st = new String[s.length()];
		String r = "";
//		for(int i=st.length-1; i>=0; i--)
//		{
//			st[i] = Character.toString(s.charAt(s.length()-1-i));
//		}
//		for(int j=0; j<st.length; j++)
//		{
//			r = r + st[j];
//		}
		//return Arrays.toString(st);  //returns value in an array, if st.toString() is address of array
		//return r;
		

		for(int k=s.length()-1; k>=0; k--)
		{
			r = r + Character.toString(s.charAt(k));
		}
		return r;
	}

	public static void main(String[] args) {

		String s = "yuning bie";
		String r = reverseString(s);
		System.out.println(r);
	}

}
