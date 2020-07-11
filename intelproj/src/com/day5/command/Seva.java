package com.day5.command;

public class Seva {
	Command counters[]=new Command[5];
	public Seva() {
		for(int i=0;i<counters.length;i++) {
			counters[i]=new DummyCommand();
		}
	}
	public void useCounter(int slot) {
		counters[slot].action();
	}
	public void setCommand(Command command,int slot) {
		counters[slot]=command;
	}
}

abstract class Command{
	public abstract void action();
}

class DummyCommand extends Command{
	@Override
	public void action() {
		System.out.println("dummy counter.....No yet operational...");
	}
}

class DeathCommand extends Command{
	@Override
	public void action() {
		System.out.println("The process to get DC is starting....");		
		new PoliceStation().doEnquiry();
		new Hospital().doPostMortem();
		new Corporation().giveDeathCertificate();
		System.out.println("Process is complete, take the death certicate....");
	}
}