package logo;

public class Main {
   
    public static void main(String args[]) {
    	
    	//Logo l=new CrazyFrog();
    	Logo l=new CrazyFrog();
    	l=new Lunettes(l);
    	l=new Smiley(l);
    	l=new BatonSucrerie(l);
    	l=new Chapeau(l);
    	l.getLogo().display();
    }
        
}
