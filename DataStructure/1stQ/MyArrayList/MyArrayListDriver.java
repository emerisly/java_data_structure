package MyArrayList;

public class MyArrayListDriver {


	public static void sort (MyArrayList<String> list) {
		MyArrayList<String> templist=new MyArrayList<String>(list.size());
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i;j<list.size()-i-1;j++)
				if(list.get(i).compareTo(list.get(i+1))>1) {
					String temp=list.get(i+1);
					list.set(i+1, list.get(i));
					list.set(i,temp);
				}
			}
		}
	
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		System.out.println(" ********** Testing Program 2B ************ ");
		System.out.println(" ********** Testing the methods add, get, size , reallocate************ ");
		MyArrayList<String> list2=new MyArrayList<String>(10);
		list2.add("Namath");
		list2.add("Snell");
		list2.add("Boozer");
		list2.add("Biggs");
		list2.add("Sauer");
		list2.add("Maynard");
		list2.add("Atkinson");
		list2.add("Sample");
		list2.add("Dockery");
		list2.add("Philbin");
		list2.add("Baker");
		list2.add("Parelli");
		for(int i=0;i<list2.size();i++)
			System.out.println(list2.get(i));
		//end for
		
		System.out.println(" \n********** Testing the methods add(int, obj) ************ ");
		list2.add(0,"Bradshaw");
		list2.add(2,"Swann");
		list2.add(4,"Harris");
		list2.add(6,"Mantle");
		list2.add(8,"Pasterini");
		list2.add(10,"Block");
		list2.add(12,"Unitas");
		list2.add(14,"Jones");
		list2.add(16,"Riggins");
		list2.add(18,"Strawberry");
		list2.add(20,"Johnson");
		list2.add(22,"Sayers");
		list2.add(24,"Dykstra");
		for(int i=0;i<list2.size();i++)
		{	
			System.out.println(list2.get(i));
		}
		System.out.println(" \n********** Testing the methods remove(i) ************ ");
		
		for(int i=0;i<list2.size()/2;i++)
		{
			System.out.println(list2.get(i));
		}
		System.out.println(" \n********** Testing the methods set(i,obj) ************ ");
		list2.set(0, "Long Branch");
		list2.set(2, "Belmar");
		list2.set(4, "Asbury Park");
		list2.set(list2.size()-1, "Red Bank");
		for(int i=0;i<list2.size();i++)
		{	
			System.out.println(list2.get(i));
		}
		System.out.println(" \n********** Testing the methods indexOf(obj) ************ ");
		System.out.println(list2.indexOf("Long Branch"));
		System.out.println(list2.indexOf("Riggins"));
		System.out.println(list2.indexOf("Baker"));
		System.out.println(list2.indexOf("Red Bank"));
		System.out.println(list2.indexOf("Montreal"));
		
		System.out.println(" \n********** Testing the methods isEmpty() and remove(Obj) ************ ");
		
		while(!list2.isEmpty())
		{
			System.out.println(list2.remove(0));
		}
		System.out.println("The size is now " + list2.size());
		System.out.println(" \n********** Testing the try catch for get(i)  ************ ");
		//Re-populate the list
		list2.add("Namath");
		list2.add("Snell");
		list2.add("Boozer");
		list2.add("Biggs");
		list2.add("Sauer");
		list2.add("Maynard");
		list2.add("Atkinson");
		list2.add("Sample");
		list2.add("Dockery");
		list2.add("Philbin");
		list2.add("Baker");
		list2.add("Parelli");
		try {
			list2.get(-2);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	System.out.println(e);
		}//end try catch
		try {
			list2.get(1000);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	System.out.println(e);
		}//end try catch
		try {
			list2.get(list2.size());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	System.out.println(e);
		}//end try catch
		
		
		/*
		
		
		MyArrayList<String> list=new MyArrayList<String>(10);
		
		list.add("monday");
		list.add("tuesday");
		list.add("wednesday");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		
		
		list.add(1,"yeee");
		list.add(3,"haha");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		
		
		System.out.println(list.remove(0));
		System.out.println();
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		
		System.out.println(list.set(0, "addIt"));
		System.out.println();
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		
		System.out.println(list.get(2));
		System.out.println();
		
		sort(list);

		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		*/
	}

}
