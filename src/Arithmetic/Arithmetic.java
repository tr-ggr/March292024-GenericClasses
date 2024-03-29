package Arithmetic;

public class Arithmetic<A extends Number, B extends Number> {
    private A num1;
    private B num2;

    public Arithmetic(A num1, B num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public <N extends Number> N add(){
        return (N) new Double(num1.doubleValue() + num2.doubleValue());
    }

    public <N extends Number> N subtract(){
        return (N) new Double(num1.doubleValue() - num2.doubleValue());
    }

    public <N extends Number> N multiply(){
        return (N) new Double(num1.doubleValue() * num2.doubleValue());
    }

    public <N extends Number> N divide(){
        return (N) new Double(num1.doubleValue() / num2.doubleValue());
    }

    public <N extends Number> N getMin(){
        if(num1.doubleValue() < num2.doubleValue()) return (N)num1;
        else return (N)num2;
    }

    public <N extends Number> N getMax(){
        if(num1.doubleValue() > num2.doubleValue()) return (N)num1;
        else return (N)num2;
    }
}
