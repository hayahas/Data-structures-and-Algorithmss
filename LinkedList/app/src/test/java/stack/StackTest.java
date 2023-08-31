package stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StackTest {
    @Test void testisEmpty_returnsTrueEmptyStack(){
        Stack s = new Stack();
        boolean result = s.isEmpty();
        Assertions.assertEquals(true,result);
    }
    @Test void testisEmpty_returnsFalseNotEmptyStack(){
        Stack s = new Stack();
        s.push(10);
        boolean result = s.isEmpty();
        Assertions.assertEquals(false,result);
    }
    @Test void testPop_returnsValueOfLastValuePushed(){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        int result = s.pop();
        Assertions.assertEquals(20,result);
    }
    @Test void testPush_returnsValuesOfStack(){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        String result =s.toString();
        Assertions.assertEquals("30->20->10->null",result);
    }
    @Test void testPeek_returnsFirstValueOfStack(){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        int result =s.peek();
        Assertions.assertEquals(30,result);
    }
}
