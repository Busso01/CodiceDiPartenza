public class Esercizio_3 {
    public static void main(String[]args){

        Point a = new Point (1.0,1.0);
        Point b = new Point (2.0,2.0);
        System.out.println("La distanza tra a e b vale "+ a.distanza(b));
        double x= a.getX();
        double y= a.getY();
        a.traslato(1.0, 1.0);
        a.ruotatoRispettoOrigine(2.0);
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
        informazioni();
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void informazioni(){
        System.out.println("("+x+","+y+")");
    }

    public void traslato(double dx, double dy){
        x=x+dx;
        y=y+dy;
        informazioni();
    }
    public void ruotatoRispettoOrigine(double k){
        x=x*Math.cos(k)-y*Math.sin(k);
        y=y*Math.cos(k)+x*Math.sin(k);
        informazioni();
    }
    public double distanza(Point b){
        double k=(this.x-b.getX())*(this.x-b.getX())+(this.y-b.getY())*(this.x-b.getY());
        return  Math.sqrt(k);
    }
}
