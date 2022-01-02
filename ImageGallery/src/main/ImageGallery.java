package main;

import javax.swing.JFrame;

import main.components.ImageViewer;

public class ImageGallery extends JFrame {

	private static final String WINDOW_TITLE = "Image Gallery";
	private static final int WINDOW_WIDTH = 800;
	private static final int WINDOW_HEIGHT = 600;
	
	// Constructor
	public ImageGallery() {		
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		add(new ImageViewer());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// Entry point
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ImageGallery();
			}
		});

	}

}
