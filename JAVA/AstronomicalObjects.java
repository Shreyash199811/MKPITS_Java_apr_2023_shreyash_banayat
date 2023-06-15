class AstronomicalObjects{
	long size;
	String color;
	Boolean shine;
	long coreSize;
}

class Star extends  AstronomicalObjects{
	Double TempDegree;
	List<StarType> starType;
	List<RadiatioType> radiationType;
}

class Planets extends AstronomicalObjects{
	List<PlanetType> planetType;			//rocky, gas planet, in kepler belt
	Boolean haveLife;
	Boolean rings;
}

class Comet extends AstronomicalObjects{
	String cometName;
	List<Metals> metals;
	float tailSize;
}
