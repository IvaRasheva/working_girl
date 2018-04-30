package Task01_CalculatorClient;

import static java.lang.Integer.MIN_VALUE;

public class Calculator {
    public String task;
    public double a;
    public double b;



    public Calculator(){
        this.task = "";
        this.a = MIN_VALUE;
        this.b = MIN_VALUE;


    }

    public Calculator(String task, double a, double b){
        this.task = task;
        this.a = a;
        this.b = b;


    }


    public double sumNumbers() {
        double sum = MIN_VALUE;
        if (task.equals("SUM")) {
            sum =  a + b;
        }
//        System.out.println(sum);
        return sum;
    }

    public double subNumbers(){
        double sub = MIN_VALUE;
        if (task.equals("SUB")) {
            sub = a - b;
        }
//        System.out.println(sub);
        return sub;
    }

    public double mulNumbers(){
        double mul = MIN_VALUE;
        if (task.equals("MUL")){
            mul = a * b;
        }
//        System.out.println(mul);
        return mul;
    }

    public double divNumbers(){
        double div = MIN_VALUE;
        if (task.equals("DIV")){
            div = a / b;
        }
//        System.out.println(div);
        return div;
    }

    public double perNumbers(){
        double per = MIN_VALUE;
        if(task.equals("PER")){
            per = b * a / 100;
        }
//        System.out.println(per);
        return per;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
