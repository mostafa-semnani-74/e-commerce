package ir.mostafa.semnani.e_commerce.product.controller;

import ir.mostafa.semnani.e_commerce.product.dto.response.ProductFindAllResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<ProductFindAllResponseDTO>> findAll() {
        return ResponseEntity.ok(
                List.of(
                        new ProductFindAllResponseDTO("hello product")
                )
        );
    }

}
