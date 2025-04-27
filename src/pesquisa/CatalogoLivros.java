package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listLivro;

    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor,  int anoPublicacao){
        listLivro.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarLivro(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
              if(l.getAutor().equalsIgnoreCase(autor)){
                  livrosPorAutor.add(l);
              }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarLivrosPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!listLivro.isEmpty()){
           for (Livro l: listLivro) {
               if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                   livrosPorIntervaloAnos.add(l);
               }
           }
           return livrosPorIntervaloAnos;
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTItulo (String titulo) {
        if (!listLivro.isEmpty()) {
            for (Livro l : listLivro) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    return l;
                }
                break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "autor 1", 1995);
        catalogoLivros.adicionarLivro("Livro 1", "autor 2", 1996);
        catalogoLivros.adicionarLivro("Livro 3", "autor 3", 1997);
        catalogoLivros.adicionarLivro("Livro 4", "autor 4", 1998);

        System.out.println(catalogoLivros.pesquisarLivrosPorIntervaloAnos(1996, 1998));
        System.out.println(catalogoLivros.pesquisarLivro("autor 3"));
        System.out.println(catalogoLivros.pesquisarPorTItulo("livro 1"));

    }
}


