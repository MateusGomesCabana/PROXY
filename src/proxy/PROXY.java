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
public class PROXY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReceitaFederal receita = new ReceitaFederalProxy("documento", 0, 0);
        System.out.println(receita.getPagarFisico());
    }

}
