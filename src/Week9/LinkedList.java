package Week9;

public class LinkedList
{
    private Integer number;
    private LinkedList next;
    private LinkedList prev;
    //---------------------------------------------
    public LinkedList(Integer number)
    {
        this.number=number;
        this.next = null;
        this.prev = null;
    }
    //---------------------------------------------
    public Integer getNumber()
    {
        return this.number;
    }
    //---------------------------------------------
    public LinkedList getPrev()
    {
        return this.prev;
    }
    //---------------------------------------------
    public LinkedList getNext()
    {
        return this.next;
    }
    //---------------------------------------------	
    public String toString()
    {

        if(this.next == null)
        {
            return this.number+"";
        }

        return this.number+", "+this.next.toString();
    }

    //---------------------------------------------
    public void add(Integer number)
    {
        if(this.next==null)
        {
            LinkedList next = new LinkedList(number);
            this.next = next;
            next.prev = this;
        }
        else
        {
            this.next.add(number);
        }
    }
    //---------------------------------------------
    public int length()
    {

        if(this.next == null)
        {
            return 1;
        }

        return 1+this.next.length();
    }
    //---------------------------------------------
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList(16);
        list.add(67);
        list.add(23);
        list.add(10);
        System.out.println("Top ["+list+"]");
    }
}