package Collections;

import java.util.Comparator;

public class ComparingCategoryPrice implements Comparator<Product> {
	@Override
	public int compare(Product p1,Product p2)
	{
		//compare by category
		int categoryComparison=p1.category.compareTo(p2.category);
		if(categoryComparison==0)
		{
			return Double.compare(p1.productPrice, p2.productPrice);
		}
		return categoryComparison;
	}
}