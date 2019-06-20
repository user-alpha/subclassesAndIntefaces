//1
class Room{
	
	private double width;
            private double length;
            private int floor;

//a            
        private Room(){
	    width = 10.0;
	    length = 120.5;
	    floor = 1;
	    }

//b        
  public double getWidth() {
      return width;
   }
    public void setWidth(double width) {
      if (width <= 0){
	  }
        else{this.width = width;
		}			
	}
  
  public double getLength() {
      return length;
   }
    public void setLength(double length) {
      if(length <= 0){		  
	  }
	  	else{this.length = length;
        }
	}
	
  public double getFloor() {
      return floor;
   }
    public void setFloor(int floor) {
      this.floor = floor;
   }
    //c		
  public Room(double length, double width, int floor){
	    this.length = 12.5; 
            this.width = 10;
            this.floor = 1;	 
}
  public static void main (String [] args){
}

 
    //d
class newclass extends Room{

    public newclass(double length, double width, int floor) {
        super(length, width, floor);
    }
 public String toString() {    
 return String.format(getLength() + "x" + getWidth() + "on" + getFloor());
 }
}   
 //e

 interface Comparable implements Room{
 public void CompareTo();
     CompareTo[] array = {floor,length,width}
             
 
 }            
 }
         
         
   //f            
    class Classroom extends Room{
        private int numStudents;

    public Classroom(double length, double width, int floor) {
        super(length, width, floor);
    }
         Math.max(Classroom);
        
    }
              

    //g
    public Classroom(double length, double width, int floor, int numStudents){
            this.length = 12.5; 
            this.width = 10;
            this.floor = 1;
            this.numStudents;
    }     
    
//h
       
   public String toString(){
            return ;
   
    }  
   
  static void array() {
    // code to be executed
}
    
}
		


