/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja8;
import java.util.PriorityQueue;
import java.util.Vector;


/**
 *
 * @author silvi
 */


/**
 * @param <E>
 */
public class VectorHeapC<E extends Comparable<E>> extends PriorityQueue<E> {
    protected Vector<E> data; 

  
    public VectorHeapC()
    {
        data = new Vector<E>();
    }

    /**
     * @param v
     */
    public VectorHeapC(Vector<E> v)
  
    {
        int i;
        data = new Vector<E>(v.size()); 
        for (i = 0; i < v.size(); i++) { 
            add(v.get(i));
        }
    }

    /**
     * @param i
     * @return
     */
    protected static int parent(int i)
    {
        return (i - 1) / 2;
    }

    /**
     * @param i
     * @return 
     */
    protected static int left(int i)
   
    {
        return 2 * i + 1;
    }

    /**
     * @param i
     * @return 
     */
    protected static int right(int i)
    
    {
        return (2 * i + 1) + 1;
    }

    /**
     * @param leaf
     */
    protected void percolateUp(int leaf)

    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 &&
                (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    /**
     * @param value
     */
    @Override
    public boolean add(E value)

    {
        data.add(value);
        percolateUp(data.size() - 1);
        return false;
    }


    /**
     * @param root
     */
    protected void pushDownRoot(int root)
 
    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos + 1)).compareTo
                                (data.get(childpos)) < 0)) {
                    childpos++;
                }
            
                if ((data.get(childpos)).compareTo
                        (value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos; 
                } else { 
                    data.set(root, value);
                    return;
                }
            } else { 
                data.set(root, value);
                return;
            }
        }
    }

  
    @Override
    public E remove()

    {
        E minVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }
 
    public E getFirst() {
        return data.get(0);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
    }
    
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    }
