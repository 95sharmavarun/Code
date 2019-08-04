import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;



public class Generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="D:\\ServiceTestGenerator\\";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Class name: ");
		String name=scan.next();
		System.out.println("Enter method1 name: ");
		String method1=scan.next();
		System.out.println("Enter method2 name: ");
		String method2=scan.next();
		System.out.println("Enter method3 name: ");
		String method3=scan.next();
		System.out.println("Enter method4 name: ");
		String method4=scan.next();
		System.out.println("Enter method5 name: ");
		String method5=scan.next();
		File f = new File(src, name + ".java");
		if(!f.exists())
			try {
				f.createNewFile();
				FileWriter fileWriter = new FileWriter(src+name+".java");
			    PrintWriter printWriter = new PrintWriter(fileWriter);
				/*
				 * printWriter.print("Some String");
				 * printWriter.printf("Product name is %s and its price is %d $", "iPhone",
				 * 1000);
				 */
			    String name1=name.replaceAll("Test", "");
			    String mock1=name.replaceAll("ServiceTest", "DAO");
			    String mock2=name.replaceAll("ServiceTest", "Model");
			    String obj= Character.toLowerCase(name.charAt(0)) + name1.substring(1);
			    String mockobj1= Character.toLowerCase(mock1.charAt(0)) + mock1.substring(1);
			    String mockobj2= Character.toLowerCase(mock2.charAt(0)) + mock2.substring(1);
			    printWriter.print("package com.rhs.common.masterdata.serviceTest;\r\n" + 
			    		"\r\n" + 
			    		"import java.util.ArrayList;\r\n" + 
			    		"import java.util.List;\r\n" + 
			    		"\r\n" + 
			    		"import org.junit.Assert;\r\n" + 
			    		"import org.junit.Before;\r\n" + 
			    		"import org.junit.Test;\r\n" + 
			    		"import org.mockito.InjectMocks;\r\n" + 
			    		"import org.mockito.Mock;\r\n" + 
			    		"import org.mockito.Mockito;\r\n" + 
			    		"import org.mockito.MockitoAnnotations;"
			    		+ "\r\n" + 
			    		"import com.rhs.common.masterdata.dao."+mock1+";"+"\r\n" + 
			    		"import com.rhs.common.masterdata.domain."+mock2+";"+"\r\n"
			    		+ "import com.rhs.common.masterdata.service."+name1+";");
			    
			    printWriter.println("");
			    
			    printWriter.print("public class "+ name+"{");
	    
			    printWriter.println("");
			    
			    printWriter.println("@InjectMocks\r\n" + 
			    		"	private "+name1+" "+obj+";");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Mock\r\n" + 
			    		"	private "+mock1+" "+ mockobj1+";\r\n" + 
			    		"\r\n" + 
			    		"	@Mock\r\n" + 
			    		"	private "+mock2+" "+ mockobj2+";");
			    printWriter.println("\r\n");
			    printWriter.print("@Before\r\n" + 
			    		"	public void setUp() throws Exception {\r\n" + 
			    		"		MockitoAnnotations.initMocks(this);\r\n" + 
			    		"	}");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Test\r\n" + 
			    		"	public void "+method1+"Test() { "
			    				+ "\n"
			    				+ "\n final "+mock2+" "+ mockobj2+" = "+" Mockito.mock("+mock2+".class);"
			    				+ "\n Mockito.when(this."+mockobj1+"."+method1+"("+mockobj2+")).thenReturn(1);"
			    				+ "\n Assert.assertNotNull(this."+obj+"."+method1+"("+mockobj2+"));  }");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Test\r\n" + 
			    		"	public void "+method2+"Test() { "
			    				+ "\n final "+mock2+" "+ mockobj2+" = "+" Mockito.mock("+mock2+".class);\r\n" 
			    				+ "\n Mockito.when(this."+mockobj1+"."+method2+"("+mockobj2+")).thenReturn(1);"
			    				+ "\n Assert.assertNotNull(this."+obj+"."+method2+"("+mockobj2+"));  }");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Test\r\n" + 
			    		"	public void "+method3+"Test() {  "
			    				+ "final String code = \"Hello\";\r\n" 
			    				+"Mockito.when(this."+mockobj1+"."+method3+"(code)).thenReturn(this."+mockobj2+");"
			    				+"Assert.assertNotNull(this."+obj+"."+method3+"(code));}");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Test\r\n" + 
			    		"	public void "+method4+"Test() { "
			    				+ "final List<"+mock2+"> value = new ArrayList<>();\r\n" + 
			    				"		Mockito.when(this."+mockobj1+"."+method4+"()).thenReturn(value);\r\n" + 
			    				"		Assert.assertNotNull(this."+obj+"."+method4+"());  }");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Test\r\n" + 
			    		"	public void "+method5+"Test() { "
			    				+ " Mockito.when(this."+mockobj1+"."+method5+"(this."+mockobj2+")).thenReturn(1);\r\n" + 
			    				"		Assert.assertNotNull(this."+obj+"."+method5+"(this."+mockobj2+")); }");

			    printWriter.println("");

			    printWriter.println("}");
			    printWriter.close();
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
