package SistemaLivraria;

import javax.print.attribute.HashAttributeSet;

public class App {
    public static void main(String[] args) {
        Livro HarryPotter = new Livro(
                "HarryPotter3",
                +317,
                "",
                "Fantasia",
                " J. K. Rowling",
                " Bloomsbury Publishing",
                100,
                "1999");

        Autor autor = new Autor(
                "J. K.",
                "Rowling",
                "Fantasia, drama, tragicomédia, romance policial",
                "Feminino",
                "Inglaterra",
                "Yate",
                31);

    Editora editora = new Editora("Bloomsbury Publishing",
            "1986",
            "062663720001-40",
            " 50 Bedford Square",
            "Inglaterra",
            "Londres");

        System.out.println(HarryPotter.listarDados());
        System.out.println(autor.listarAutor());
        System.out.println(editora.ListarEditora());





    }




}
