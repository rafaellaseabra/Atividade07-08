package Classes0708;

public class ObjetoCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setMarca("chevrolet");
		carro1.setAno(2011);
		carro1.setModelo("camaro ");
		carro1.setcor("amarelo");
		
		
		System.out.println("-----OBJETO1-----");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getcor());
		 
		
		

	}

}
