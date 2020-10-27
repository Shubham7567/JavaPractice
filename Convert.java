class Convert {
	public static void main(String[] args) throws java.io.IOException
	{	
		char choice='y';
		do{
			
			System.out.print("Enter Character:");
            int ch=0;
            ch = System.in.read();
			
			char res;
			res=(char)ch;
			
			if(ch>=65 && ch<=90){
				ch = ch + 32;
			}
			else if(ch>=97 && ch<=122){
				ch = ch - 32;
			}
			res=(char)ch;
			System.out.println("After Converting:" + res);
			
			
			System.out.print("Do you want to continue:");
			
            ch = System.in.read();
            ch = System.in.read();
            choice = (char)ch;
		}while(choice =='y');
	}
}