class outer{
	static class inner1{
		static class inner2{
			static class inner3{
				static class inner4{
					static void RunMe(){
						System.out.println("Chained Nested Classes");
					}
				}
			}
		}
	}
}

class runner{
	public static void main(String[] args){
		outer.inner1.inner2.inner3.inner4.RunMe();
	}
}
	
