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

	/*
	Deve ser removido o maior score, que é (e, 5)
	 */
	@Test
	public void T1() {
		GameEntry r = s.remove(0);
		assertEquals(new GameEntry("e", 5).toString(), r.toString());
	}

	/*
	Deve ser removido o score (b, 2)
	 */
	@Test
	public void T2() {
		GameEntry r = s.remove(3);
		assertEquals(new GameEntry("b", 2).toString(), r.toString());
	}

	/*
	Deve ser removido o score (a, 1)
	 */
	@Test
	public void T3() {
		GameEntry r = s.remove(4);
		assertEquals(new GameEntry("a", 1).toString(), r.toString());
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

	@Test
	public void T13() {
		s = new ScoresBuggedImpl();

		assertTrue(s.add(new GameEntry("Leandro",4)));
	}

	@Test
	public void T14() {
		s = new ScoresBuggedImpl();
		s.add(new GameEntry("Larissa", 5));
		s.add(new GameEntry("Calebe", 3));
		s.add(new GameEntry("Douglas", 0));

		assertTrue(s.add(new GameEntry("Arthur",1)));
	}

	@Test
	public void T15() {
		s = new ScoresBuggedImpl();
		s.add(new GameEntry("Arthur", 5));
		s.add(new GameEntry("Calebe", 4));
		s.add(new GameEntry("Douglas", 3));
		s.add(new GameEntry("Joao", 2));
		s.add(new GameEntry("Larissa", 1));

		assertTrue(s.add(new GameEntry("Ana",6)));
	}

	@Test
	public void T16() {
		s = new ScoresBuggedImpl();
		s.add(new GameEntry("Arthur", 5));
		s.add(new GameEntry("Calebe", 4));
		s.add(new GameEntry("Douglas", 3));
		s.add(new GameEntry("Joao", 2));
		s.add(new GameEntry("Larissa", 1));

		assertFalse(s.add(new GameEntry("Pedro", 0)));
	}
}