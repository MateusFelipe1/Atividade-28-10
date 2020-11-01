public  class  Corrida {
private String nome;
private String local;
int pontuacao;

public void setNome(String nomeCorredor) {
    this.nome = nomeCorredor;
}

public String getNome() {
    return nome;
}


public void setLocal(String localCorrida) {
    this.local = localCorrida;
}

public String getLocal() {
    return local;
}

void correr(){
    System.out.println("A corredor Felipe Massa foi o vencedor!");
}


}

