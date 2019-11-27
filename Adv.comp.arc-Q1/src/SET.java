import java.util.*;
public class SET 
{
	public static int[] arr1;
	private int arraySize;

	public SET(int scale)
	{
		arr1 = new int[scale];
		arraySize = arr1.length;
	}

	public double get(int i)
	{
		return arr1[i];
	}
	
	 public void printUnion(int arr1[], int arr2[], int m, int n)  
	    { 
		 ArrayList<Integer> arr3 = new ArrayList<Integer>(100);
	        if (m > n)  
	        { 
	            int tempp[] = arr1; 
	            arr1 = arr2; 
	            arr2 = tempp; 
	  
	            int temp = m; 
	            m = n; 
	            n = temp; 
	        } 
	        
	        Arrays.sort(arr1); 
	        for (int i = 0; i < m; i++) 
	           arr3.add(arr1[i]); 
	  
	        // Search every element of bigger array in smaller array 
	        // and print the element if not found 
	        for (int i = 0; i < n; i++)  
	        { 
	            if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1) 
	                arr3.add(arr2[i]); 
	        } 
	        System.out.println("the union of set and givingset is");
	        System.out.println(arr3);
	    }
    
	public void intersection(int arr1[],int arr2[],int m,int n) 
	{ 
		ArrayList<Integer> arr3 = new ArrayList<Integer>(100);
		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				if(arr1[i]==arr2[j]) {
				arr3.add(arr1[i]);}
			    
				
			}
		}
		System.out.println("the intersection of givenset ans set is:");
		System.out.println(arr3);
		
		
	}
	
	int binarySearch(int arr[], int l, int r, int x)  
    { 
        if (r >= l)  
        { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then it can only  
            // be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present in array 
        return -1; 
    }
	 public void difference(int arr1[], int arr2[], int m, int n)  
	    { 
		 ArrayList<Integer> arr3 = new ArrayList<Integer>(100);
	        if (m > n)  
	        { 
	            int tempp[] = arr1; 
	            arr1 = arr2; 
	            arr2 = tempp; 
	  
	            int temp = m; 
	            m = n; 
	            n = temp; 
	        } 
	        // Search every element of bigger array in smaller array 
	        // and print the element if not found 
	        for (int i = 0; i < n; i++)  
	        { 
	            if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1) 
	                arr3.add(arr2[i]); 
	        } 
	        System.out.println("the difference of set and giving set is");
	        System.out.println(arr3);
	    }
	 static void cartesian(int arr1[], int arr2[],int n, int n1) 
            { 
		      System.out.println("the Cartesian product of set and giving set is"+"\n");
               for (int i = 0; i < n; i++) 
                  for (int j = 0; j < n1; j++) 
               System.out.print("{"+ arr1[i]+", "+ arr2[j]+"}, "); 
            }
	 static boolean isSubset(int arr1[], int arr2[],int m, int n) 
           { 
              int i = 0; 
              int j = 0; 
               for (i = 0; i < n; i++) 
                { 
                   for (j = 0; j < m; j++) 
                { 
                     if(arr2[i] == arr1[j]) 
                        break; 
                 } 


                 if (j == m) 
                     return false; 
                     } 
                       return true; 
                       } 


	 
        public void isEmpty(int m) {
        	if(m==0) {
        		System.out.println("the Set is Empty");
        		
        	}
        	else 
        		System.out.println("The Set is NOT Empty");
        }
        public int isElement(int arr1[],int x) 
        
        { int i = 0;
		
        
        	
        	
        	 int m=arr1.length;
   
    		for(i=0;i<m;i++) {
    			if(arr1[i]==x)
    			return i;
    		}
    		return -1;
    		
        }
        void isEqual(int arr1[],int arr2[]) {
        	int m=arr1.length;
        	int n=arr2.length;
        	if(n==m) {
        		int i=0;
        		while(arr1[i]==arr2[i]&& i<m)
        		i++;
        		if(i==m-1)
        			System.out.print("SET and Givenset are equal");
        		else
        			System.out.println("SET and Givenset are not equal");
        	}
        	else
        		System.out.println("SET and Givenset are not EQUAL");
           }
        void cardinality(int arr1[]) {
        	int m=arr1.length;
        	System.out.println("the cardinality of SET is: "+m);
        }
       public int []  addElement(int arr1[],int x) {
        	
        	if(isElement(arr1,x)!=-1) {
        		System.out.println("item already exists");
        		return arr1;
        	}
    		else
    		{ 
    			arr1  = Arrays.copyOf(arr1, arr1.length + 1);
    		    arr1[arr1.length - 1] = x;
    		    for(int i=0;i<arr1.length;i++)
    		     System.out.println(arr1[i]+",");
  			}
			return arr1;
			
        	
        	
        }
        int [] removeElement(int arr1[],int x) {
        	int p=isElement(arr1,x);
        	if(p==-1) {
        		System.out.print("there is ni such a item");
        		return arr1;
        	}
        	else {
        	 int[] anotherArray = new int[arr1.length - 1]; 
        	  
             
             for (int i = 0, k = 0; i < arr1.length; i++) { 
       
                 // if the index is 
                 // the removal element index 
                 if (arr1[i] == x) { 
                     continue; 
                 } 
       
                 // if the index is not 
                 // the removal element index 
                 anotherArray[k++] = arr1[i]; 
             } 
       
            System.out.println(x+" has been removed from the set");
             return anotherArray; 
         } 
        	}
   }
        




