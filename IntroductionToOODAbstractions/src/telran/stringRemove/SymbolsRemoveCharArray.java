package telran.stringRemove;

public class SymbolsRemoveCharArray implements SymbolsRemove{
    public String removeSymbol(String str, char symbol) {
		char[] array1=new char[str.length()];
		int index=0;
		for(int i=0;i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch!=symbol) {
				array1[index++]=ch;
			}
			
		}
		char[] output=new char[index];
		for (int i=0; i<index; i++) {
			output[i]=array1[i];
		}
		return new String(output);
	}

}
