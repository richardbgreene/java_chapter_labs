//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class LineRunner
{
	public static void main( String[] args )
   {
		Line ln = new Line();
	
		ln.Line(1,9,14,2);
		ln.setCoordinates(1,9,14,2);
		ln.calculateSlope();
		ln.print();
		
		ln.Line(1,7,18,3);
		ln.setCoordinates(1,7,18,3);
		ln.calculateSlope();
		ln.print();
		
		ln.Line(6,4,2,2);
		ln.setCoordinates(6,4,2,2);
		ln.calculateSlope();
		ln.print();
		
		ln.Line(4,4,5,3);
		ln.setCoordinates(4,4,5,3);
		ln.calculateSlope();
		ln.print();
		
		ln.Line(1,1,2,9);
		ln.setCoordinates(1,1,2,9);
		ln.calculateSlope();
		ln.print();
	
				
		
	}
}