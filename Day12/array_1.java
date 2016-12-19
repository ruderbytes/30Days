class TestClass{
public static void main(String args[] ){
	int i = 0 ;
	int[] iA = {10, 20} ;
	/*
	Evaluatio Order Left to right
	iA[0] = i = 30;
	iA[0] = 30;
	*/
	iA[i] = i = 30 ;
	System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + " "+i) ;
	}
}
