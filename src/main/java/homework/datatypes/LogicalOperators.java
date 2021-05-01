package homework.datatypes;

public class LogicalOperators {
    public static void main(String [] args){
        int a = 20;

        //&&(and) True if both operands is true
        System.out.println(a<10 && a<20);

        //||(or) True if either of the operands is ture
        System.out.println(a<10 || a<20);

        //!(not) True if an operand is false
        System.out.println(!(a<10 && a<20));

    }
}
