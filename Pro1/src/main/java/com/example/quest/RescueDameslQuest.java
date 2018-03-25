package com.example.quest;

import java.io.PrintStream;

import com.example.interfaces.Quest;

public class RescueDameslQuest implements Quest{
	private PrintStream printstream;
	 public RescueDameslQuest(PrintStream p) {
		 this.printstream=p;
	}
	@Override
	public void Questtobedone() {
		printstream.println(this.getClass()+",解救少女的任务");	
	}
}
