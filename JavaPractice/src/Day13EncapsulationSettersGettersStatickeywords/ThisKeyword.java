package Day13EncapsulationSettersGettersStatickeywords;

public class ThisKeyword {
    int a,b;//instance/class variables
    
    /*void setData(int x,int y) {//local variables
    	a=x;
    	b=y;
    }*/
    
    void setData(int x,int y) {//local variables
    	this.a=x;
    	this.b=y;  //this.a,this.b are class variables
    }
    
    void display() {
    	System.out.println("a : "+a);
    	System.out.println("a : "+b);
    }
    
    ThisKeyword(int x,int y){ //constructor using this keyword
    	this.a=x;
    	this.b=y;
    }
    
    
	public static void main(String[] args) {
		ThisKeyword tw=new ThisKeyword(1,2);
		//tw.setData(1,3);
		tw.display();

	}

}
