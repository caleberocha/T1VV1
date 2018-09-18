package t1vv1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoresBuggedImplTest {
	ScoresBuggedImpl s;

	@Before
	public void initialize() {
		s = new ScoresBuggedImpl();
		s.add(new GameEntry("a", 1));
		s.add(new GameEntry("b", 2));
		s.add(new GameEntry("c", 3));
		s.add(new GameEntry("d", 4));
		s.add(new GameEntry("e", 5));
	}

	@Test
	public void T1() {
		assertNotNull(s.remove(0));
	}

	@Test
	public void T2() {
		assertNotNull(s.remove(3));
	}

	@Test
	public void T3() {
		assertNotNull(s.remove(4));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void T4() {
		s.remove(10);
	}

	@Test
	public void T5() {
		s.remove(4);

		GameEntry g = new GameEntry("Gabriel", 5);
		assertTrue(s.add(g));
	}

	@Test(expected = NullPointerException.class)
	public void T6() {
		s.add(null);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void T7() {
		s.remove(-1);
	}

	@Test
	public void T8() {
		assertNotNull(s.remove(0));
	}

	@Test
	public void T9() {
		assertNotNull(s.remove(1));
	}

	@Test
	public void T10() {
		assertNotNull(s.remove(3));
	}

	@Test
	public void T11() {
		assertNotNull(s.remove(4));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void T12() {
		s.remove(5);
	}
}