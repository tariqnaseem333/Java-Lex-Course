package Interface;

public class SmartPhone extends Mobile implements Testable {
	
//	Instance Variables
	private String networkGeneration;

//	Constructor
	public SmartPhone( String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration ) {
		super( name, brand, operatingSystemName, operatingSystemVersion );
		this.networkGeneration = networkGeneration;
	}
	
//	Method
	@Override
	public boolean testCompatibility() {
		boolean isCompatible = false;
		if( this.getOperatingSystemName().equals("Saturn") ) {
			if( this.networkGeneration.equals("3G") ) {
				if( this.getOperatingSystemVersion().equals("1.1") || this.getOperatingSystemVersion().equals("1.2") || this.getOperatingSystemVersion().equals("1.3") ) {
					isCompatible = true;
				}
			} else if( this.networkGeneration.equals("4G") ) {
				if( this.getOperatingSystemVersion().equals("1.2") || this.getOperatingSystemVersion().equals("1.3") ) {
					isCompatible = true;
				}
			} else if( this.networkGeneration.equals("5G") ) {
				if( this.getOperatingSystemVersion().equals("1.3") ) {
					isCompatible = true;
				}
			}
		} else if( this.getOperatingSystemName().equals("Gara") ) {
			if( this.networkGeneration.equals("3G") ) {
				if( this.getOperatingSystemVersion().equals("EXRT.1") || this.getOperatingSystemVersion().equals("EXRT.2") || this.getOperatingSystemVersion().equals("EXRU.1") ) {
					isCompatible = true;
				}
			} else if( this.networkGeneration.equals("4G") ) {
				if( this.getOperatingSystemVersion().equals("EXRT.2") || this.getOperatingSystemVersion().equals("EXRU.1") ) {
					isCompatible = true;
				}
			} else if( this.networkGeneration.equals("5G") ) {
				if( this.getOperatingSystemVersion().equals("EXRU.1") ) {
					isCompatible = true;
				}
			}
		}
		return isCompatible;
	}
	
//	Getters and Setters
	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}	

}
