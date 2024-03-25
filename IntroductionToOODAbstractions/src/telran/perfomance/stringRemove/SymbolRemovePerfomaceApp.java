package telran.perfomance.stringRemove;

import java.util.Random;

import telran.stringRemove.SymbolsRemove;
import telran.stringRemove.SymbolsRemoveCharArray;
import telran.stringRemove.SymbolsRemoveStandart;

public class SymbolRemovePerfomaceApp {
	private static final int N_SYMBOLS=100000;
	private static final int N_RUNS=1000;
	private static Random random=new Random();
	public static void main(String[] args) {
		String str=getRandomString(N_SYMBOLS);
		char symbol=getRandomAsciiChar();
		SymbolRemovePerfomanceTest symbolsRemoveCharArray=getTest(str,N_RUNS,"SymbolsRemoveCharArray test: ",new SymbolsRemoveCharArray(),symbol);
		SymbolRemovePerfomanceTest symbolsRemoveStandart=getTest(str,N_RUNS,"SymbolsRemoveStandart test: ",new SymbolsRemoveStandart(),symbol);
		symbolsRemoveCharArray.run();
		symbolsRemoveStandart.run();
		
	}
	private static SymbolRemovePerfomanceTest getTest(String str, int nRuns, String displayName,
			SymbolsRemove symbolsRemove, char symbol) {
		
		return new SymbolRemovePerfomanceTest(displayName,nRuns,symbolsRemove, str, symbol);
	}
	private static char getRandomAsciiChar() {
		int asciiCode=32+random.nextInt(95);
		return (char) asciiCode;
	}
	private static String getRandomString(int length) {
		StringBuilder str=new StringBuilder();
		for(int i=0; i<length;i++) {
			str.append(getRandomAsciiChar());
		}
		return str.toString();
	}

}
