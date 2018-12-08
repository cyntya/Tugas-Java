package calculatortest;

public abstract class KalkulatorBeras implements CalculatorService{
    private double x;
    private double y;

    public KalkulatorBeras(double x, double y) {
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
    public double Ping(double x, double y){
        return x * y;
    }
    
    @Override
    public double Po(double x, double y){
        return x / y;
    }
    
    @Override
    public double Lan(double x, double y){
        return x + y;
    }
    
    @Override
    public double Do(double x, double y){
        return x - y;
    }

    @Override
    public String toString() {
        return "KalkulatorBeras{" + "x=" + x + ", y=" + y + '}';
    }
    
}
