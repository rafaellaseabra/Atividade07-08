package Classes0708;

public class ObjetosPessoa {

	public static void main(String[] args) {
		
	    // criando objetos da classe pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2= new Pessoa();
		
		//obj1
		
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California, USA" );
		pessoa1.setProfissao("Ator");
		pessoa1.setRG ("xxxxxxxx");
		pessoa1.setcpf ("yyyyyyy"); 
		
		//obj2
		
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setRG ("**********");
		pessoa2.setcpf("yyyyyy");
		
		
		
		System.out.println("-----OBJETO1-----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getprofissao());
		System.out.println(pessoa1.getRg());
		System.out.println(pessoa1.getcpf());
		
		System.out.println("-----OBJETO2-----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getprofissao());
		System.out.println(pessoa2.getRg());
		System.out.println(pessoa2.getcpf());
				
	}
	

}
