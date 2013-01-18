                                                                      
                                                                     
                                                                     
                                             
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
public class Manish {
	static int[][] mul(int a[][],int b1[][],int len){
		
	    int c[][]=new int[20][20];
				for(int i=0;i<=len;i++){
					for(int j=0;j<=len;j++){
						
						for(int k=0;k<=len;k++)
							c[i][j]+=a[i][k]*b1[k][j];
					}
				}
			return c;	
			}
	public static void main(String args[]){
		System.out.println("Tota");
		String str=new String();
		System.out.println("enter the operation you want to perform");
		System.out.println("1. add word\n 2.check connectivity \n 3.check degree \n4.delete a word from file\n 5. look into file\n6.check path between two words");
		Scanner input=new Scanner(System.in);

		
		int q=input.nextInt();
		if(q==1){
			System.out.println("enter the word you want to add (enter n when you want to end)");
			
			while(str.compareTo("n")!=0){
				Scanner b=new Scanner(System.in);
				str=b.nextLine();
				try{
					boolean append=true;
					FileWriter a=new FileWriter("C:\\Users\\HP\\Desktop\\connected1.txt",append);
					a.write("\r\n");
					a.write(str);
					a.close();
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
		}
		if(q==2){
			System.out.println("Enter the word you want to check");
			Scanner inp=new Scanner(System.in);
			String check=inp.nextLine();
			String store=new String();
			try{
				FileInputStream r=new FileInputStream("C:\\Users\\HP\\Desktop\\connected1.txt");
				DataInputStream s=new DataInputStream(r);
				BufferedReader t=new BufferedReader(new InputStreamReader(s));
				String result=new String();
				//System.out.println("i am here.");
				while((store=t.readLine()).compareTo("n")!=0){
					int counter=0;
					for(int i=0;i<3;i++){
					//System.out.println("i am in inner loop");
						if(store.charAt(i)==check.charAt(i)){
							counter++;
							//System.out.println("counter is "+counter);
						}
						else
							continue;
					}
					if(counter==2)
					{
						result=result+" "+store;
					}
				}
				if(result.equals(null))
					System.out.println("word is not isomorphic with any word in file");
				
				else
					System.out.println("word is isomorphic with"+result);
			}catch(Exception e){
				System.out.println("this is message in inner loop"+e.getMessage());
			}
		}
		if(q==3){
			System.out.println("Enter the word");
			Scanner degree=new Scanner(System.in);
			String degstr=degree.nextLine();
			String stored=new String();
			try{
				FileInputStream r=new FileInputStream("C:\\Users\\HP\\Desktop\\connected1.txt");
				DataInputStream s=new DataInputStream(r);
				BufferedReader t=new BufferedReader(new InputStreamReader(s));
				
				//System.out.println("i am here.");
				int deg=0;
				while((stored=t.readLine()).compareTo("n")!=0){
					int counter=0;
					for(int i=0;i<3;i++){
					//System.out.println("i am in inner loop");
						if(stored.charAt(i)==degstr.charAt(i)){
							counter++;
							//System.out.println("counter is "+counter);
						}
						else
							continue;
					}
					if(counter==2)
					{
						deg++;
					}
				}
				System.out.println("degree of "+degstr+" is "+deg);
			}catch(Exception e){
				System.out.println("this is message in inner loop"+e.getMessage());
			}
		}
		if(q==4){
			System.out.println("enter the word you want to delete");
			Scanner del=new Scanner(System.in);
			String delstr=del.nextLine();
			try{
				FileInputStream r=new FileInputStream("C:\\Users\\HP\\Desktop\\connected1.txt");
				DataInputStream s=new DataInputStream(r);
				BufferedReader t=new BufferedReader(new InputStreamReader(s));
				try{
				String d=new String();
				boolean append=true;
				File g=new File("temp.txt");
				FileWriter f=new FileWriter(g,append);
				while((d=t.readLine()).compareTo("n")!=0){
					    if(d.compareTo(delstr)==0){
					    	continue;
					    }else{
						f.write("\r\n");
						f.write(d);
						//System.out.println("hi");
					}
				}
				f.close();
				boolean success=g.renameTo(new File("C:\\Users\\HP\\Desktop\\connected1.txt"));
				if(success){
					System.out.println("file renamed");
				}else
					System.out.println("file not renamed");
				}catch(Exception e){
					System.out.println("we are in innermost loop "+e.getMessage());
				}
			}catch(Exception e){
				System.out.println("you are in 4th loop "+e.getMessage());
			}
		}
		if(q==5){
			System.out.println("words in the file are ");
			String stored=new String();
			try{
				FileInputStream r=new FileInputStream("C:\\Users\\HP\\Desktop\\connected1.txt");
				DataInputStream s=new DataInputStream(r);
				BufferedReader t=new BufferedReader(new InputStreamReader(s));
				while((stored=t.readLine()).compareTo("n")!=0){
				   System.out.println(" "+stored);
					}
					
			}catch(Exception e){
				System.out.println("this is message in inner loop 5"+e.getMessage());
			}
		}
		if(q==6)
		{
			System.out.println("enter first word");
			Scanner b=new Scanner (System.in);
			String first=b.nextLine();
			System.out.println("enter second word");
			Scanner c=new Scanner(System.in);
			String second=c.nextLine();
			String pavan=new String();
			int i=0,fp=0,sp=0,length=0;
			String x[]=new String[20];
			int y[][]=new int[20][20];
			int z[][]=new int[20][20];
			int u[][]=new int[20][20];
			
			try{
				FileInputStream r=new FileInputStream("C:\\Users\\HP\\Desktop\\connected1.txt");
				DataInputStream s=new DataInputStream(r);
				BufferedReader t=new BufferedReader(new InputStreamReader(s));
				while((pavan=t.readLine()).compareTo("n")!=0){
					x[i]=pavan;
					if(pavan.compareTo(first)==0){
					fp=i;
					//System.out.println("fp is "+fp);
					}
					if(pavan.compareTo(second)==0){
						sp=i;
						//System.out.println("sp is "+sp);
					}
					i++;
				}
				length=i;
				for(int k=0;k<length;k++){
					for(int j=0;j<length;j++){
						int iso=0;
						for(i=0;i<3;i++){
							if((x[k]).charAt(i)==(x[j]).charAt(i)){
							iso++;
							
							}
						}
						if(iso==2){
							y[k][j]=1;
							z[k][j]=1;
							
						}else
						{
					      y[k][j]=0;
					      z[k][j]=0;
						}
						//System.out.print(z[k][j]+" ");
					}
					//System.out.print("\n");
					
				}
				int ticket=1;
				
				/*u=mul(z,y,length);
				System.out.println("y is ");
				for(i=0;i<length;i++){
					for(int j=0;j<length;j++){
						System.out.print(" "+y[i][j]);
				}
					System.out.print("\n");
				}
				System.out.println("z is ");
				for(i=0;i<length;i++){
					for(int j=0;j<length;j++){
						System.out.print(" "+z[i][j]);
				}
					System.out.print("\n");
				}
				System.out.println("u is ");
				for(i=0;i<length;i++){
					for(int j=0;j<length;j++){
						System.out.print(" "+u[i][j]);
				}
					System.out.print("\n");
				}
				System.out.println("required number is"+u[fp][sp]);*/
				u=z;
			for(;ticket<=5;ticket++){
				
				System.out.println("there are "+u[fp][sp]+" paths of length "+ticket);
				u=mul(z,y,length);
				z=u;
			}
			
				//System.out.println(first+" is connected with "+second+" with length of "+ticket);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			}
		}
	
		}
