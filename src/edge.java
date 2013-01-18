import java.util.Scanner;
import java.io.*;
 
 public class edge{
	 public static void add_vertex(int value) throws IOException{
		 try{
				boolean append=true;
				FileWriter a=new FileWriter("C:\\Users\\HP\\Desktop\\connected1.txt",append);
				a.write("\r\n");
				a.write(value);
				a.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			} 
	  }
	 
	 public static void add_edge(int from,int to){
		 
	 }
	 
	 public static boolean connectivity(int value){
		 int connectivity=0;
		return false;
		 
	 }
	 
	 public static void remove_vertex(int value){
		 
	 }
	 
	 public static int[] shortest_path(int from,int to){
		return null;
		 
	 }
	 
	 public static int degree(int value){
		int degree=0;
		 return degree;
		 
	 }
	 
	 public static int no_vertex(){
		 return 0;
	 }
	 
	 public static int no_edge(){
		return 0;
		 
	 }
	 public static void main(String args[]) throws IOException{
		 FileInputStream fstr=new FileInputStream("C:/Users/hp/Desktop/connected1.txt");
		 DataInputStream in =new DataInputStream(fstr);
		 BufferedReader br=new BufferedReader(new InputStreamReader(in));
		 int k=0;
		 String s=new String();
		 while((s=br.readLine())!=null){
			  k++;
		 }
		 System.out.println(k);
		 int[][] matrix=new int[k][k];
		 add_vertex(32);
		 while((s=br.readLine())!=null){
			  k++;
		 }
		 System.out.println(k);
		 
	 }
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 