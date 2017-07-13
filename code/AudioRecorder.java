package stage1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class AudioRecorder extends JFrame implements Observer {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected  AudioFormat audioFormat;
	protected TargetDataLine parole;
	private AbstractControler controler;

  final JButton captureBtn = new JButton("Capture");
  final JButton stopBtn = new JButton("Stop");

  final JPanel btnPanel = new JPanel();
  final ButtonGroup btnGroup = new ButtonGroup();
  final JRadioButton aifcBtn = new JRadioButton("AIFC");
  final JRadioButton aiffBtn = new JRadioButton("AIFF");
  final JRadioButton auBtn = new JRadioButton("AU",true);
  final JRadioButton sndBtn = new JRadioButton("SND");
  final JRadioButton waveBtn = new JRadioButton("WAVE");

  public static void main( String args[]){
	AbstractModel m = new ConcreteModel(); 
	AbstractControler controler = new ConcreteControler(m);
    AudioRecorder audioRecorder = new AudioRecorder(controler);
    m.addObserver(audioRecorder);
  }

 
  public AudioRecorder(AbstractControler controler){
	this.setControler(controler);  
    captureBtn.setEnabled(true);
    stopBtn.setEnabled(false);
    captureBtn.addActionListener(
    		new ActionListener(){
    	        public void actionPerformed(
    	                                  ActionEvent e){
    	          captureBtn.setEnabled(false);
    	          stopBtn.setEnabled(true);
    	          captureAudio();
    	        }
    	      }
    );
    stopBtn.addActionListener(
      new ActionListener(){
        public void actionPerformed(
                                  ActionEvent e){
          captureBtn.setEnabled(true);
          stopBtn.setEnabled(false);
          parole.stop();
          controler.setParole(parole);
          parole.close();
        }
      }
    );
    getContentPane().add(captureBtn);
    getContentPane().add(stopBtn);

    btnGroup.add(aifcBtn);
    btnGroup.add(aiffBtn);
    btnGroup.add(auBtn);
    btnGroup.add(sndBtn);
    btnGroup.add(waveBtn);

    btnPanel.add(aifcBtn);
    btnPanel.add(aiffBtn);
    btnPanel.add(auBtn);
    btnPanel.add(sndBtn);
    btnPanel.add(waveBtn);

    getContentPane().add(btnPanel);

    getContentPane().setLayout(new FlowLayout());
    setTitle("Recorder");
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setSize(300,120);
    setVisible(true);
  }

  //This method captures audio input from a
  // microphone and saves it in an audio file.
  private void captureAudio(){
    try{

      audioFormat = getAudioFormat();
      DataLine.Info dataLineInfo =
                          new DataLine.Info(
                            TargetDataLine.class,
                            audioFormat);
      parole = (TargetDataLine)
               AudioSystem.getLine(dataLineInfo);
      new CaptureThread().start();
    }catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
  private AudioFormat getAudioFormat(){
    float sampleRate = 8000.0F;
    int sampleSizeInBits = 16;
    int channels = 1;
    boolean signed = true;
    boolean bigEndian = false;
    return new AudioFormat(sampleRate,
                           sampleSizeInBits,
                           channels,
                           signed,
                           bigEndian);
  }//end getAudioFormat
//=============================================//

//Inner class to capture data from microphone
// and write it to an output audio file.
class CaptureThread extends Thread{
  public void run(){
    AudioFileFormat.Type fileType = null;
    File audioFile = null;
    if(aifcBtn.isSelected()){
      fileType = AudioFileFormat.Type.AIFC;
      audioFile = new File("junk.aifc");
    }else if(aiffBtn.isSelected()){
      fileType = AudioFileFormat.Type.AIFF;
      audioFile = new File("junk.aif");
    }else if(auBtn.isSelected()){
      fileType = AudioFileFormat.Type.AU;
      audioFile = new File("junk.au");
    }else if(sndBtn.isSelected()){
      fileType = AudioFileFormat.Type.SND;
      audioFile = new File("junk.snd");
    }else if(waveBtn.isSelected()){
      fileType = AudioFileFormat.Type.WAVE;
      audioFile = new File("junk.wav");
    }//end if

    try{
      parole.open(audioFormat);
      parole.start();
      AudioSystem.write(
            new AudioInputStream(parole),
            fileType,
            audioFile);
    }catch (Exception e){
      e.printStackTrace();
    }//end catch

  }//end run
}//end inner class CaptureThread
//=============================================//

public void update()
{ 
	parole = (TargetDataLine) null;
}


public AbstractControler getControler() {
	return controler;
}


public void setControler(AbstractControler controler) {
	this.controler = controler;
}

}
