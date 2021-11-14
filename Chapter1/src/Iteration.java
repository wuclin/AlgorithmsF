import java.util.Iterator;
import java.util.LinkedList;

/***
 * 关于迭代
 */
public class Iteration {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList();
        for (Integer l : list)
            System.out.println("迭代器写法");

        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            Integer a = i.next();
            System.out.println("while写法");
        }

        //集合类数据类型的基本操作就是可以通过foreach遍历元素，而foreach的实质就是while的简化
        //对于可以迭代的集合数据类型，需要实现
        //1.一个iterator()方法并返回一个Iterator对象
        //2.Iterator类必须包含hasNext()（返回布尔值）和next()（返回集合中的泛型元素）两个方法
        //迭代器就是一个实现了hasNext()和next()方法的类的对象
        //可以自定义想要的迭代器见ResizingArrayStack.class
    }


}
