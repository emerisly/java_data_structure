package arrlist;

import java.util.List;
import java.util.ArrayList;

public class arrAndArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color= {"red","Green","Blue"};
		List<String> colorList=new ArrayList<String>();
		List<String> colorList1=new ArrayList<String>();
		for(String col:color)
			colorList.add(col);
		for(int i=color.length-1;i>=0;i--)
			colorList1.add(i,color[i]);
		

	}

}
