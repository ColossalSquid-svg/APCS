

public class Main {
  
  public static void sort(int a[])
{
      int n = a.length;
        for (int i = 1; i < n; ++i) 
        {
            int k = a[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && a[j] > k) 
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j+1] = k;
        }
}
    
    public static void main(String[] args) 
    {
    
      // list of students
      
      int arr[] = {6, 5, 8, 1, -10, 2, 9, 3, 7,100};
      sort(arr);
      for(int i = 0; i < arr.length; i++)
      {
        System.out.println(arr[i]);
      }
       
        
      
  }
}
