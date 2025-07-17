import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        postagens.add(postagem);
    }

    public Set<String> obterTodosAutores(){
        ArrayList<String> temp = new ArrayList();
        for (int i = 0; i < postagens.size(); i++) {
            temp.add(postagens.get(i).getAutor());
        }
        Collections.sort(temp);
        return new HashSet<>(temp);
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < postagens.size(); i++) {
            String categoriaLista = postagens.get(i).getCategoria();
            map.merge(categoriaLista, 1, Integer::sum);
        }

        return map;
    }
}