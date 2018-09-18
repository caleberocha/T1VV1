package t1vv1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameEntryTest {
	private GameEntry g;

	@Test
	public void T1() {
		g = new GameEntry("Gabriel", 2);
		assertEquals("(Gabriel, 2)", g.toString());
	}

	/*
	Este teste não pôde ser implementado porque, em Java, null não é um int válido.
	@Test
	public void T2() {
		g = new GameEntry("Gabriel", null);
	}
	*/

	/*
	Este teste não pôde ser implementado porque, em Java, null é uma String válida.
	@Test(expected = NullPointerException.class)
	public void T3() {
		g = new GameEntry(null, 2);
	}
	*/

	/*
	Este teste não pôde ser implementado porque, em Java, null não é um int válido.
	@Test
	public void T4() {
		g = new GameEntry(null, null);
	}
	*/
}