package my.vorboto.imageviewer.actions;

import my.vorboto.imageviewer.ImageViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreviousActionListener implements ActionListener {

    private ImageViewer imageViewer;

    public PreviousActionListener(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        imageViewer.decrease();
    }
}
