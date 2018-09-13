package pucrs.vv1.t1.test;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pucrs.vv1.t1.GameEntry;
import pucrs.vv1.t1.ScoresBuggedImpl;

import static org.junit.jupiter.api.Assertions.*;

class ScoresBuggedImplTest {
    ScoresBuggedImpl s;

    @BeforeEach
    void initialize() {
        s = new ScoresBuggedImpl();
        s.add(new GameEntry("a", 1));
        s.add(new GameEntry("b", 2));
        s.add(new GameEntry("c", 3));
        s.add(new GameEntry("d", 4));
        s.add(new GameEntry("e", 5));
    }

    @Test
    void T1() {
        assertNotNull(s.remove(0));
    }

    @Test
    void T2() {
        assertNotNull(s.remove(3));
    }

    @Test
    void T3() {
        assertNotNull(s.remove(4));
    }

    @Test
    void T4() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            s.remove(10);
        });
    }

    @Test
    void T5() {
        s.remove(4);

        GameEntry g = new GameEntry("Gabriel", 5);
        assertTrue(s.add(g));
    }

    @Test
    void T6() {
        assertThrows(NullPointerException.class, () -> {
            s.add(null);
        });
    }

    @Test
    void T7() {
        assertThrows(IndexOutOfBoundsException.class, () -> {s.remove(-1);});
    }

    @Test
    void T8() {
        assertNotNull(s.remove(0));
    }

    @Test
    void T9() {
        assertNotNull(s.remove(1));
    }

    @Test
    void T10() {
        assertNotNull(s.remove(3));
    }

    @Test
    void T11() {
        assertNotNull(s.remove(4));
    }

    @Test
    void T12() {
        assertThrows(IndexOutOfBoundsException.class, () -> {s.remove(5);});
    }

}