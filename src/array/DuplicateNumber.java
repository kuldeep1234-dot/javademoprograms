package array;

public class DuplicateNumber {

	public static void main(String[] args) {
		int [] arr= {3,4,5,5,6};
		
		System.out.println("Duplicate numbers are ");
		{
			for(int i=0; i<arr.length;i++ )
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
						
						System.out.println(arr[i]);
				}
				
				
			
			}
			
		}

	}

}
