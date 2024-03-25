package model;

import java.util.Date;
import java.util.List;

public class Orcamento {
    private Long id;
    private PreOrcamento preOrcamento;
    private Date dataEntrada;
    private Double valor;
    private Double desconto;
    private List<Produto> produtos;
    private List<Servico> servicos;
}
