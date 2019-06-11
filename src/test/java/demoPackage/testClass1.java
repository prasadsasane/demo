package demoPackage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class testClass1 {
    @Test
     void testHelloWorld() {
        assertEquals("hello world", demoClass.getMessage());
        System.out.println("Test 1 is passed");
    }


/*    @Test
    void testAssert(){
        //String str1 = "abc";
        //String str2 = "pqr";
        //assertEquals(str1,str2);
        int c=demoClass.funDemo();
      //  assertEquals(c>0,demoClass.funDemo()," Test passed ");
        assertNotEquals(c>0,demoClass.funDemo(),"Test Passed ! multiply by 0 is zero ");
    }*/
}

