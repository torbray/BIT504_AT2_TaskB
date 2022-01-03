package main.components;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageViewer extends JPanel {
	
	private BufferedImage myPicture;
	private JLabel picLabel;
	
	int image_width = getWidth();
	int image_height = (int)(getHeight() * 0.8);
	
	public ImageViewer() {
		initImgButton();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public void initImgButton() {
		JButton jbutton = new JButton("Load Image");
		jbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadImage();
				
			}
			
		});
		
		add(jbutton);
	}
	
	public void loadImage() {
		String filepath = "src/main/imgs/Thinking-of-getting-a-cat.png";
		
		try {
			myPicture = ImageIO.read(new File(filepath));
			picLabel = new JLabel(new ImageIcon(myPicture));
			
			add(picLabel);
			validate();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
