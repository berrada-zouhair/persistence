package com.berrada.persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersistenceApplication {

  public static void main(String[] args) {
    SpringApplication.run(PersistenceApplication.class, args);
  }

//  @Component
//  class Runner implements CommandLineRunner {
//
//    private ProductRepository repository;
//
//    public Runner(ProductRepository repository) {
//      this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//      Flux<Product> all = repository.findAll();
//      all.subscribe(System.out::println);
//    }
//  }

}
