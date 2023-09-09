package logic;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * clase TimeControl para settear el tiempo y mantener el control de el mediante:
 * start - inicia el cronometro
 * pause - detiene el cronometro
 * reset - reiniciia el cronometro
 * getElapsedseconds - regresa el tiempo transcurrido en segundos
 * isRunning - verifica si esta corriendo el cronometro
 * getFormatted time - nos da el formato en minutos
 * @author Drach
 */
public class TimeControl {
    private Timer timer;
    private int elapsedSeconds;
    private boolean isRunning;

    public TimeControl() {
        
        elapsedSeconds = 0;
        isRunning = false;

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (isRunning) {
                    elapsedSeconds++;
                    
                }
            }
        });
    }

    public void start() {
        if (!isRunning) {
            timer.start();
            isRunning = true;
        }
    }

    public void pause() {
        if (isRunning) {
            timer.stop();
            isRunning = false;
        }
    }

    public void reset() {
        elapsedSeconds = 0;
        isRunning = false;
        timer.stop();
    }

    public int getElapsedSeconds() {
        return elapsedSeconds;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public String getFormattedElapsedTime() {
        int minutes = elapsedSeconds / 60;
        int seconds = elapsedSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
