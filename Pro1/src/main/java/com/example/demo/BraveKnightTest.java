package com.example.demo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.example.interfaces.Quest;
import com.example.quest.RescueDameslQuest;

public class BraveKnightTest {
	@Test
	public  void tt() {
		Quest mockquest=mock (RescueDameslQuest.class);
		BraveKnight braveKnight=new BraveKnight(mockquest);
		braveKnight.doQuest();
		braveKnight.doQuest();
		verify(mockquest, times(2)).Questtobedone();;
	}

}
