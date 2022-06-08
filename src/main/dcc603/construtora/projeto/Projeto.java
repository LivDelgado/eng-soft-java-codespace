package dcc603.construtora.projeto;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import dcc603.construtora.funcionarios.*;


public class Projeto {
	
	public static final int ABERTO = 1;
	public static final int FECHADO = 2;
	
	protected int status = ABERTO;
  private String nome;
  private TipoProjeto tipoProjeto;
  private LocalDate dataInicio;
  private LocalDate dataEntregaPrevista;
  private List<Funcionario> funcionarios;
  private Funcionario funcionarioResponsavel;

  public Projeto() {
    this.dataInicio = LocalDate.now();
    this.funcionarios = new ArrayList<Funcionario>();
    this.nome = "Novo projeto";
    this.dataEntregaPrevista = dataInicio.plusYears(1);
    this.tipoProjeto = TipoProjeto.Construcao;
  }

  public Projeto(
    String nome,
    TipoProjeto tipoProjeto,
    LocalDate dataEntregaPrevista
  ) {
    this.nome = nome;
    this.tipoProjeto = tipoProjeto;
    this.dataEntregaPrevista = dataEntregaPrevista;

    this.dataInicio = LocalDate.now();
    this.funcionarios = new ArrayList<Funcionario>();
  }

  public String getNome() {
    return this.nome;
  }

  public void adicionarFuncionario(Funcionario funcionario) {
    this.funcionarios.add(funcionario);
  }

  public void removerFuncionario(Funcionario funcionario) {
    this.funcionarios.remove(funcionario);
  }

  public List<Funcionario> listarFuncionarios() {
    return this.funcionarios;
  }
	
	public boolean projetoFechado() {
		return this.status == FECHADO;
	}
  
	public void fecharProjeto() {
		this.status = FECHADO;
	}

  public void atualizarDataEntrega(LocalDate novaDataEntrega) {
    this.dataEntregaPrevista = novaDataEntrega;
  }

  public void atribuirFuncionarioResponsavel(Funcionario funcionario) {
    this.funcionarioResponsavel = funcionario;
  }

  public Funcionario getFuncionarioResponsavel() {
    return this.funcionarioResponsavel;
  }

  public int getStatus() {
    return this.status;
  }
}