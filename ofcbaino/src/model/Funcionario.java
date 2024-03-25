package model;

import java.util.List;

import enums.Especialidade;

public class Funcionario {
    private Long id;
    private String nome;
    private String telefone;
    private Especialidade especialidade;
    private String email;
    private Double salario;
    private Boolean disponibilidade;
    private Integer servicosSendoFeitos;
    private List<Agendamento> agendamentos; 
}
