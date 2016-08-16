package _42_2;

	public class E42LeftRotateString {  
	    public static String reverse(String str){  
	        char[] arr = str.toCharArray();  
	        for(int i = 0;i<(arr.length+1)/2;i++){  
	            char temp = arr[i];  
	            arr[i] = arr[arr.length-i-1];  
	            arr[arr.length-i-1]= temp;  
	        }  
	        return String.valueOf(arr);  
	    }  
	    public static void leftRotateString(String sentence,int index){  
	        if(sentence == null || index >sentence.length() || index <0)  
	            return;  
	        String[] splitStrings = {sentence.substring(0, index),sentence.substring(index, sentence.length())};  
	        String resultBuffer = "";  
	        for(int i =0;i<splitStrings.length;i++){  
	            splitStrings[i] =reverse(splitStrings[i]);  
	            resultBuffer+=splitStrings[i];  
	        }  
	          
	        System.out.println(reverse(resultBuffer));  
	    } 
	}
