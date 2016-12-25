class X{}
class Y extends X{}
class Z extends Y{}
class T extends Z{}

class instance{
	public static void main(String[] args){
		Y y = new Z();
		X x = y;
		if(x instanceof X){System.out.println("X");}
		if(x instanceof Y){System.out.println("Y");}
		if(x instanceof Z){System.out.println("Z");}
		if(x instanceof T){System.out.println("T");}
	}
}
				
