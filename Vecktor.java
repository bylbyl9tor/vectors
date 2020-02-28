package testPackaje;

public class Vecktor {
    private double x;
    private double y;
    private double z;
    Vecktor(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double length() {
        return Math.sqrt(x*x+y*y+z*z);
    }
    public double skMultiply(Vecktor vecktor){
        return vecktor.x*x+vecktor.y*y+vecktor.z*z;
    }
    public Vecktor vkMultiply(Vecktor vecktor)
    {
        return new Vecktor(
                y*vecktor.z-z*vecktor.y,
                z*vecktor.x-x*vecktor.z,
                x*vecktor.y-y*vecktor.x);
    }
    public double Angel(Vecktor vecktor){
        return skMultiply(vecktor)/length()*vecktor.length();
    }
    public Vecktor Sum(Vecktor vecktor)
    {
        return new Vecktor(
                x+vecktor.x,
                y+vecktor.y,
                z+vecktor.z);
    }
    public Vecktor Res(Vecktor vecktor)
    {
        return new Vecktor(
                x-vecktor.x,
                y-vecktor.y,
                z-vecktor.z);
    }
    public static Vecktor[] generate(int n){
        Vecktor[] vecktors=new Vecktor[n];
        for(int i=0; i<n;i++){
            vecktors[i]=new Vecktor(
                    Math.random(),
                    Math.random(),
                    Math.random());
        }
        return vecktors;
    }
    @Override
    public String toString() {
        return "Vector {" + x + ',' + y+',' + z+'}';
    }
}
