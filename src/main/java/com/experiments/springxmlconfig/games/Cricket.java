package com.experiments.springxmlconfig.games;

import com.experiments.springxmlconfig.services.IRules;

public class Cricket implements Game{
	
	private String name;
	private IRules rule;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public IRules getRule() {
		// TODO Auto-generated method stub
		return rule;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setRule(IRules rule) {
		this.rule = rule;
	}
	
}
