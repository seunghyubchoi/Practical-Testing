package sample.cafekiosk.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    /**
     * select *
     *   from product
     *  where selling_Type in ('SELLING', 'HOLD')
     * @param sellingTypes
     * @return
     */
    List<Product> findAllBySellingTypeIn(List<ProductSellingType> sellingTypes);
}
