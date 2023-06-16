class Movies{
	int budget;
	List<Actors> actors;
	List<Crew> crew;
	String story;
}

class Documentary extends Movies{
	String subject;
	List<DocumentedPeople> people;
	String purpose;
}

class Animated extends Movies{
	List<VoiceArtists> voiceArtists;
	List<Animators> animators;
	String animationStyle;
}

class Action extends Movies{
	List<StuntCrew> stuntCrew;
	int productionCost;
	boolean injuriesOnset;
}
	
	