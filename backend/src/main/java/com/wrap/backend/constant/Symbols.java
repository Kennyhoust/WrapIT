package com.wrap.backend.constant;

public final class Symbols {
	public final static int ROCK = 0;
	public final static int PAPER = 1;
	public final static int SCISSORS = 2;
	public final static int SPOCK = 3;
	public final static int LIZARD = 4;
	
	

	public final static int crushes = 1;
	public final static int covers = 2;
	public final static int disaproves = 3;
	public final static int cuts = 4;
	public final static int decapitates = 5;
	public final static int vaporizes = 6;
	public final static int smashes = 7;
	public final static int eats = 8;	
	public final static int poisons = 9;	
	private static int DETERMINER[][] = new int[5][5];
	static {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				DETERMINER[i][j] = 0;
			}
			DETERMINER[ROCK][SCISSORS] = crushes;
			DETERMINER[ROCK][LIZARD] = crushes;
			DETERMINER[PAPER][ROCK] = covers;
			DETERMINER[PAPER][SPOCK] = disaproves;
			DETERMINER[SCISSORS][PAPER] = cuts;
			DETERMINER[SCISSORS][LIZARD] = decapitates;
			DETERMINER[SPOCK][ROCK] = vaporizes;
			DETERMINER[SPOCK][SCISSORS] = smashes;
			DETERMINER[LIZARD][PAPER] = eats;
			DETERMINER[LIZARD][SPOCK] = poisons;
		}
	}
	
}