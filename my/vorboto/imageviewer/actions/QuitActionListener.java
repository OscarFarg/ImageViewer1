package my.vorboto.imageviewer.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
