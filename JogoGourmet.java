import javax.swing.JOptionPane;

public class JogoGourmet {
    public static void main(String args[]) {

    	String msgInUsr;
    	int option = 0;
    	String[] options = new String[]{"Sim", "Não"};    	
      
    	while(true)
    	{
    		JOptionPane.showMessageDialog(null, "Pense em um prato que você gosta.");
        
    		option = JOptionPane.showOptionDialog(null, "O prato que você pensou é massa?", "JogoGourmet", JOptionPane.NO_OPTION, 
        		     JOptionPane.NO_OPTION, null, options, options[1]);
        
	        if(option == 0)
	        {       	
	        	option = JOptionPane.showOptionDialog(null, "O prato que você pensou é lasanha?", "JogoGourmet",
	                     JOptionPane.NO_OPTION, JOptionPane.NO_OPTION, null, options, options[1]);
	        	
	        	if(option == 0)
	        	{
	        		JOptionPane.showMessageDialog(null, "Acertei de novo!");
	        	}
	        	else
	        	{        		
	        		msgInUsr = JOptionPane.showInputDialog("Qual prato você pensou?");
	        		JOptionPane.showInputDialog(msgInUsr + " é ______ mas Lasanha não.");
	        	}
	        }
	        else 
	        {
	        	option = JOptionPane.showOptionDialog(null, "O prato que você pensou é bolo de chocolate?", "JogoGourmet",
	                     JOptionPane.NO_OPTION, JOptionPane.NO_OPTION, null, options, options[1]);
	        	
	        	if(option == 0)
	        	{
	        		JOptionPane.showMessageDialog(null, "Acertei de novo!");
	        	}
	        	else
	        	{
	        		msgInUsr = JOptionPane.showInputDialog("Qual prato você pensou?");
	        		JOptionPane.showInputDialog(msgInUsr + " é ______ mas bolo de chocolate não.");
	        	}
	       	 }        
    	}
    }
}
