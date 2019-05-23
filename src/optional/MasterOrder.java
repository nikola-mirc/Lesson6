package optional;

import java.util.ArrayList;

public class MasterOrder {

	ArrayList<CookieOrder> listOfOrders = new ArrayList<CookieOrder>();

	public ArrayList<CookieOrder> getOrders() {

		listOfOrders.add(0, null);
		return listOfOrders;
	}

	public void setOrders(ArrayList<CookieOrder> listOfOrders) {
		this.listOfOrders = listOfOrders;
	}

	public void addOrder(CookieOrder cookieOrder) {

	}

	public Object getTotalBoxes() {

		return null;

	}

}
