package invooice;

import java.io.*;

public class invoicetest {
	
	public static void main(String args[]) throws IOException
	{
		invoice inv1=new invoice();
		invoice inv2=new invoice();
		inv1.getpartnumber();
		inv1.getnumofitems();
		inv1.getpriceofitems();
		inv1.invoiceamount();
		inv1.displayinfo();
		
		inv2.setpartnumber("1");
		inv2.setpartdescription("chip");
		inv2.setnumofitems(12);
		inv2.setpriceofitems(12);
		inv2.invoiceamount();
		inv2.displayinfo();
	}

}
