package stage1;
import java.awt.EventQueue;
import java.io.ByteArrayOutputStream;

public class ConcreteControler extends AbstractControler {
	
	protected ByteArrayOutputStream byteArrayOutputStream;
	protected boolean stopCapture = false;
	protected double voiceFreq = 0;  
	protected byte tempBuffer[] = new byte[8000];  
	protected int countzero; 
	protected short convert[] = new short[tempBuffer.length]; 

	 
	public ConcreteControler(AbstractModel m)
	{
		super(m);
	}

	@Override
	public void controlaudio()
	{
		//on notifie le modele de l'action si le controle est bon
		//-------------------------------------------------------
		
        byteArrayOutputStream = new ByteArrayOutputStream(); 
        stopCapture = false;
        
        try{
                                
                int cnt = parole.read(tempBuffer,0,tempBuffer.length); 
                byteArrayOutputStream.write(tempBuffer, 0, cnt); 
                try {
                    countzero = 0; 
                    for(int i=0; i < tempBuffer.length; i++){  
                        convert[i] = tempBuffer[i];    
                        if(convert[i] == 0){countzero++;}     
                    }
                    voiceFreq = (countzero/2)+1;               
                    if(voiceFreq>=80 && voiceFreq<=350)
                       new Parole("Voice"+voiceFreq);
                    else
                       new Parole("Unvoice"+voiceFreq);
                }catch(StringIndexOutOfBoundsException e)  
                {System.out.println(e.getMessage());}                                                                                    
                    Thread.sleep(0);                                        
            
        byteArrayOutputStream.close();
        }catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

	}
	public void controltext()
	{
		AbstractModel m = new ConcreteModel(); 
    	AbstractControler controler = new ConcreteControler(m);
    	controler.p1 = this.p1;
    	controler.p2 = this.p2;
    	controler.p3 = this.p3;
    	controler.p4 = this.p4;
    	controler.p5 = this.p5;
    	controler.p6 = this.p6;
    	controler.p7 = this.p7;
    	controler.p8 = this.p8;
    	controler.p9 = this.p9;
    	 EventQueue.invokeLater(new Runnable() {

             @Override
             public void run() {
            	 Create create = new Create(controler);
            	 m.addObserver(create);
             }
         });    
       
	            }
	/*public void controltexti(int i)
	{
		AbstractModel m = new ConcreteModel(); 
    	AbstractControler controler = new ConcreteControler(m);
    	controler.t[i] = this.t[i];
    	for (int j=0;j<9;j++)
    	{
    		if (j != i)
    			controler.t[j] = this.t[j];
    	}
    	 EventQueue.invokeLater(new Runnable() {

             @Override
             public void run() {
            	 Create create = new Create(controler);
            	 m.addObserver(create);
             }
         });    
	}*/

}
