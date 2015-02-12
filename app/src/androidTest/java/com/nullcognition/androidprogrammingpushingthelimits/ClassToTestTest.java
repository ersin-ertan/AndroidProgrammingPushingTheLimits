package com.nullcognition.androidprogrammingpushingthelimits;

import android.test.AndroidTestCase;

/**
 * Created by ersin on 12/02/15 at 2:04 AM
 */
public class ClassToTestTest extends AndroidTestCase {

   public void testReturnInt(){
	  int in = 3;
	  int i = ClassToTest.returnInt(in);

	  assertEquals(in, i);// expected and action paramenters
   }

//   public void testReturnIntWithNull(){
//	  int ii ; // some of the test I am doing are taken care by the ide
//		// it wont comple if the number is null or uninitialized
//	  try{
//		 int i = ClassToTest.returnInt(ii);
//	  }
//	  catch(IllegalArgumentException e){ return;}
//	  fail();
//   }


   public void testReturnIntWithLargeNumber(){
	  try{
		 int i = ClassToTest.returnInt(99999999 * 999999999);
	  }
	  catch(IllegalArgumentException e){ return;}
	  fail();
   }
}
