class X{}
class Y extends X{}
class Z extends Y{}
class T extends Z{}

class instance{
	public static void main(String[] args){
		T t = new T();
		if(t instanceof X){System.out.println("Yes");}
	}
}
				
