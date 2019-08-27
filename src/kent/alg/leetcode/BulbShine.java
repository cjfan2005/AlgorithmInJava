package kent.alg.leetcode;

import java.util.HashMap;

public class BulbShine {
	
	public int bulbShineTimes(int[] a) {
		int lightupTimes = 0;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		for(int i=0 ; i<a.length; i++) {
			
			int currentValue = a[i];
			
//			System.out.println(currentValue);
			
			if(currentValue == 1) 
			{
				map.put(a[i], true);
				lightupTimes++;
				
				// backward
				for(int j=0; j<i; j++) {
					if(map.get(a[j]) != null && map.get(a[j]) == false)
					{
						map.put(a[j], true);
						
					} else 
						break;
				}
			} 
			else if (currentValue > 1 && map.get(currentValue-1) != null && map.get(currentValue-1) == true) 
			{
				map.put(currentValue, true);
				lightupTimes ++;
				
				
				// backward
				for(int j=0; j<i; j++) {
					if(map.get(a[j]) != null || map.get(a[j]) == false)
					{
						map.put(a[j], true);
						
					} else 
						break;
				}
			} 
			else 
			{
				map.put(currentValue, false);
			}
			
		}
			
		return lightupTimes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a = {2,3,4,1,5}; // 2
		//int[] a = {2,4,5,1,3}; // 2
		//int[] a = {2,3,4,5,1}; // 1
		//int[] a = {1,3,4,2,5}; // 3
		//int[] a = {1,2,3,4,5}; // 5
		int[] a = {2,1,3,5,4}; // 3
		BulbShine bs = new BulbShine();
		System.out.println ("Lightup times: " +bs.bulbShineTimes(a));
		
		
	}

}
