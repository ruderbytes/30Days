class TestClass{
    void Method(Object x) { System.out.println("In Object"); } 
    void Method(Number x) { System.out.println("In Number"); } 
    void Method(Integer x) { System.out.println("In Integer"); } 
    void Method(Long x) { System.out.println("In Long"); } 
    
    public static void main(String[] args){
        double a = 10001; 
        new TestClass().Method(a); 
    }
}
