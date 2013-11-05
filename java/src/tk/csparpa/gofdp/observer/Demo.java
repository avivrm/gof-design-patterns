package tk.csparpa.gofdp.observer;

public class Demo {

	public static void main(String[] args) {
		System.out.println("***Demo: Observer pattern");
		System.out.println("Creating: new Subject with job=unemployed, salary=0.0");
		Subject subject = new ConcreteSubject("unemployed", 0.0);
		System.out.println("Creating: new Observer");
		ConcreteObserver observer1 = new ConcreteObserver();
		System.out.println("Creating: new Observer");
		ConcreteObserver observer2 = new ConcreteObserver();
		System.out.println("Asking: gossip to observers about Subject");
		observer1.gossipAboutSubject();
		observer2.gossipAboutSubject();
		System.out.println("Registering: observers to the Subject");
		subject.attach(observer1);
		subject.attach(observer2);
		System.out.println("Changing: Subject state with job=clerk");
		subject.setJob("clerk");
		System.out.println("Asking: gossip to observers about Subject");
		observer1.gossipAboutSubject();
		observer2.gossipAboutSubject();
		System.out.println("Changing: Subject state with salary=1500.0");		
		subject.setSalary(1500.0);
		System.out.println("Asking: gossip to observers about Subject");
		observer1.gossipAboutSubject();
		observer2.gossipAboutSubject();
	}
}
