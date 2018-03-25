package com.example.demo;


import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import java.io.PrintStream;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.doreport.Minstrel;
import com.example.interfaces.Quest;
import com.example.quest.RescueDameslQuest;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Minimal;
import net.bytebuddy.asm.Advice.This;

@SpringBootApplication
public class Pro1Application {
	public static void main(String[] args) {
		Quest quest=new RescueDameslQuest(new PrintStream(System.out));
		PrintStream p=new PrintStream(System.out);
		Minstrel minstrel=new Minstrel(p);
		BraveKnight2 braveKnigh=new BraveKnight2(quest,minstrel);
		braveKnigh.doQuest();
		
	
	}
}
