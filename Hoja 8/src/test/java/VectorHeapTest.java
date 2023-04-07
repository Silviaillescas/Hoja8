/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silvi
 */
import Hoja8.VectorHeap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorHeapTest<E> {
    
    @Test
    public void isEmptyTest(){
        VectorHeap myVectorHeap = new VectorHeap();
        boolean expectedResult = true;
        boolean result = myVectorHeap.isEmpty();
        assertEquals(expectedResult, result);
    }
    
@Test
    public void sizeTest() {
        VectorHeap myVectorHeap = new VectorHeap();
        int expectedResult = 0;
        int result = myVectorHeap.size();
        assertEquals(expectedResult, result);
    }



}

    


