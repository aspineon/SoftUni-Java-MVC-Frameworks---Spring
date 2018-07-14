package com.softuni.residentevil.services;

import com.softuni.residentevil.etities.Capital;
import com.softuni.residentevil.models.view.CapitalNameAndIdViewModel;

import java.util.List;

public interface CapitalService extends Creatable {

    List<CapitalNameAndIdViewModel> getSimpleView();

    Capital getByName(final String name);

    Capital getById(final Long id);
}
