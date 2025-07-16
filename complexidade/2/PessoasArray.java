public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        boolean encontrado = false;
        int left = 0;
        int right = nomes.length -1 ;
        System.out.printf("Procurando o nome: \"%s\"\n",nome);
        while (left <= right){
            int mid = (left + right) / 2;
            System.out.println("passando pelo indice: " + mid);
            if(nomes[mid].charAt(0) < nome.charAt(0)){
                left = mid + 1;
            } else if (nomes[mid].charAt(0) > nome.charAt(0)) {
                right = mid - 1;
            }else{
                System.out.printf("nome %s encontrado na posicao: %d\n",nome, mid);
                encontrado = true;

                break;
            }

        }



    }
}