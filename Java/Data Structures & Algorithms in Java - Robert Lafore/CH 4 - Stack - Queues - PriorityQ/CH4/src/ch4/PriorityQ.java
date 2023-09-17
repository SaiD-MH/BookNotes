/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4;

/**
 *
 * @author CLINIC
 */
public class PriorityQ {

    private int maxSize;
    private long[] queArray;
    private int nItems;
//-------------------------------------------------------------

    public PriorityQ(int s) // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }
//-------------------------------------------------------------

    public void insert(long item) // insert item
    {
        int j;
        if (nItems == 0) // if no items,
        {
            queArray[nItems++] = item; // insert at 0
        } else // if items,
        {
            for (j = nItems - 1; j >= 0; j--) // start at end,
            {
                if (item > queArray[j]) // if new item larger,
                {
                    queArray[j + 1] = queArray[j]; // shift upward
                }
            else 
                break; 
        } // end for
        queArray[j + 1] = item; // insert it
        nItems++;
    } // end else (nItems > 0)
    }// end insert()
//-------------------------------------------------------------

    public long remove() // remove minimum item
    {
        return queArray[--nItems];
    }
//-------------------------------------------------------------

    public long peekMin() // peek at minimum item
    {
        return queArray[nItems - 1];
    }
//-------------------------------------------------------------

    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }
//-------------------------------------------------------------

    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }
//-------------------------------------------------------------
} // end class PriorityQ
