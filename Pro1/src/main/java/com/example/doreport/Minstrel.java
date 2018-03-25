package com.example.doreport;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream printStream;
	public Minstrel(PrintStream p) {
		printStream=p;
	}
	public void singBeforeQuest() {
		printStream.println("sing before quest");
	}
	public void singAfterQuest() {
		printStream.println("sing after quest");
	}
	

}
