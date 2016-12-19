class Test{
public static void main(String[] args){
int i = 4;
/*Array dimension are evaluated form left to right*/
int ia[][][] = new int[i][i = 3][i];
/*Most Important*/
System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
}
}
