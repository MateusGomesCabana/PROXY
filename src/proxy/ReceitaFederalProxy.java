/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author ALUNO
 */
public class ReceitaFederalProxy extends ReceitaFederal {

    protected String usuario, senha;

    public ReceitaFederalProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    ******
    
    private boolean temPermissaoDeAcesso() {
        return usuario == "admin" && senha == "admin";
    }
}
