package com.empresa.teste;

import javax.persistence.*;

@Entity
@Table(name = "tbcw3_5001_lotacao")
public class Loci {

  @Id
  @Column(name = "Codigo")
  private String codigo;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
}