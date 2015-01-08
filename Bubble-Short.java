
public class sort {
	
	public static void main(String[] args){
			
		final int[] ar = {1,21,31,41,12,12,553,75,76,29,67,62,98,12};
		
		
		int[] aaaa = BubleShort(ar);
		for(int i:aaaa){
			System.out.println(i);
		}
	}
	
	public static int[] BubleShort(int[] arr){
		boolean sorted;
		int hold;
		int i,pass;

		for (pass = 1; pass < arr.length; pass++)
		{
			sorted = true;
			for ( i = 0; i < arr.length - pass; i++)
			{
				if( arr [ i ] > arr [ i + 1 ])
				{
					hold = arr [ i ];
					arr [ i ] = arr [ i + 1 ];
					arr [ i + 1 ] = hold;
					sorted = false;
				}
			}
			if (sorted == true)
			{
				break;
			}
		}
		
		return arr;		
	}
}
