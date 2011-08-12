
public class StringSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str0 = "";
//		String str1 = "2010";
//		String str2 = "2010 ";
//		String str3 = "2010 01";
		
		String[] strs = str0.split(" ");
		
		System.out.println(strs.length > 1 ? strs[1] : " ");
		
		for(int i = 0;i < strs.length;i++)
		{
			System.out.println(strs[i]);
		}
	}

}
