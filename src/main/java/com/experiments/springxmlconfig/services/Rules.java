package com.experiments.springxmlconfig.services;

public class Rules implements IRules {
	
	private String rule;

	@Override
	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}
	
}
