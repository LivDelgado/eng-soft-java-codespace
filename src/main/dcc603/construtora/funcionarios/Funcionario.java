package dcc603.construtora.funcionarios;

import java.time.LocalDate;


public class Funcionario {
  private String nome;
  private int anoNascimento;
  private int anoInicioCarreira;

  public Funcionario(String nome, int anoNascimento, int anoInicioCarreira)
  {
    this.nome = nome;
    this.anoNascimento = anoNascimento;
    this.anoInicioCarreira = anoInicioCarreira;
  }

  public String getNome() {
    return this.nome;
  }

  public int getIdade() {
    int anoAtual = LocalDate.now().getYear();
    return anoAtual - this.anoNascimento;
  }

  public int getAnosExperiencia() {
    int anoAtual = LocalDate.now().getYear();
    return anoAtual - this.anoInicioCarreira;
  }
}