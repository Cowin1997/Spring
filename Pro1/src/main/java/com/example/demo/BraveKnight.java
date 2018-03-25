package com.example.demo;

import com.example.interfaces.Knight;
import com.example.interfaces.Quest;
import com.example.quest.RescueDameslQuest;

public class BraveKnight implements Knight{
	private Quest quest;
	public  BraveKnight(Quest quest) {
		this.quest=quest;
	}
	@Override
	public void doQuest() {
		quest.Questtobedone();
	}

}
