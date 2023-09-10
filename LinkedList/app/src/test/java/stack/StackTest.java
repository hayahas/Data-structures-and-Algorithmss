package stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StackTest {
    Stack s = new Stack();
    @Test void testisEmpty_returnsTrueEmptyStack(){
        boolean result = s.isEmpty();
        Assertions.assertEquals(true,result);
    }
    @Test void testisEmpty_returnsFalseNotEmptyStack(){
        s.push(10);
        boolean result = s.isEmpty();
        Assertions.assertEquals(false,result);
    }
    @Test void testPop_returnsValueOfLastValuePushed(){
        s.push(10);
        s.push(20);
        Object result = s.pop();
        Assertions.assertEquals(20,result);
    }
    @Test void testPush_returnsValuesOfStack(){
        s.push(10);
        s.push(20);
        s.push(30);
        String result =s.toString();
        Assertions.assertEquals("30->20->10->null",result);
    }
    @Test void testPeek_returnsFirstValueOfStack(){
        s.push(10);
        s.push(20);
        s.push(30);
        Object result =s.peek();
        Assertions.assertEquals(30,result);
    }

    @Test void testvalidateBrackets_returnsFalseNotBalancedBrackes(){
        String str = "{(})";
        boolean result= s.validateBrackets(str);
        Assertions.assertEquals(false,result);
    }

    @Test void testvalidateBrackets_returnsTrueBalancedBrackes(){
        String str = "{}{Code}[Fellows](())";
        boolean result= s.validateBrackets(str);
        Assertions.assertEquals(true,result);
    }
}
