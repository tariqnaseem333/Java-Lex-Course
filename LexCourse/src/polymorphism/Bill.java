package polymorphism;

public class Bill {
	
	public double findPrice( int itemId ) {
		int price;
		if( itemId == 1001 ) {
			price = 25;
		} else if( itemId == 1002 ) {
			price = 20;
		} else if( itemId == 1003 ) {
			price = 23;
		} else if( itemId == 1004 ) {
			price = 18;
		} else {
			price = 0;
		}
		return price;
	}
	
	public double findPrice( String brandName, String itemType, int size ) {
		int price;
		if( brandName.equals("Puma") ) {
			if( itemType.equals("T-shirt") ) {
				if( size == 34 || size == 36 ) {
					price = 25;
				} else {
					price = 0;
				}
			} else if( itemType.equals("Skirt") ) {
				if( size == 38 || size == 40 ) {
					price = 20;
				} else {
					price = 0;
				}
			} else {
				price = 0;
			}
		} else if( brandName.equals("Reebok")) {
			if( itemType.equals("T-shirt") ) {
				if( size == 34 || size == 36 ) {
					price = 23;
				} else {
					price = 0;
				}
			} else if( itemType.equals("Skirt") ) {
				if( size == 38 || size == 40 ) {
					price = 18;
				} else {
					price = 0;
				}
			} else {
				price = 0;
			}
		} else {
			price = 0;
		}
		return price;
	}
}
