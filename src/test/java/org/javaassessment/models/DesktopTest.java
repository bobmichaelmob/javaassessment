package org.javaassessment.models;

import junit.framework.*;
import org.junit.jupiter.api.Test;
import org.javaassessment.models.*;
import static org.junit.jupiter.api.Assertions.*;

public class DesktopTest extends TestCase {


    @Test
    public void testCanNotCreateMachineWithoutHostName(){
        assertThrows(IllegalArgumentException.class, ()-> new Desktop("", "" ,2, 80, 16,
                "19.4.1", "5"));
    }

    @Test
    public void testCanCreateDesktop() {
        Machine newDesktop = new Desktop("host", "", 2, 80, 16,
                "25.3.0", "4");
        assertEquals(2, newDesktop.getNumberOfCPU());
    }


}