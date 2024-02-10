public class FibanocciSeries{

  public static void main(String[] args){
    int i = 0;
    int b = 1;
    int c ;
    for(i=0; i<10; i++){

      c = i+b;
      System.out.println(c);
      
      i = b;
      b = c;
      
      
    }
  }
}
