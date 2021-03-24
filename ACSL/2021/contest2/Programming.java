package contest2;

import java.util.*;

public class Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="This is an Example of Sorting an interesting string";
		System.out.println(rearrangedString(s));

	}
	
    public static String rearrangedString(String s) {
    	
        ArrayList<String> input = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
         char temp = s.charAt(i);
         if(Character.isLetter(temp)||Character.isDigit(temp)){
             input.add(""+temp);
             }
        }
        //Arrays.sort(input,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        //System.out.println(Arrays.toString(input));
        
        Collections.sort(input);
        //System.out.println(input);
        
        HashMap<String, Integer> answer = new HashMap<String, Integer>();
        int inputcnt=0;
        while(inputcnt<input.size()){
            String st = input.get(inputcnt);
            if(answer.containsKey(st)){
            	answer.replace(st,answer.get(st)+1);
                //System.out.println("replaced!");
            }
            else{
            	answer.put(st,1);
            }
            inputcnt++;
        }
        //System.out.println(answer);
        
        String[] output=new String[answer.size()];
        for(Map.Entry<String,Integer> entry:answer.entrySet()) {
        	if(output[entry.getValue()]==null){
        		output[entry.getValue()]=entry.getKey();
        	}else {
        		output[entry.getValue()]+=entry.getKey();
        	}
        }
        //System.out.println(Arrays.toString(output));
        
        String printAnswer="";
        
        int count=0;
        for(int i=output.length-1;i>0;i--) {
        	if(output[i]!=null) {
        		output[i]=sortString(output[i]);
        		if(count%2!=0) {
        			output[i]=reverseString(output[i]);
        		}
        		printAnswer+=i+output[i]+",";
        		count++;
        	}
        }
        
        //System.out.println(Arrays.toString(output));
        //System.out.println(printAnswer);
        
        return printAnswer.substring(0,printAnswer.length()-1);

    }
    
    public static String sortString(String input) 
    { 
        char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        String str = new String(tempArray);
        return str;
    } 
    
    public static String reverseString(String str){  
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }  

}
