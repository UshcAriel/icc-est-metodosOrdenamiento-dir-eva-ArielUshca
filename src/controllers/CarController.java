package controllers;

import models.Car;

public class CarController {

  // burbuja avanzado
  public void sortbyName(Car[] cars) {
    for (int i = 0; i < cars.length - 1; i++) {
      boolean swap = false;
      for (int j = 0; j < cars.length - 1; j++) {
        if (cars[j].getName().compareTo(cars[j + 1].getName()) > 0)
          ;
        Car aux = cars[j];
        cars[j] = cars[j + 1];
        cars[j + 1] = aux;
        swap = true;
      }
    }

  }
}
