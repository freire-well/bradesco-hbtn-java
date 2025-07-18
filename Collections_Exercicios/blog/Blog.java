import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        postagens.add(postagem);
    }

    public Set<String> obterTodosAutores(){
        Set<String> temp = new LinkedHashSet<>();
        for (int i = 0; i < postagens.size(); i++) {
            temp.add(postagens.get(i).getAutor());
        }


        return temp.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < postagens.size(); i++) {
            String categoriaLista = postagens.get(i).getCategoria();
            map.merge(categoriaLista, 1, Integer::sum);
        }

        return map;
    }
}