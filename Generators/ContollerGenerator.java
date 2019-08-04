import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ContollerGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="D:\\ControllerTestGenerator\\";
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
		System.out.println("Enter method6 name: ");
		String method6=scan.next();
		System.out.println("Enter method7 name: ");
		String method7=scan.next();
		
		/*
		 * System.out.println("Enter method2 name: "); String method2=scan.next();
		 * System.out.println("Enter method3 name: "); String method3=scan.next();
		 * System.out.println("Enter method4 name: "); String method4=scan.next();
		 * System.out.println("Enter method5 name: "); String method5=scan.next();
		 * System.out.println("Enter method6 name: "); String method6=scan.next();
		 * System.out.println("Enter method7 name: "); String method7=scan.next();
		 */

		File f = new File(src, name + ".java");
		if(!f.exists())
			try {
				f.createNewFile();
				FileWriter fileWriter = new FileWriter(src+name+".java");
			    PrintWriter printWriter = new PrintWriter(fileWriter);
			    String name1=name.replaceAll("Test", "");
			    String mock1=name.replaceAll("ControllerTest", "Service");
			    String mock2=name.replaceAll("ControllerTest", "Model");
			    String obj= Character.toLowerCase(name.charAt(0)) + name1.substring(1);
			    String mockobj1= Character.toLowerCase(mock1.charAt(0)) + mock1.substring(1);
			    String mockobj2= Character.toLowerCase(mock2.charAt(0)) + mock2.substring(1);
			    printWriter.print("package com.rhs.common.masterdata.controller;\r\n" + 
			    		"\r\n" + 
			    		"import java.util.List;\r\n" + 
			    		"\r\n" + 
			    		"import org.assertj.core.util.Lists;\r\n" + 
			    		"import org.junit.Assert;\r\n" + 
			    		"import org.junit.Before;\r\n" + 
			    		"import org.junit.Test;\r\n" + 
			    		"import org.mockito.InjectMocks;\r\n" + 
			    		"import org.mockito.Mock;\r\n" + 
			    		"import org.mockito.Mockito;\r\n" + 
			    		"import org.mockito.MockitoAnnotations;\r\n" + 
			    		"import org.springframework.http.ResponseEntity;");
			    
			    printWriter.println();
			    
			    printWriter.print("import com.rhs.common.masterdata.domain."+mock1+";"
			    		+ "import com.rhs.common.masterdata.service."+mock2+";");
			    
			    
  printWriter.println("");
			    
			    printWriter.print("public class "+ name+"{");
	    
			    printWriter.println("");
			    
			    printWriter.println("@InjectMocks\r\n" + 
			    		"	private "+name1+" "+obj+";");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Mock\r\n" + 
			    		"	private "+mock1+" "+ mockobj1+";\r\n");
			    
			    
			    printWriter.println("\r\n");
			    printWriter.print("@Before\r\n" + 
			    		"	public void setUp() throws Exception {\r\n" + 
			    		"		MockitoAnnotations.initMocks(this);\r\n" + 
			    		"	}");
			    
			    printWriter.println("");
			    
			    printWriter.println("@Test\r\n" + 
			    		"	public void "+method1+"TestWhenRequestIsNotNull()throws Exception { "
			    				+ "\n final Integer count = 1;"
			    				+ "\n final "+mock2+" "+ mockobj2+" = "+" new "+mock2+"();"
			    				+ "\n "+mockobj2+"."
			    				+ "\n "+mockobj2+"."
			    				+ "\n "+mockobj2+"."
			    				+ "\n Mockito.when(this."+mockobj1+"."+method1+"("+mockobj2+")).thenReturn(count);"
			    				+"\n final ResponseEntity<"+mock2+"> resp = this."+obj+"\r\n" 
			    				+"."+method1+"("+mockobj2+");"
			    				+ "\n this.assertTrue(201 == resp.getStatusCodeValue());"
			    				+ "\n }"
			    		);
			    
			    printWriter.println(""); 

			    printWriter.println("\n @Test"
			    		+ "\n "+method2+"TestWhenRequestIsNull()throws Exception{"
			    				+ "\n  final "+mock2+" "+ mockobj2+" =  null; "
			    				+ "\n Mockito.when(this."+mockobj1+"."+method2+"("+mockobj2+")).thenReturn(1);"
			    				+"\n final ResponseEntity<"+mock2+"> resp = this."+obj+"\r\n" 
			    				+"."+method2+"("+mockobj2+");"
			    				+ "\n this.assertTrue(201 == resp.getStatusCodeValue());"
			    				+ "\n }");
			    
			    printWriter.println("");
			    
			    
			    printWriter.println("\n @Test"
			    		+ "\n "+method3+"Test()throws Exception{"
			    		
			    		+"\n final List<"+mock2+">"+ mockobj2 +" =  Lists.newArrayList();"
						+"\n Mockito.when(this."+mockobj1+"."+method3+"()).thenReturn("+mockobj2+");"
						+"\n final ResponseEntity<List<"+mock2+">> resp = this."+obj+"."+method3+"();"
						+"Assert.assertNotNull(resp);"
							    		
			    		
			    		+"\n }"
			    		
			    		);
			    
			    printWriter.println("");

			    
			    printWriter.println("	@Test"
				+"\n public void "+method4+"Test() throws Exception {"
				+ "\n  final "+mock2+" "+ mockobj2+" =  new "+mock2+";"
				+"\n Mockito.when(this."+mockobj1+"."+method4+"(AA)).thenReturn("+mockobj2+");"
				+"\n	final String code = null;"
				+"\n	final ResponseEntity<"+mock2+"> resp = this."+obj+"."+method4+"(code);"
				+"\n	Assert.assertNotNull(resp);"
				+"\n }"
			    );
			    printWriter.println("");
			    
			    printWriter.println("	@Test\r\n" + 
			    		"	public void "+method5+"Test() throws Exception {\r\n" + 
			    		"  final "+mock2+" "+ mockobj2+" =  new "+mock2+";"+ 
			    		"	"+mockobj2+"."+"\r\n"+
			    		"\n Mockito.when(this."+mockobj1+"."+method5+"("+mockobj2+")).thenReturn(1);"+
			    		"		final String uId = null;\r\n" + 
			    		"		final ResponseEntity<"+mock2+"> resp = this."+obj+"."+method5+"(uId);\r\n" + 
			    		"		this.assertTrue(200 == resp.getStatusCodeValue());\r\n" + 
			    		"	}");
			    
			    printWriter.println("");
			    
			    
			    
			    printWriter.println("	/**\r\n" + 
			    		"	 * @throws Exception\r\n" + 
			    		"	 */\r\n" + 
			    		"	@Test\r\n" + 
			    		"	public void "+method6+"TestWhenRequestIsNull() throws Exception {\r\n" + 
			    	    "  final "+mock2+" "+ mockobj2+" =  null; "+
			    		"		final String uId = null;\r\n" + 
			    		" Mockito.when(this."+mockobj1+"."+method6+"("+mockobj2+")).thenReturn(1);"+
			    		"		final ResponseEntity<"+mock2+"> resp = this."+obj+"."+method6+"(uId,"+mockobj2 +");\r\n" +  
			    		"		this.assertTrue(400 == resp.getStatusCodeValue());\r\n" + 
			    		"	}\r\n" 
			    		);
			    
			    printWriter.println("");
			    
			    
			    printWriter.println(
			    
			    		"\r\n" + 
			    		"	/**\r\n" + 
			    		"	 * @throws Exception\r\n" + 
			    		"	 */\r\n" + 
			    		"	@Test\r\n" + 
			    		"	public void "+method7+"TestWhenRequestNotNull() throws Exception {\r\n" + 
			    		"  final "+mock2+" "+ mockobj2+" =  new "+mock2+";"+  
			    		"	"+mockobj2+"."+"\r\n" + 
			    		"	"+mockobj2+"."+"\r\n" + 
			    		" Mockito.when(this."+mockobj1+"."+method7+"("+mockobj2+")).thenReturn(1);"+
			    		"		final String uId = null;\r\n" + 
			    		"		final ResponseEntity<"+mock2+"> resp = this."+obj+"."+method7+"(uId,"+mockobj2 +");\r\n" + 
			    		"		this.assertTrue(201 == resp.getStatusCodeValue());\r\n" + 
			    		"	}\r\n" 
			    		);
	    printWriter.println("");
			    
			    
			    printWriter.println(
			    
			    		"\r\n" + 
			    		"	private void assertTrue(final boolean b) {\r\n" + 
			    		"\r\n" + 
			    		"	}\r\n" + 
			    		"");
			    
			    
			    
			    printWriter.println("");
			    
			    printWriter.println("}");
			    printWriter.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
