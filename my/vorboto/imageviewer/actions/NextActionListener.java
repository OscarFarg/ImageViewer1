package my.vorboto.imageviewer.actions;

import my.vorboto.imageviewer.ImageViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextActionListener implements ActionListener {

    private ImageViewer imageViewer;

    public NextActionListener(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        imageViewer.increase();
    }
}
