package com.berrada.persistence.learning;

import org.junit.jupiter.api.Test;

public class OthmaneTest {

  @Test
  void should_sum_array() {
    int[] tableau = {3, -5, 6};
    int somme = 0;
    for (int i = 0; i < 3; i++) {
      somme = tableau[i] + somme;
    }
    System.out.println(somme);
  }

  @Test
  void should_permute_variables() {
    int a = 6;
    int b = 9;
    int c ;
    c = a; // c = 6
    a = b; // a = 9
    b = c;
    System.out.println(a);
    System.out.println(b);
  }

  @Test
  void should_compute_power() {

  }
}
