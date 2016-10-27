class NewTV extends TV {
	
	protected int channels;
	protected int volume;
	protected boolean movie;

	public NewTV(String display, int size, int channels, int volume, boolean movie) {
		super(display, size);
		this.channels = channels;
		this.volume = volume;
		this.movie = movie;
	}

	public int numberOfChannels() {
		return channels;
	}

	public int volumeLevel() {
		return volume;
	}

	public boolean watchMovie() {
		System.out.println("There is an interesting film on this channel.");
		return movie;
	}

	public void channelSurfing() {
		System.out.println("There are no interesting films or shows on Tv.");
	}

	public boolean equals(NewTV newTV) {
		if ((newTV.display == this.display) && (newTV.size == this.size) && (newTV.channels == this.channels) && (newTV.volume == this .volume) && (newTV.movie == this.movie)) {
			return true;
		} 
		else {
			return false;
		}
	}	

	public String toString() {
		return display + " display TV." + " Size: " + size + ". Number of channels: " + channels;
	}	
}