
package practica1_competencias;
import javax.swing.JTextArea;


public class Hilo2 extends Thread{
    private JTextArea area;
    Hilo2(JTextArea area){
        this.area=area;
    }
    public void run(){
        int i=0;
        while(i<100){
            area.append(i+"\n");
            i++;
        }
    }
}
