package cz.ivosahlik.commands;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Intellij Idea
 * Created by ivosahlik on 04/04/2018
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductForm {

    private String id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
