package com.example.demo;

import com.example.interfaces.Knight;
import com.example.interfaces.Quest;

public class FlyKnight implements Knight{
	private Quest quest;
	 public FlyKnight(Quest quest) {
		 this.quest=quest;
	}

	@Override
	public void doQuest() {
	 quest.Questtobedone();
		
	}

}
