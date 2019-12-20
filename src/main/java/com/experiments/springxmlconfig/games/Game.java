package com.experiments.springxmlconfig.games;

import com.experiments.springxmlconfig.services.IRules;

public interface Game {

	public String getName();
	public IRules getRule();

	public void setName(String name);
	public void setRule(IRules rule);
	
}
