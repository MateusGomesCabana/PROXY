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
        return new String("o valor pago para a pessoa fisica: " + valueDocument);
    }

    public String getPagarJuridico() {
        return new String("o valor pago para a pessoa juridica: " + valueDocument);
    }

}
