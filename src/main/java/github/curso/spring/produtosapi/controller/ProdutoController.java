package github.curso.spring.produtosapi.controller;

import github.curso.spring.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto) {
        System.out.println("Produto recebido " + produto);
        return produto;
    }
}
