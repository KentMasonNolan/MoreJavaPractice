package Week9;

public class IntegerStack
{

    static public final int MAX_STACK_SIZE = 5;

    private Integer[] array;
    private int i;

    //------------------------------------------------
    public boolean isFull()
    {
        return (this.i == IntegerStack.MAX_STACK_SIZE-1);
    }
    //------------------------------------------------
    public boolean isEmpty()
    {
        return (this.i == -1);
    }
    //------------------------------------------------
    public IntegerStack()
    {
        this.array = new Integer[MAX_STACK_SIZE];
        this.i = -1;
    }
    //------------------------------------------------
    public IntegerStack(Integer number)
    {
        this.array = new Integer[MAX_STACK_SIZE];
        this.i = 0;
        this.array[i] = number;
    }
    //------------------------------------------------
    public void push(Integer number)
    {
        if(i < MAX_STACK_SIZE)
        {
            i++;
            this.array[i] = number;
        }
    }
    //------------------------------------------------
    public Integer pop()
    {
        Integer val = null;
        if(i != -1)
        {
            val = this.array[i];
            this.array[i] = null;
            this.i--;
        }
        return val;
    }
    //------------------------------------------------
    public Integer top()
    {

        if(i == -1)
        {
            return null;
        }

        return this.array[i];
    }
    //------------------------------------------------
    public String toString()
    {
        String out = "";
        for(int i = this.array.length-1;i >= 0;i--)
        {
            Integer e = this.array[i];
            if(e!=null)
            {
                out+= e+" ";
            }
        }
        return "top["+out+"]";

    }
    //------------------------------------------------
    public static void lab()
    {
        IntegerStack stack = new IntegerStack(10);
        stack.push(23);
        stack.push(67);
        stack.push(16);
        System.out.println(stack);
    }
    //------------------------------------------------
    public static void main(String[] args)
    {
        lab();
        IntegerStack stack = new IntegerStack();
        System.out.println("stack.push(9)");
        stack.push(9);
        System.out.println(stack);

        System.out.println("stack.isEmpty() "+stack.isEmpty());


        System.out.println("stack.push(7)");
        stack.push(7);
        System.out.println(stack);


        System.out.println("stack.push(4)");
        stack.push(4);
        System.out.println(stack);


        System.out.println("stack.push(6)");
        stack.push(6);
        System.out.println(stack);

        System.out.println("stack.push(2)");
        stack.push(2);
        System.out.println(stack);

        System.out.println("stack.isFull() "+stack.isFull());

        Integer val = stack.pop();
        System.out.println("stack.pop -> "+val);
        System.out.println(stack);


        val = stack.top();
        System.out.println("stack.top -> "+val);
        System.out.println(stack);

        val = stack.pop();
        System.out.println("stack.pop -> "+val);
        System.out.println(stack);

        val = stack.pop();
        System.out.println("stack.pop -> "+val);
        System.out.println(stack);

        val = stack.pop();
        System.out.println("stack.pop -> "+val);
        System.out.println(stack);

        System.out.println("stack.isEmpty() "+stack.isEmpty());

        val = stack.pop();
        System.out.println("stack.pop -> "+val);
        System.out.println(stack);

    }

}