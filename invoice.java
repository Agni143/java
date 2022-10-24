//invoice 
package invooice;
import java.io.*;

public class invoice {
	String partnumber;
	String partdescription;
	int numofitems;
	double priceofitems;
	double amount;
	invoice()
	{
		partnumber="321";
		partdescription="case";
		numofitems=1;
		priceofitems=1000;
	}
	public String getpartnumber()
	{
		return partnumber;
		
	}
	public String getpartdescription()
	{
		return partdescription;
	}
	public int getnumofitems()
	{
		return numofitems;
	}
	public double getpriceofitems()
	{
		return priceofitems;
	}
	public void setpartnumber(String num)
	{
		partnumber=num;
	}
	public void setpartdescription(String des)
	{
		partdescription=des;
	}
	public void setnumofitems(int numitem)
	{
		numofitems=numitem;
	}
	public void setpriceofitems(double price)
	{
		priceofitems=price;
	}
	public double invoiceamount()
	{
		amount=priceofitems*numofitems;
		amount=(amount>0)?amount:0;
		return amount;
	}
	public void displayinfo()
	{
		System.out.println("part numbeer:"+partnumber);
		System.out.println("part description:"+partdescription);
		System.out.println("number of items:"+numofitems);
		System.out.println("price of items:"+priceofitems);
		System.out.println("invoice amount:"+amount);
		System.out.println("----------------------------------------------");
	}

}
