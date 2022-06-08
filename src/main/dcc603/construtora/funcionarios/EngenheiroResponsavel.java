package dcc603.construtora.funcionarios;

public class EngenheiroResponsavel extends Funcionario {
  private int numeroProjetosLiderados;

  public EngenheiroResponsavel(
    String nome,
    int anoNascimento,
    int anoInicioCarreira,
    int numeroProjetosLiderados
  ) {
    super(nome, anoNascimento, anoInicioCarreira);
    this.numeroProjetosLiderados = numeroProjetosLiderados;
  }

  public void adicionarProjeto() {
    this.numeroProjetosLiderados++;
  }

  public int getNumeroProjetosLiderados() {
    return this.numeroProjetosLiderados;
  }
}