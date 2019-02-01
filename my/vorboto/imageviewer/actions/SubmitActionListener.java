package my.vorboto.imageviewer.actions;

import my.vorboto.imageviewer.ImageViewer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitActionListener implements ActionListener {

    private final ImageViewer imageViewer;
    private final JTextField input;

    public SubmitActionListener(final ImageViewer imageViewer, final JTextField input) {
        this.imageViewer = imageViewer;
        this.input = input;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dir = input.getText();
        imageViewer.submit(dir);
    }
}
