import java.awt.*;  
class First extends Frame{  
	First(){  
		Button b = new Button("Click !!");  
		b.setBounds(30,100,80,30);  
  		add(b); 
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);  
	}  
	public static void main(String args[]){  
		First f=new First();  
	}
}
