package herdeiros;


/**
 * @author Gustavo
 * @version 1.0
 */

public class Pessoa {

	private double height;
	private String name;
	private int age;
	
	/**
	 * 
	 * @param height
	 * @param name
	 * @param age
	 */
	
	public Pessoa(double height, String name, int age) {
		this.height = height;
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Método para mátricular o Aluno 
	 * @param Pessoa
	 * 
	 **/
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	/**
	 * Método para incrementar idade
	 * @param p
	 * @param envelhecer
	 */
	public void envelhecer(Pessoa p, int envelhecer) {
		if(envelhecer > 1) {
			System.out.println(p.getName() + " envelheceu " + envelhecer + " Anos");
		}else if(envelhecer > 0){
			System.out.println(p.getName() + " envelheceu " + envelhecer + " Ano");
		}else {
			System.out.println("Valor inválido");
		}
		p.setAge(p.getAge() + envelhecer) ;
		
	}
	
}
