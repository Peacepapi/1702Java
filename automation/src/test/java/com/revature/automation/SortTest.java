package com.revature.automation;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

	@Test
	public void tdd(){
		int[] before = {5,2,5,8,3,2,7,9,7};
		int[] result = Example.sort(before);
		for(int i=1; i<result.length; i++){
			if(result[i] < result[i-1])
				Assert.fail();
		}
	}
	
}
