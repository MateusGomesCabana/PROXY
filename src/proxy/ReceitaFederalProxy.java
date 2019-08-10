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

    protected String documento;
    protected float volorDocumento, valorImposto;

    public ReceitaFederalProxy(String documento, float volorDocumento, float valorImposto) {
        this.documento = documento;
        this.volorDocumento = volorDocumento;
        this.valorImposto = valorImposto;
    }

    @Override
    public String getPagarFisico() {
        if (!"".equals(this.documento)) {
            return super.getPagarFisico(this.documento,this.volorDocumento,this.valorImposto);
        }
        return null;
    }

    @Override
    public String getPagarJuridico() {
        if (!"".equals(this.documento)) {
            return super.getPagarJuridico(this.documento,this.volorDocumento,this.valorImposto);
        }
        return null;
        
    }

}
