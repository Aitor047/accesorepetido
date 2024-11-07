package org.iesch.org.rest1.services;

import org.iesch.org.rest1.excepciones.ProductNotFoundException;
import org.iesch.org.rest1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    List<Product> productsList;

    public List<Product> obtenerProductos(){
        return productsList;
    }

    public Optional<Product> obtenerOne(Long id) {
        return productsList.stream().filter(product -> product.getId() == id).findFirst();
    }

    public void borrarUno(Long id) {

        productsList.removeIf(product -> product.getId() == id);

    }

    public Product addProduct(Product product) {

        if (product.getStock() > 0 && ! productsList.contains(product)) {
            productsList.add(product);
        } else throw new ProductNotFoundException("Producvto no encontrado");

        return product;
    }

    public Product actualizarProduct(Product product) {

        Optional<Product> product1 = obtenerOne((long) product.getId());
        if (product1.isPresent() && product.getStock()>0) {
            product1.get().setName(product.getName());
            product1.get().setPrice(product.getPrice());
            product1.get().setDescription(product.getDescription());
            product1.get().setCategoria(product.getCategoria());
            product1.get().setStock(product.getStock());

            return product1.get();

        } else if (product1.isPresent() && product.getStock()<0) {
            throw new ProductNotFoundException("Producto con stock negativo");
        } else throw new ProductNotFoundException("Producto no encontrado");

    }
}
