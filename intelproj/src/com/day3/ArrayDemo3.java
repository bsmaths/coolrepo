package com.day3;

public class ArrayDemo3 {
	public static void main(String[] args) {
		Remote samsungRemote=new Remote();
		samsungRemote.command[1].execute();
		samsungRemote.setCommand(new HDM1Command(), 1);
		samsungRemote.command[1].execute();
	}
}
class Command{
	public void execute() {
		
	}
}
class HDM1Command extends Command{//kind of command
	public void execute() {System.out.println("HDM1 device activated..........");}
}
class DummyCommand extends Command{
	public void execute() {System.out.println("I am dummy yet to be operational....");}
}

class Remote {
	Command command[]=new Command[5];
	public Remote() {
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}
	}
	public void setCommand(Command command,int slot) {
		this.command[slot]=command;
	}
}