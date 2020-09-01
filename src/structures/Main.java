package structures;

public class Main {
	public static void main(String[] args) {
		ComparatorPrueba comparatorPrueba =new ComparatorPrueba();
		BinaryTree<Student> stack =new BinaryTree<Student>(comparatorPrueba);
		stack.insert(new Student(1,"luis"));
		stack.insert(new Student(2,"tomas"));
		stack.insert(new Student(3,"jaime"));
		stack.insert(new Student(4,"andrea"));
		stack.insert(new Student(2,"tomas"));
		stack.insert(new Student(3,"jai"));
		stack.insert(new Student(4,"area"));
		stack.insert(new Student(2,"omas"));
		stack.insert(new Student(3,"jme"));
		stack.insert(new Student(4,"ndrea"));
//		System.out.println(stack.showleft());
//		System.out.println(stack.showRight());
		Student s =stack.search(new Student(3,"ndrea"));
		System.out.println(s.getName());
		System.out.println(stack.exist(new Student(3,"ndqrea")));
//		System.out.println(stack.poll());
//		System.out.println(stack.show());
//		System.out.println(stack.poll());
//		System.out.println(stack.poll());
//		System.out.println(stack.poll());
//		if(stack.peek()!=null) {
//		System.out.println(stack.show());
//		}
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.show());
//		stack.remove(new Student(4,"andrea"));
//		System.out.println(stack.show());
	}
	
}
