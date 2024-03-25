package telran.perfomance.stringRemove;

import telran.perfomance.PerfomanceTest;
import telran.stringRemove.SymbolsRemove;

public class SymbolRemovePerfomanceTest extends PerfomanceTest {
	char symbol;
	String str;
	SymbolsRemove symbolsRemove;

	protected SymbolRemovePerfomanceTest(String displayName, int nRuns, SymbolsRemove symbolsRemove, String str, char symbol) {
		super(displayName, nRuns);
		this.symbolsRemove=symbolsRemove;
		this.str=str;
		this.symbol=symbol;
	}


	@Override
	protected void runTest() {
		symbolsRemove.removeSymbol(str, symbol);
		
	}

}
