package com.example.model;
import java.util.*;

public class BeerExpert {
  public List getBrands(String color) {
    List brands = new ArrayList();
    if(color.equals("amber")) {
      brands.add("Jack Amber");
      brands.add("Red Moose");
    }
    else {
      brands.add("Jail Pale ale");
      brands.add("Gout Stout");
    }
    return brands;
  }
}
