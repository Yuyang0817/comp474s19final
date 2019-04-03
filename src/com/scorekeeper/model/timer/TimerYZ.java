package timer;

import javax.swing.*;  
import java.awt.HeadlessException;  
import java.awt.BorderLayout;  
import java.awt.FlowLayout;  
import java.awt.Font;  
import java.awt.event.ActionListener;  
import java.awt.event.ActionEvent;  
   

public class Timer extends JFrame {  
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String INITIAL_LABEL_TEXT = "00:00:00 000";  
   
      
    private CountingThread thread = new CountingThread();  
   
    // record the start time  
    private long programStart = System.currentTimeMillis();  
   
    // pause from beginning  
    private long pauseStart = programStart;  
   
    // pause time total  
    private long pauseCount = 0;  
   
    private JLabel label = new JLabel(INITIAL_LABEL_TEXT);  
   
    private JButton startPauseButton = new JButton("Start");  
   
    private JButton resetButton = new JButton("reset");  
   
    private ActionListener startPauseButtonListener = new ActionListener() {  
        public void actionPerformed(ActionEvent e) {  
            if (thread.stopped) {  
                pauseCount += (System.currentTimeMillis() - pauseStart);  
                thread.stopped = false;  
                startPauseButton.setText("pause");  
            } else {  
                pauseStart = System.currentTimeMillis();  
                thread.stopped = true;  
                startPauseButton.setText("continue");  
            }  
        }  
    };  
   
    private ActionListener resetButtonListener = new ActionListener() {  
        public void actionPerformed(ActionEvent e) {  
            pauseStart = programStart;  
            pauseCount = 0;  
            thread.stopped = true;  
            label.setText(INITIAL_LABEL_TEXT);  
            startPauseButton.setText("Start");  
        }  
    };  
   
    public Timer(String title) throws HeadlessException {  
        super(title);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocation(300, 300);  
        setResizable(false);  
   
        setupBorder();  
        setupLabel();  
        setupButtonsPanel();  
   
        startPauseButton.addActionListener(startPauseButtonListener);  
        resetButton.addActionListener(resetButtonListener);  
   
        thread.start(); // keep count thread running  
    }  
   
      
    private void setupBorder() {  
        JPanel contentPane = new JPanel(new BorderLayout());  
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));  
        this.setContentPane(contentPane); 
    }  
   
    // button  
    private void setupButtonsPanel() {  
        JPanel panel = new JPanel(new FlowLayout());  
        panel.add(startPauseButton);  
        panel.add(resetButton);  
        add(panel, BorderLayout.SOUTH);  
    }  
   
    // Label setting  
    private void setupLabel() {  
        label.setHorizontalAlignment(SwingConstants.CENTER);  
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 40));  
        this.add(label, BorderLayout.CENTER);  
    }  
   
    // main  
    public static void main(String[] args) {  
        try {  
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
   
        Timer frame = new Timer("Timer");  
        frame.pack();  
        frame.setVisible(true);  
    }  
   
    private class CountingThread extends Thread {  
   
        public boolean stopped = true;  
   
        private CountingThread() {  
            setDaemon(true);  
        }  
   
        @Override  
        public void run() {  
            while (true) {  
                if (!stopped) {  
                    long elapsed = System.currentTimeMillis() - programStart - pauseCount;  
                    label.setText(format(elapsed));  
                }  
   
                try {  
                    sleep(1);  // refresh display 1ms
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                    System.exit(1);  
                }  
            }  
        }  
   
        // format ms  
        private String format(long elapsed) {  
            int hour, minute, second, milli;  
   
            milli = (int) (elapsed % 1000);  
            elapsed = elapsed / 1000;  
   
            second = (int) (elapsed % 60);  
            elapsed = elapsed / 60;  
   
            minute = (int) (elapsed % 60);  
            elapsed = elapsed / 60;  
   
            hour = (int) (elapsed % 60);  
   
            return String.format("%02d:%02d:%02d %03d", hour, minute, second, milli);  
        }  
    }  
}  