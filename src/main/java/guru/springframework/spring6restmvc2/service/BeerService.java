package guru.springframework.spring6restmvc2.service;

import guru.springframework.spring6restmvc2.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    List<Beer> listBeers();

    Beer getBeerById(UUID id);
}
