package Visualizer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

import DisplayManager.display_manager;
import Util.Util;

public class Visualizer extends JPanel {

	public static final int BAR_WIDTH = 8;
	public static final int BAR_NUM = display_manager.SCREEN_WIDTH / BAR_WIDTH;
	public static final float FPS = (1.0f / 60.0f) * 1000.0f;
	
	public int CurrentIndex;
	
	public Visualizer() {
		
		// initializer array
		m_array = new int[BAR_NUM];
		
		// Fill array
		for (int i = 0; i < BAR_NUM; i++) {
			m_array[i] = i + 1;
		}
		
		Util.ShuffleArray(m_array);
	}
	
	public void Refresh() {
		this.repaint();
	
		Util.SleepFor((long)FPS);
	}
	
	public void run() {
		Algorithms.InsertionSort(m_array, this);
		Util.ShuffleArray(m_array);
		Algorithms.SelectionSort(m_array, this);
		Util.ShuffleArray(m_array);
		Algorithms.BubbleSort(m_array, this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		// fill background black
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, display_manager.SCREEN_WIDTH, display_manager.SCREEN_HEIGHT);
		
		// draw bars
		for (int x = 0; x < m_array.length; x++) {
			
			int height = (int)Util.map(m_array[x], 1, BAR_NUM, 0, display_manager.SCREEN_HEIGHT);
			
			if (x == CurrentIndex) {
				g2d.setColor(Color.RED);
			}
			else {
				g2d.setColor(Color.WHITE);
			}
			
			g2d.fillRect(x * BAR_WIDTH, display_manager.SCREEN_HEIGHT - height, BAR_WIDTH, height);
		}
	}
	
	private int[] m_array;
}
