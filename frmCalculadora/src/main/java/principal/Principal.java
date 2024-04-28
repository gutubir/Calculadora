package principal;

import view.frmCalculadora;

public class Principal {
    
    public static void main(String[] args) {
        
        //Instância a interface gráfica
        frmCalculadora janela = new frmCalculadora();
        
        //Deixa a janela visível
        janela.setVisible(true);
    }
}
