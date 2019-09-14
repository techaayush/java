package core.project.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {

	public static void main(String[] args) {

		  try{    
	             FileOutputStream fout=new FileOutputStream("testoutstream.txt");    
	             
	             // writing byte
	             fout.write(67);    
	             fout.close();    
	             System.out.println("success...");    
	             
	             FileOutputStream fout2=new FileOutputStream("testoutstream.txt");    
	             String s="Welcome to java.";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout2.write(b);    
	             fout2.close();    
	             System.out.println("success...");  
	             
	            }catch(Exception e){System.out.println(e);}
		
	         }    
	}


