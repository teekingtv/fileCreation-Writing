import java.util.*;
import java.lang.*;
import java.io.*;

public class createfile {
	
	private Formatter fmat;
	
	public void openFile(){
		try{
			fmat = new Formatter("teekingfile.txt");
		}
		catch(Exception exc){
			System.out.println("You have an error");
		}
	}
	public void addRecords(){
		fmat.format("%s%s%s", "1 ", "Tee ", "King");
	}
	
	public void closeFile(){
		fmat.close();
	}

}
