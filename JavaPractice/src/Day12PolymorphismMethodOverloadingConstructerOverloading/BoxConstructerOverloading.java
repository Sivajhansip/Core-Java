package Day12PolymorphismMethodOverloadingConstructerOverloading;

public class BoxConstructerOverloading {
		double width,height,depth;
		
		BoxConstructerOverloading()
		{
		   width=height=depth=0;	
		}
        BoxConstructerOverloading(double w,double h,double d)
        {
        	width=w;
        	height=h;
        	depth=d;
        }
        
        BoxConstructerOverloading(double len)
        {
        	width=height=depth=len;
        }
        
        double volume() {
        	return(width*height*depth);
        }

	

}
