package org.softuni.cardealer.services;

import org.softuni.cardealer.domain.models.view.CustomerViewModel;

import java.util.List;

public interface CustomerService {

    List<CustomerViewModel> getByBirthDate(boolean isOrderDescending);
}
