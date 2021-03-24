package LinkedlistProject;

public class LinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList1<String> list1=new LinkedList1<String>();
		list1.add("Monday");
		list1.add("Tuesday");
		list1.add("Wednesday");
		list1.print();
		System.out.println();
		list1.addFirst("Sunday");
		list1.add(3,"index3");
		list1.print();
		System.out.println();
		list1.set(0, "first");
		list1.print();
		System.out.println();
		list1.printRecursiveForward();
		System.out.println();
		list1.printRecursiveBackward();
		System.out.println("\nPRINT");
		list1.print();
		System.out.println();
		System.out.println("ReverseList:");
		list1.reverseList();
		System.out.println();
		list1.print();
	}
}
		
		/*
LinkedList1<String> list=new LinkedList1<String>();
list.add( "Missouri");
list.add("New Jersey");
list.add("New York");
list.add( "California" ) ;
list.add( "Montanna" ) ;
list.add( "Nevada" ) ;
list.add( "Florida");
System.out.println("\n*** 1Testing add(obj)***\n[ "+list+"]");
list.addFirst( "Washington" ) ;
list.addFirst( "Maryland" ) ;
list.addFirst ( "Delaware");
list.addFirst("Rhode Island");
System.out.println("\n*** 2Testing the addFirst(obj)***\n[ "+list+" ]");
System.out.println("\n*** 3Testing get(i) and size() ****");
for(int i=0; i<list.size();i++)
	System.out.println(list.get(i));

System.out.println("\n***Printforwardusingrecursion*******");
list.printRecursiveForward();
System.out.println("\n****Print using toString********\n[ "+list+" ]");
System.out.println("\n********In Reverse ******");
list.printRecursiveBackward();
System.out.println("\n****Printing out the list as we remove each element from the back*******");

while(list.size()>0) {
	System.out.println(list.remove(list.size()+1));
}

//list.print();

System.out.println("\n******Starting the insert *******");
list.addFirst("Belmar");
list.add(0,"LongBranch");
list.add(0,"AsburyPark");
list.add(0,"RedBank");
list.add("Old Bridge");
list.add(2,"Newark");
list.add(4,"Sayreville");
list.add(list.size(),"PointPleasant");
list.add(6,"Freehold");
list.printRecursiveForward() ;



System.out.println("\n****** Starting remove(i)****");
try{
System.out.println (list.remove (list.size( )));
}
catch(IndexOutOfBoundsException e)
{System.out.println(e);}
System.out.println(list .remove( list.size ( ) - 1));
System.out.println(list .remove(0) ) ;
System.out.println(list .remove(2) ) ;
System.out.println(list .remove(4) ) ;
System.out.println(list .remove(1) ) ;
System.out.println("\n******* Testing Set **********\n"+list);
list.set(0, "Namath");
list.print();
System.out.println(list.size());
try {
list.set(3, "Sauer");
list.set(list.size() -1, "Maynard") ;
}
catch(IndexOutOfBoundsException e) {
	
}

try{
list.set(list.size(),"Namath");
}
catch(IndexOutOfBoundsException e) {
	System.out.println(e);
	list.printRecursiveForward();
	System.out.println("Testing toString");
	System.out.println(list);
}





	}
}
*/


/*


*** 1Testing add(obj)***
[ Missouri New Jersey New York California Montanna Nevada Florida ]

*** 2Testing the addFirst(obj)***
[ Rhode Island Delaware Maryland Washington Missouri New Jersey New York California Montanna Nevada Florida  ]

*** 3Testing get(i) and size() ****
Rhode Island
Delaware
Maryland
Washington
Missouri
New Jersey
New York
California
Montanna
Nevada

***Printforwardusingrecursion*******
Rhode Island
Delaware
Maryland
Washington
Missouri
New Jersey
New York
California
Montanna
Nevada
Florida

****Print using toString********
[ Rhode Island Delaware Maryland Washington Missouri New Jersey New York California Montanna Nevada Florida  ]

********In Reverse ******
Florida
Nevada
Montanna
California
New York
New Jersey
Missouri
Washington
Maryland
Delaware
Rhode Island

****Printing out the list as we remove each element from the back*******
Florida
Nevada
Montanna
California
New York
New Jersey
Missouri
Washington
Delaware
Rhode Island

******Starting the insert *******
RedBank
AsburyPark
Newark
LongBranch
Sayreville
Belmar
Freehold
PointPleasant
Old Bridge

****** Starting remove(i)****
Old Bridge
Freehold
AsburyPark
Newark
Belmar
LongBranch

******* Testing Set **********
RedBank Sayreville PointPleasant 
RedBank
Sayreville
PointPleasant
3
java.lang.IndexOutOfBoundsException: IndexOutOfBounds
RedBank
Sayreville
PointPleasant
Testing toString
RedBank Sayreville PointPleasant 
*/