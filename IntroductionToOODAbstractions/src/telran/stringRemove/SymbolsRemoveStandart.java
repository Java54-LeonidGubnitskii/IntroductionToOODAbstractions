package telran.stringRemove;

public class SymbolsRemoveStandart implements SymbolsRemove {
	
		public String removeSymbol(String str, char symbol) {
			return str.replaceAll(getRegex(symbol),"");
		
		
	}
		private String getRegex(char symbol) {
			String specialCharacters="[].{}()*+?^$|\\";
			if(specialCharacters.indexOf(symbol)==-1){
				return Character.toString(symbol);
			}
			return "\\"+symbol;
		}

}
