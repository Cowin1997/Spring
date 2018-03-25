package com.example.quest;

import java.io.PrintStream;

import com.example.interfaces.Quest;

public class FlyQuest implements Quest{

	private PrintStream printstream;
	public FlyQuest(PrintStream p) {
		 this.printstream=p;
	}
	@Override
	public void Questtobedone() {
		printstream.println(this.getClass()+",飞行的任务");	
	}

}
