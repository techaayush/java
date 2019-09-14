package core.project.io;

import java.io.FileInputStream;

public class FileInputStreamExample1 {

	public static void main(String[] args) {

		 try{    
	            FileInputStream fin=new FileInputStream("testout.txt");    
	            int i=fin.read();  
	            
	            // reading single character as a byte
	            System.out.print((char)i+"\n");    
	            
	            FileInputStream finNew =new FileInputStream("testout.txt");  
	            
	            // reading all characters
	            while((i=finNew.read())!=-1){    
	                System.out.print((char)i);    
	               }  
	            
	            fin.close(); 
	            finNew.close();    
	          }catch(Exception e){System.out.println(e);
	          }    
	         }    
	}


