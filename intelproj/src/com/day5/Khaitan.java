package com.day5;

public class Khaitan {
	State state=new SwitchOffState();
	void pull() {
		state.pull(this);
	}
}

abstract class State {
	public abstract void pull(Khaitan fan);
}
class SwitchOffState extends State{
	@Override
	public void pull(Khaitan fan) {
		System.out.println("switch on state....");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	@Override
	public void pull(Khaitan fan) {
		System.out.println("Medium speed state....");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(Khaitan fan) {
		System.out.println("High speed state....");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(Khaitan fan) {
		System.out.println("switch off state....");
		fan.state=new SwitchOffState();
	}
}
