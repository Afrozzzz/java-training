package Collections;

public class ComparingCategoryPrice2 {
	public int compare(Product p1,Product p2)
	{
		//compare by category
		int nameComparison=p1.prodName.compareTo(p2.prodName);
		if(nameComparison==0)
		{
			return Double.compare(p1.productPrice,p2.productPrice);
 
		}
		return nameComparison;
	}

 
 
}