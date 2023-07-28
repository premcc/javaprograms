package Strings;

public class To_Find_Occurance_Of_Characters_In_String {
	
	public static void main(String[] args) {
		
		String value="Hellow";
		
		System.out.println(value.length());
	
		char arr[]=value.toCharArray();
		
		for (char c : arr) {
			
			int count=1;
			
			for(int i=1;i<arr.length;i++)
			{
				if(c==arr[i])
				{
					count++;
					
				}
			}
			System.out.println("the count of "+c+" is"+count);
		}
	}

}
