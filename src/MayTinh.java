/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maidu
 */
public class MayTinh {
    private double a;
    private double b;
    public MayTinh(){
                this.a=0;
                this.b=0;
        }
    public MayTinh (double a,double b) {
		this.a=a;
                this.b=b;
	}  

    
    public double getA() {
		return a;
	}
    public void setA(double x) {
		a = x;
	}
    public double getB() {
		return b;
	}
    public void setB(double y) {
		b = y;
	}
    public double cong(){
                return a+b;
        }
    public double tru(){
                return a-b;
        }
    public double nhan(){
                return a*b;
        }
    public double chia(){
                return a/b;
        }
    
}
