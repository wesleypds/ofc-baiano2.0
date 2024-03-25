package model;

import java.util.Date;

public class Agendamento {
    private Long id;
    private Date inicioServico;
    private Date finalizacaoServico;
    private String defeito;
    private Produto produto;
    private Funcionario funcionario;
}
