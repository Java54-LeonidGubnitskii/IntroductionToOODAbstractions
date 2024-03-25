package telran.stringRemove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SymbolsRemoveTest {

	@Test
	void SymbolsRemoveCharArrayTest() {
		String strTest="abcdefaaa";
		SymbolsRemove symbolsRemove=new SymbolsRemoveCharArray();
		assertEquals("bcdef",symbolsRemove.removeSymbol(strTest, 'a'));
		assertEquals("abcefaaa",symbolsRemove.removeSymbol(strTest, 'd'));
		assertEquals("abcdefaaa",symbolsRemove.removeSymbol(strTest, 'z'));
		assertEquals("",symbolsRemove.removeSymbol("", 'z'));
		assertEquals("",symbolsRemove.removeSymbol("aaa", 'a'));
	}
	@Test
	void SymbolsRemoveStandartTest() {
		String strTest="abcdefaaa";
		SymbolsRemove symbolsRemove=new SymbolsRemoveStandart();
		assertEquals("bcdef",symbolsRemove.removeSymbol(strTest, 'a'));
		assertEquals("abcefaaa",symbolsRemove.removeSymbol(strTest, 'd'));
		assertEquals("abcdefaaa",symbolsRemove.removeSymbol(strTest, 'z'));
		assertEquals("",symbolsRemove.removeSymbol("", 'z'));
		assertEquals("",symbolsRemove.removeSymbol("aaa", 'a'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab[c", '['));
		assertEquals("abc",symbolsRemove.removeSymbol("ab]c", ']'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab{c", '{'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab}c", '}'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab.c", '.'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab(c", '('));
		assertEquals("abc",symbolsRemove.removeSymbol("ab)c", ')'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab*c", '*'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab+c", '+'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab?c", '?'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab^c", '^'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab$c", '$'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab|c", '|'));
		assertEquals("abc",symbolsRemove.removeSymbol("ab\\c", '\\'));
		
		
		
		
		
	}

}
