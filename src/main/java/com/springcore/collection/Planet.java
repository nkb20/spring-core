package com.springcore.collection;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Planet {

	private String Name;
	private List<String> Weather;
	private Set<String> Continent;
	private Map<String,Integer> Population;
	private Properties props;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getWeather() {
		return Weather;
	}
	public void setWeather(List<String> weather) {
		Weather = weather;
	}
	public Set<String> getContinent() {
		return Continent;
	}
	public void setContinent(Set<String> continent) {
		Continent = continent;
	}
	public Map<String, Integer> getPopulation() {
		return Population;
	}
	public void setPopulation(Map<String, Integer> population) {
		Population = population;
	}
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "earth [Name=" + Name + ", Weather=" + Weather + ", Continent=" + Continent + ", Population="
				+ Population + "]";
	}
	
	
}
