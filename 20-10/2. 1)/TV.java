class TV {
	
	protected String display;
	protected int size;

	public TV(String display, int size) {
		this.display = display;
		this.size = size;
	}

	public void show() {
	}

	public String getDisplay() {
		return display;
	}

	public int getSize() {
		return size;
	}

	public boolean equals(TV tv) {
		if ((tv.display == this.display) && (tv.size == this.size)) {
			return true;
		} 
		else {
			return false;
		}
	}

	public String toString() {
		return display + " display TV." + " Size: " + size;
	}	

}