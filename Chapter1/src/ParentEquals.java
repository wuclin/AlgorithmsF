


public class ParentEquals {
    private static class Parent {
    }


    private static class son extends Parent{

    }

    public static void main(String[] args){
        Parent p = new Parent();
        son s = new son();
        if (p.getClass() == s.getClass()) System.out.println("1");
        if (p == s) System.out.println("2");
        //显而易见，父类和子类是不会相等的
    }
}

