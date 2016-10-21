package lifegame;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import javax.swing.JPanel;  
import javax.swing.Timer;  
  
/** 
 *  
  */  
  
public class WorldMap extends JPanel {  
  
    private static final long serialVersionUID = -336975817478756636L;  
  
    private final int width = 22;  
  
    private final int height = 22;  
  
    private final char WORLD_MAP_NONE = 'N';  
  
    private final char WORLD_MAP_ALIVE = 'A';  
  
    private final char[][] world = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A',  
                    'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A',  
                    'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'N',  
                    'N' },  
            { 'N', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'N' },  
            { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',  
                    'A' }, 
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N',  
                    'N' },  
  
    };  
  
   private final char[][] world2 = {  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'A', 'A', 'A', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'A', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },  
            { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }  
  
    };  
  
   // private Image none = LifeGameImages.NONE.getImage();  
  // private Image alive = LifeGameImages.ALIVE.getImage();  
  
    /** 
     * ��ǰϸ����һ״̬ 
     */  
    private char[][] nextStatus = new char[world.length][world[0].length];  
  
    private char[][] tempStatus = new char[world.length][world[0].length];  
  
    private Timer timer;  
  
    // ����֮֡�����ʱ��ÿ��60֡  
    private final int DELAY_TIME = 1200;  
  
    public WorldMap() {  
        this.startAnimation();  
    }  
  
    /** 
     * ��ͼ�ν��� 
     *  
     */  
    @Override  
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        for (int i = 0; i < nextStatus.length; i++) {  
            for (int j = 0; j < nextStatus[i].length; j++) {  
                if (nextStatus[i][j] == WORLD_MAP_ALIVE) {  
                    g.fillRect( j * width, i * height, width, height);  
                   
                } else {  
                	 g.drawRect( j * width, i * height, width, height); 
                }  
            }  
        }  
    }  
  
    /** 
     * �ı�ϸ��״̬ 
     *  
        */  
    public void changeCellStatus() {  
    	int row,col;
    	for(row=0;row<world.length;row++)
    		for(col=0;col<world[0].length;col++){
    			if(neighborsCount(row,col)==2)
    				nextStatus[row][col]=tempStatus[row][col];
    			else if(neighborsCount(row,col)==3)
    				nextStatus[row][col]='A';
    			else nextStatus[row][col]='N';
    		}
    	copyWorldMap();
    }   
  
    /** 
     * ��ȡ��ǰ������ٽ�ϸ������ 
     *  
         */  
    public int neighborsCount(int row, int col) {
    	int count=0;
    	int i=0;
    	int j=0;
    	for(i=row-1;i<row+2;i++)
    		for(j=col-1;j<col+2;j++){
    			if(i<0||i>=tempStatus.length||j<0||j>=tempStatus[0].length)
    				continue;
    			
    			if(i!=row&&j!=col){
    				if(tempStatus[i][j]=='A')
    					count++;
    			}
    			
    		}
    	return count;
    }  
  
    /** 
     * ��ʼ���� 
     *  
         */  
    private void startAnimation() {  
        for (int row = 0; row < world.length; row++) {  
            for (int col = 0; col < world.length; col++) {  
                nextStatus[row][col] = world[row][col];  
                tempStatus[row][col] = world[row][col];  
            }  
        }  
        // ������ʱ��  
        timer = new Timer(DELAY_TIME, new ActionListener() {  
  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                changeCellStatus();  
                repaint();  
            }  
        });  
        // ������ʱ��  
        timer.start();  
    }  
  
    /** 
     * ���Ƶ�ͼ 
     *  
 
     */  
    public void copyWorldMap() {  
        for (int row = 0; row < nextStatus.length; row++) {  
            for (int col = 0; col < nextStatus[row].length; col++) {  
                tempStatus[row][col] = nextStatus[row][col];  
            }  
        }  
    }  
}  