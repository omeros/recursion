public class Ex14
{
   /**
   *Class constructor.
   */
    
   public Ex14 () //empty constractor
    {
    }
    /**
     *returns the Greatest common divisor betwin two numbers
     *@param two natural numbers
     */
    public static int gcd(int n, int m)   //this method return the Greatest common divisor betwin two numbers .
    {
      
        if (n>m)
        {
            return  gcd1(n,m);
        }
        if (n<m)
        {
            return  gcd1(m,n);
        }
        else return n;
     }
    /**
     * returns the Greatest common divisor betwin two numbers
     * @param two natural numbers, n>m
     */
     
     
     public static int gcd1(int n, int m)  // gcd - Assuming n>m 
    {
      if(n%m ==0 )
      {
          return m;
      }
      else 
      {
      return  gcd1 (m,n%m);
      }
    }
    /**
     * 
     * returns true if there is no common divisor number betwean values[j] to values [n], otherwis false
     * @param array and two natural numbers
     */
    
    
    public static boolean oneGCD ( int [] values , int n,int j ) //this method recives an array and index . and chacks if there is any number at the array with common divisor to  the  number at that index at the  array. from index biger than the first index  to the smale index
    {
       
      if (n==j)
      {
            return true;
      }
      else
      {
       if (gcd( values [j],values[n]) !=1 )
        {
        return false;
        }
        else 
        {
         return   oneGCD (values, n-1,j );
        } 
      }
    }
     /**
      * returns true  if there is no commone divisor at the numbers  between  the index i to index n, at  the array
      * @param array,  two natural numbers
      */
    
    public static boolean checkGCD ( int [] values , int n , int i ) //this method recives an array chacks if there is any number at the array with common divisor to  any other number at the array
    {
      if (i==values.length-1)
    {
         return true;
    }
      else
     {
       if(  oneGCD(values,n,i)== false)
     {
         return false;
      }
      else
      {
          return checkGCD(values, n, i+1) ;
      }
     }
    }
    
    /**
     * returns true  if there is no commone divisor   between  the numbers at the array
     * @param array, two natural numbers  array is length and the firs index
     * 
     */
    
        
    public static boolean checkGCD(  int [] values )     //this method recives an array chacks if there is any number at the array with common divisor to  any other number at the array
    {
        return checkGCD (  values , values.length-1,0 );
    }
    
    /**
     * return the number of the lagal rouths from a givven two index to the to the right down corner of the matrix
     * 
     * @param two dimentional array and two indexes
     */   
    
    public static int countPaths (int [][] mat,int i, int j ) ////This method gets two-dimensional array and returns the number of possible legal routes to the down right corner
    {
                
      if (i==mat.length-1 && j==mat[i].length-1)
     {
         return 1;
     }          
               
     if  ((i>mat.length-1)||(j>mat[i].length-1) )
     {
         return 0;
     }
     
    else
    {
        int first = mat[i][j];
        int small=first%10;                    
        int big=first/10;
        
        return countPaths(mat,i+small,j+big)+ countPaths(mat,i+big,j+small);
                   
    
    } 
    
   }
   
   
   
   /**
    * 
    * returns the number of the lagal rouths from the indexes 0,0 to the right down corner of the matrix
    * @param two dimentional array and two indexes 0,0
    */
   public static int countPaths (int[][] mat)   // the same mathod but starts from the indexes 0,0
    {
         return countPaths (mat,0,0); 
    }   
     




}
    
   


    






        
