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
public class ReceitaFederal {

    float valueDocument, valueImposto;
    String document;

    public ReceitaFederal() {

    }

    public String getPagarFisico() {
        return null;
    }

    public String getPagarFisico(String documento, float volorDocumento, float valorImposto) {
        return "foi pago";
    }

    public String getPagarJuridico() {
        return null;
    }

    String getPagarJuridico(String documento, float volorDocumento, float valorImposto) {
      return "foi pago";
    }

}
