
class A {
public int getCode(){ return 2;}
}
class AA extends A {
public int getCode(){ return 3;}
}
class TestClass {
public static void main(String[] args) throws Exception {
A a = new A();
A aa = new AA();
System.out.println(a.getCode()+" "+aa.getCode());
}
public int getCode() {
return 1;
}
}
