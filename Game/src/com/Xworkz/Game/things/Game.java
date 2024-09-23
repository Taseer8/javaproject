package com.Xworkz.Game.things;

public class Game {
	private String gameName;
	private int noOfplayers;
	private long duration;
	private double salaryOfPlayer;
	private String teamName;
	
	public Game() {
		// TODO Auto-generated constructor stub
	}
	
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameName() {
		return this.gameName;
	}
	public void settNoOfPlayers(int noOfPlayers) {
		this.noOfplayers = noOfPlayers;
	}
	public int getNoOfPlayers() {
		return this.noOfplayers;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public long getDuration() {
		return this.duration;
	}
	public void setSalary(double salaryOfPlayer) {
		this.salaryOfPlayer = salaryOfPlayer;
	}
	public double getSalary() {
		return this.salaryOfPlayer;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamName() {
		return this.teamName;
	}
	

}
