import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		SET arrApp = new SET(200);
		int arr1[]= {1,5,2,3,6,7,8,4};
		int m=arr1.length;
		int arr2[]= {45,3,5,21,87,90,86};
		int n=arr2.length;
		System.out.println("Enter 1 for Union, 2 for intersection, 3 for difference, 4 for Cartesian,"+"\n"+"5 for Subset Check,6 for isEmpty,7 for isElement"
				+ ",8 for isEquel,"+"\n"+"9 for cardinality,10 for addElemet,11 removeElement,12 for display");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4||s==5||s==6||s==7||s==8||s==9||s==10||s==11||s==12) {
			if(s==1) {
				arrApp.printUnion(arr1, arr2, m, n);
			}
			if(s==2) {
				arrApp.intersection(arr1, arr2, m, n);
			}
			if(s==3) {
				arrApp.difference(arr1, arr2, m, n);
			}
			if(s==4) {
				arrApp.cartesian(arr1, arr2, m, n);
			}
            if(s==5) {
            	if(arrApp.isSubset(arr1, arr2, m, n)) 
                    System.out.print("SET is "
                          + "subset of givenset "); 
                else
                    System.out.print("SET is "
                     + "not a subset of givenset");
            }
            if(s==6) {
            	arrApp.isEmpty(m);
            }
            if(s==7) {
            	System.out.print("please enter an integer");
                int x= Integer.parseInt(new Scanner(System.in).nextLine());
                int k=arrApp.isElement(arr1,x);
                if(k!=-1)
                System.out.print(x+"  is in the SET");
                else
                	System.out.print("there is no such item in the SET");
            }
            if(s==8) {
            	arrApp.isEqual(arr1, arr2);
            }
            if(s==9) {
            	arrApp.cardinality(arr1);
            }
            if(s==10) {
            	System.out.println("enter the item that you want to add to the SET: ");
                int y=Integer.parseInt(new Scanner(System.in).nextLine());
                arr1=arrApp.addElement(arr1, y);
            }
            if(s==11) {

                System.out.println("enter a item to delete to the SET");
                int l=Integer.parseInt(new Scanner(System.in).nextLine());
                arr1= arrApp.removeElement(arr1, l);
            }
            if(s==12) {
            	System.out.println("the elements in the SET are:");
            	for(int i=0;i<arr1.length;i++) {
            		System.out.println(arr1[i]+",");
            	}
            }
        


       
            System.out.println("\n"+"Enter 1 for Union, 2 for intersection, 3 for difference, 4 for Cartesian,"+"\n"+"5 for Subset Check,6 for isEmpty,7 for isElement"
    				+ ",8 for isEquel,"+"\n"+"9 for cardinality,10 for addElemet,11 removeElement,12 for display");
    		 s = Integer.parseInt(new Scanner(System.in).nextLine());
	}

	}
}
