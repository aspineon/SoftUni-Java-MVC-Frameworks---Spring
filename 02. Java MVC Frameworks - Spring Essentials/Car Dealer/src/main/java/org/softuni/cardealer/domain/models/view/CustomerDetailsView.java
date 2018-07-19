package org.softuni.cardealer.domain.models.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetailsView {

    private String name;

    private Integer carsBought;

    private Double moneySpent;
}
