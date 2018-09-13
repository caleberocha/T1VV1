package pucrs.vv1.t1.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pucrs.vv1.t1.GameEntry;

import static org.junit.jupiter.api.Assertions.*;

class GameEntryTest {

    private GameEntry g;

    @Test()
    public void T1Test() {
        g = new GameEntry("Gabriel", 2);
        Assert.assertEquals("Gabriel, 2", g.toString());
    }

    /*
    Este teste não pôde ser implementado porque, em Java, null não é um int válido.
     */
    @Test
    public void T2Test() {
        //g = new GameEntry("Gabriel", null);
    }

    /*
    Este teste não pôde ser implementado porque, em Java, null é uma String válida.
     */
    @Test()
    public void T3Test() {
        assertThrows(NullPointerException.class, () -> {
            g = new GameEntry(null, 2);
        });
    }

    /*
    Este teste não pôde ser implementado porque, em Java, null não é um int válido.
     */
    @Test
    public void T4Test() {
        //g = new GameEntry(null, null);
    }

}