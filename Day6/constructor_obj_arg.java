class X{
	int x;
		X(int i){
			this.x = i;
		};
        X(X a){
        		this.x = a.x;
        }
}
class demo{
        public static void main(String [] arg){
              	X t = new X(8);
              	System.out.println(t.x);
                X n = new X(t);
                System.out.println(n.x);
        }
}
