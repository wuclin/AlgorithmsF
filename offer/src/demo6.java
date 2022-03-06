import java.util.LinkedList;

/**
 * 两个栈实现队列
 */
public class demo6 {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public demo6(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value){
        stack1.add(value);
    }

    public int deleteHead(){
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        if (stack2.isEmpty())
            return -1;
        return stack2.pop();
    }
}
