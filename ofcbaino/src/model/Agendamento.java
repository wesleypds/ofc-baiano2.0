package model;

import java.util.Date;

public class Agendamento {
    private Long id;
    private Date inicioServico;
    private Date finalizacaoServico;//previsão de finalização
    private String defeitoConstatado;
    private Produto produto;
    private Funcionario funcionario;
    private Orcamento orcamento;
}
