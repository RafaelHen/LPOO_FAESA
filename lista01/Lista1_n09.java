package lista01;

public class Lista1_n09 {

	public static void main(String[] args) {
		String [] vet = {"mario", "paulo", "luiz", "ana", "carla", "beatriz"};
	    int menor;
	    String x;
	    for(int i = 0; i < vet.length - 1; i++){
	      menor = i;
	      x = vet[i];
	      for(int j = i + 1; j < vet.length; j++){
	        if(vet[j].compareTo(x) < 0){
	          menor = j;
	          x = vet[j];
	        }
	      }
	      vet[menor] = vet[i];
	      vet[i] = x;
	    }
	    for(int i = 0; i < vet.length; i++){
	      System.out.println(vet[i]);
	    }

	}

}
