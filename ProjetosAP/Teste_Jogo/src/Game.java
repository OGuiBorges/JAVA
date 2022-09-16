import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, MouseListener{
        
        int right = 0, left = 1, top = 2, down = 3;
        int dir = 0;
	
        int x = 0, y = 0;
        
        int mx = -100, my = -100;
        
        boolean isPressed = false;
        
	public Game() {
                this.addMouseListener(this);
		this.setPreferredSize(new Dimension(480,480));
	}
	
	public void update() {
		if(dir == right){
                     x+=4;
                }else if(dir == down){
                    y+=4;
                }else if(dir == left){
                    x-=4;
                }else if(dir == top){
                    y-=4;
                }
                
                if(x+50 >= 480 && y == 0){
                    dir = down;
                }else if(y+50 >= 480 && x+50 >= 480){
                    dir = left;
                }else if(y+50 >= 480 && x == 0){
                    dir = top;
                }else if(y <= 0 && x <= 0){
                    dir = right;
                }
                if(isPressed){
                    isPressed = false;
                    detectarClique();
                }
                
		
	}
        
        public void detectarClique(){
            if(mx >= x && mx < x+50){
                System.out.println("Clicado");
            }else if(my >= x && my < y+50){
                System.out.println("Clicado");
            }
        }
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 480, 480);
                
                //renderização do objeto
                if(dir == right){
                g.setColor(Color.GREEN);
                }else if(dir == down){
                g.setColor(Color.BLUE);
                }else if(dir == left){
                g.setColor(Color.ORANGE);
                }else if(dir == top){
                g.setColor(Color.WHITE);
                }
		g.fillRect(x, y, 50, 50);
                
                
		g.dispose();
		bs.show();
		
	}
	
	
	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		frame.setTitle("Exercicio Logica");
		frame.add(game);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		new Thread(game).start();
	}

	@Override
	public void run() {
		double fps = 60.0;
		while(true) {
			update();
			render();
			try {
				Thread.sleep((int)(1000/fps));
			} catch (InterruptedException e) {}
		}
		
	}
        
        @Override
        public void mouseClicked(MouseEvent e){
           mx = e.getX();
           my = e.getY();
           isPressed = true;
        }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


	
}