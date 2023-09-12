package maxStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MaxStackTest {

    MaxStack maxStack = new MaxStack();

    @Test void testisEmpty_returnsTrueEmptyStack(){
        boolean result = maxStack.isEmpty();
        Assertions.assertEquals(true,result);
    }
    @Test void testisEmpty_returnsFalseNotEmptyStack(){
        maxStack.push(10);
        boolean result = maxStack.isEmpty();
        Assertions.assertEquals(false,result);
    }
    @Test void testPop_returnsValueOfLastValuePushed(){
        maxStack.push(10);
        maxStack.push(20);
        int result = maxStack.pop();
        Assertions.assertEquals(20,result);
    }
    @Test void testPush_returnsValuesOfMaxStack(){
        maxStack.push(10);
        maxStack.push(20);
        maxStack.push(30);
        String result =maxStack.toString();
        Assertions.assertEquals("30->20->10->null",result);
    }
    @Test void testPeek_returnsFirstValueOfMaxStack(){
        maxStack.push(10);
        maxStack.push(20);
        maxStack.push(30);
        int result =maxStack.peek();
        Assertions.assertEquals(30,result);
    }

    @Test void testGetMax_returnsTheMaximumValueInMaxStack(){
        maxStack.push(10);
        maxStack.push(23);
        maxStack.push(35);
        int result =maxStack.getMaxValue();
        Assertions.assertEquals(35,result);
    }


}
