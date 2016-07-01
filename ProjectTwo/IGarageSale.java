package projectTwo;

import java.io.IOException;

public interface IGarageSale {

	public String searchItem(String itemSer) throws Exception;
	public String displayAllItems() throws Exception;
	public String addItemAndLocation(GarageSale a) throws Exception;
	public String deleteItem(String itemDel) throws Exception;
	
}
