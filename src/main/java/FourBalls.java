import processing.core.PApplet;

interface Ball{
    int height=500,width = 500;
}

public class FourBalls extends PApplet implements Ball{
    public static void main(String[] args){
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(Ball.height,Ball.width);
    }
    int x1=0,x2=0,x3=0,x4=0;
    @Override
    public void draw() {
        ellipse(x1, getY(1),20,20);
        ellipse(x2,getY(2),20,20);
        ellipse(x3,getY(3),20,20);
        ellipse(x4,getY(4),20,20);
        x1++;
        x2+=2;
        x3+=3;
        x4+=4;
    }

    private int getY(int position) {
        return (Ball.height *position)/ 5;
    }
}
