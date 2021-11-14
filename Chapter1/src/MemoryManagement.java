import java.util.Date;

/***
 * 关于内存管理
 */
public class MemoryManagement {
    public static void main(String[] args){
        Date a = new Date(12,31,2001);    //a指向了一个对象
        Date b = new Date(11,22,3333);    //b指向了一个对象
        a = b;                                               //a和b指向同一个对象，a原先指向的对象变成孤儿对象，会被回收
        //可见a一开始指向的对象不能在被引用了
    }
}
