package com.example.demo;

import com.example.doreport.Minstrel;
import com.example.interfaces.Knight;
import com.example.interfaces.Quest;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Minimal;

public class BraveKnight2 implements Knight {
	private Quest quest;
	private Minstrel minstrel;
	public  BraveKnight2(Quest quest,Minstrel minstrel) {
		this.quest=quest;
		this.minstrel=minstrel;
	}
	@Override
	public void doQuest() {
		minstrel.singBeforeQuest();
		quest.Questtobedone();
		minstrel.singAfterQuest();
	}

}
