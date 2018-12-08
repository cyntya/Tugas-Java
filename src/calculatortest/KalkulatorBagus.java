package calculatortest;

public abstract class KalkulatorBagus implements CalculatorAdvanceService{
    private double x;
    private double y;

    public KalkulatorBagus(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public double Akar(double x){
        return Math.sqrt(x);
    }
    
    @Override
    public double Pangkat(double x, double y){
        return Math.pow(x, y);
    }

    @Override
    public String toString() {
        return "KalkulatorBagus{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
