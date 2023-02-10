package findFirstRepeatedCharacter;

public class susobhan {
	public static void main(String args[])
	{
		String s = "hello geeks";
		int n = s.length();
		int arr[]= new int [n];
		int j =0;
		for(int i =0;i<n;i++) {
			arr[j]=s.charAt(i);
			j++;
		}
		
		
		for(int i =0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.print("the output will be   :"+(char)arr[i]);
				break;
			}
			
		}
	}

}
