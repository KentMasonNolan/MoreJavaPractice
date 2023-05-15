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
        LinkedList list = new LinkedList(4);
        list.add(1);
        list.add(7);
        list.add(100);
        System.out.println(list);
        System.out.println("The list: "+list+" has "+list.length()+" elements.");
    }
}