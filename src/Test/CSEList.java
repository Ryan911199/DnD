package Test;

public class CSEList<T>
{
    private NOde<T> head;

    public CSEList(){
        head = null;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public int length()
    {
        int count = 0;

        NOde<T> current = head;
        while (current.getNext() != null)
        {
            count++;
            current = current.getNext();
        }

        return count;
    }

    public void add(T data)
    {
        add(new NOde<T>(data));
    }

    public void add(NOde<T> n)
    {
        if (isEmpty())
        {
            head = n;
        }
        else
        {
            NOde<T> current = head;
            while (current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(n);
        }
    }

    public void remove(T data)
    {
        NOde<T> current = head;
        NOde<T> last = null;
        while ( current != null && ((Integer)(current.getData())).intValue() != (((Integer)data).intValue()))
        {
            last = current;
            current = current.getNext();
        }
        if (last != null && current != null)
        {
            last.setNext(current.getNext());
        }
        else if (current != null)
        {
            head = current.getNext();
        }
    }

    public void remove (int index){
        if (!isEmpty() && index < length() && index >= 0)
        {
            NOde<T> current = head;
            int dex = 0;
            while (dex < index - 1)
            {
                current = current.getNext();
                dex++;
            }
            if (dex == 0)
            {
                head = current.getNext();
            }
            else {
                current.setNext(current.getNext().getNext());
            }
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public String toString(){
        String out = "";

        if (isEmpty())
        {
            out += "This list be empty yo!";
        }
        else {
            NOde<T> current = head;
            while (current != null)
            {
                out += current.getData() + " ";
                current = current.getNext();
            }
        }

        return out;
    }
}
