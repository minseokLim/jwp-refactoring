package kitchenpos.product.dto;

import java.math.BigDecimal;

import kitchenpos.product.domain.Product;

public class ProductResponse {
    private final Long id;
    private final String name;
    private final BigDecimal price;

    public ProductResponse(final Long id, final String name, final BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static ProductResponse of(final Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getPrice());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
