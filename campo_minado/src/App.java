import modelo.Tabuleiro;
import visao.TabuleiroConsole;

public class App {
    public static void main(String[] args) throws Exception {
        
		
		Tabuleiro tabuleiro = new Tabuleiro(10, 10, 10);
		
		new TabuleiroConsole(tabuleiro);
	}
    
}
