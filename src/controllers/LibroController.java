package controllers;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.Book;
public class LibroController{  

    public Map<Book,  Book> procesarLibros( List<Book> libros){
        Set<Book> conjuntoOrdenado = new TreeSet<>(
            Comparator.comparing(Book :: getTitulo).reversed().thenComparing(Book :: getAnio)
        );
        conjuntoOrdenado.addAll(libros);
        Map<Book, Book> resultado = new LinkedHashMap<>();
        for (Book libro : conjuntoOrdenado) {
             resultado.put(libro, libro);
        }
        
        return resultado;

    }
}