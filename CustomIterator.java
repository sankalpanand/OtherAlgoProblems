import java.util.NoSuchElementException;
import java.util.Iterator;

public class CustomIterator implements Iterable<Integer> 
{
    private int start, end;

    public CustomIterator(int start, int end) 
    {
        this.start = start;
        this.end = end;
        
        
    }
    
    

    public Iterator<Integer> iterator() 
    {
        return new RangeIterator();
    }

    // Inner class example
    private class RangeIterator implements Iterator<Integer> 
    {
        private int cursor;

        public RangeIterator() 
        {
            this.cursor = CustomIterator.this.start;
        }

        public boolean hasNext() 
        {
            return this.cursor < CustomIterator.this.end;
        }

        public Integer next() 
        {
            if(this.hasNext()) 
            {
                int current = cursor;
                cursor ++;
                return current;
            }
            throw new NoSuchElementException();
        }

        public void remove() 
        {
            throw new UnsupportedOperationException();
        }
    }


    public static void main(String[] args) {
    	CustomIterator range = new CustomIterator(1, 10);

        // Long way
        Iterator<Integer> it = range.iterator();
        while(it.hasNext()) 
        {
            int cur = it.next();
            System.out.println(cur);
        }

        // Shorter, nicer way:
        // Read ":" as "in"
        for(Integer cur : range) 
        {
            System.out.println(cur);
        }
    }
}