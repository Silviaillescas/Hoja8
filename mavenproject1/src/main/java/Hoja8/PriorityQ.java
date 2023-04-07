/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hoja8;

/**
 *
 * @author silvi
 * @param <E>
 */

public interface PriorityQ<E extends Comparable<E>>
{
	public E getFirst();
	
	public E remove();
        public boolean isEmpty();
	
	public int size();
	
	public void clear();

	public void add(E value);

}