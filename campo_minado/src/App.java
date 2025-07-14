import modelo.Tabuleiro;
import visao.TabuleiroConsole;

public class App {
    public static void main(String[] args) throws Exception {
        
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
	}
    
}
