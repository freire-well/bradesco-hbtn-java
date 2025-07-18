import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        if(postagens.contains(postagem)){
            throw new IllegalArgumentException("Postagem jah existe");
        }else{
            postagens.add(postagem);
        }
    }

    public Set<Post>obterPostsPorAutor(Autor autor){
        Set<Post> temp = new LinkedHashSet<>();

        for(Post post : postagens){
            if(post.getAutor().compareTo(autor) != 0){
                temp.add(post);
            }
        }


        return temp.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Set<Post>obterPostsPorCategoria(Categorias categorias){
        Set<Post> temp = new LinkedHashSet<>();

        for(Post post : postagens){
            if(post.getCategoria().compareTo(categorias) != 0){
                temp.add(post);
            }
        }


        return temp.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public Map<Categorias, Set<Post>>obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> temp = new LinkedHashMap<>();

        for(Post post : postagens){
            temp.put(post.getCategoria(), obterPostsPorCategoria(post.getCategoria()));
        }


        return temp;
    }

    public Map<Autor, Set<Post>>obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> temp = new LinkedHashMap<>();

        for(Post post : postagens){
            temp.put(post.getAutor(), obterPostsPorCategoria(post.getCategoria()));
        }
        return temp;
    }


    public Set<Autor> obterTodosAutores(){
        Set<Autor> temp = new LinkedHashSet<>();
        for (Post postagen : postagens) {
            temp.add(postagen.getAutor());
        }
        return temp.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }



    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> map = new HashMap<>();
        for (Post postagem : postagens) {
            map.merge(postagem.getCategoria(), 1, Integer::sum);
        }
        return map;
    }
}