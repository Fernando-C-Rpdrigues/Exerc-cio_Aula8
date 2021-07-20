package rodrigues.fernando.aula8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rodrigues.fernando.aula8.model.Product;

@RestController
public class ProductController {

    @GetMapping("/produtc")
    public String product(){
        Product product = new Product();
        product.setName("laptop");
        product.setPrice(6500.00);
        return product.toString();

    }
}
