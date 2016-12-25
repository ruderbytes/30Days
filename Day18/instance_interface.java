interface I1{}
interface I2{}
class X implements I1,I2{}
class Y extends X implements I1{}

class instanceofWithInterface{
	public static void main(String [] args){
		X x = new X();
		Y y = new Y();
		if(x instanceof I1){System.out.println("x is Instance of I1");}
		if(x instanceof I2){System.out.println("x is Instance of I2");}
		if(y instanceof I1){System.out.println("y is Instance of I1");}
		if(y instanceof I1){System.out.println("y is Instance of I2");}
		if(y instanceof X){System.out.println("y is Instance of X");}
					
	}
}





