class ListeningDevices{
	String soundQuality;
	int bass;
	float price;
}

class Earphones extends ListeningDevices{
	List<Wire> wire;
	String type;
	Boolean haveMicrophone;
}

class Headphones extends ListeningDevices{
	List<Wire> wire;
	String type;
	float size;
	float jacksize;
}

class Speakers extends ListeningDevices{
	List<Wire> wire;
	float speakerWatt;
	float size;
}