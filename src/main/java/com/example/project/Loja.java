package com.example.project;

public class Loja {

    private static final String ENDLN = System.lineSeparator();
	private static boolean isEmpty(String str){
		if(str == null) return true;
		int spaceCount = str.length() - str.replace(".", "").length();
		return (spaceCount == str.length());
	}

    private String nomeLoja;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String estado;
    private String cep;
    private String telefone;
    private String observacao;
    private String cnpj;
    private String inscricaoEstadual;

    public Loja(String nomeLoja, String logradouro, int numero, String complemento, String bairro, String municipio,
            String estado, String cep, String telefone, String observacao, String cnpj, String inscricaoEstadual) {
        this.nomeLoja = nomeLoja;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.observacao = observacao;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCep() {
        return this.cep;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public String dadosLojaObjeto() {
        // Implemente aqui
        
        String num = this.getNumero() + "";

		if (isEmpty(this.getNomeLoja())){
			throw new RuntimeException("O campo nome da loja é obrigatório");
		}
		if(isEmpty (this.getLogradouro())){
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		}
		if(this.getNumero() == 0){
			num = "s/n";
		}
		if(isEmpty(this.getMunicipio())){
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}
		if (isEmpty(this.getEstado())){
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}
		if (isEmpty(this.getCnpj())){
			throw new RuntimeException("O campo cnpj da loja é obrigatório");
		}
		if (isEmpty(this.getInscricaoEstadual())){
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}
		String part2 = this.getLogradouro()+ ", " + num;
		if (! isEmpty (this.getComplemento())){
			part2 += " " + this.getComplemento();
			}
		String part3 = "";
		if (! isEmpty (this.getBairro())){
			part3 += this.getBairro() + " - ";
		}
		part3 += this.getMunicipio() +  " - " + this.getEstado();
		
		String part4 = "";
		if (! isEmpty (this.getCep())){
			part4 = "CEP:" + this.getCep();
			}
		if (! isEmpty (this.getTelefone())){
			if (! isEmpty (part4)){
				part4 += " ";
			}
			part4 += "Tel " + this.getTelefone();
			}
		if (! isEmpty(part4)){
			part4 += ENDLN;
			}
		String part5 = "";
		if (! isEmpty (this.getObservacao())){
			part5 += this.getObservacao();
			}

		String output = this.getNomeLoja() + ENDLN;
		output += part2 + ENDLN;
		output += part3 + ENDLN;
		output += part4;
		output += part5 + ENDLN;
		output += "CNPJ: " + this.getCnpj() + ENDLN;
        output += "IE: " + this.getInscricaoEstadual() +ENDLN;
        return output;
	}

}