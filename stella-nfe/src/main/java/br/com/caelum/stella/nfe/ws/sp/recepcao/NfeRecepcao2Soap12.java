
package br.com.caelum.stella.nfe.ws.sp.recepcao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NfeRecepcao2Soap12", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NfeRecepcao2Soap12 {


    /**
     * Transmiss�o de Lote de NF-e
     * 
     * @param nfeCabecMsg
     * @param nfeDadosMsg
     * @return
     *     returns br.com.caelum.stella.nfe.ws.sp.recepcao.NfeRecepcaoLote2Result
     */
    @WebMethod(action = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2/nfeRecepcaoLote2")
    @WebResult(name = "nfeRecepcaoLote2Result", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", partName = "nfeRecepcaoLote2Result")
    public NfeRecepcaoLote2Result nfeRecepcaoLote2(
        @WebParam(name = "nfeDadosMsg", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", partName = "nfeDadosMsg")
        NfeDadosMsg nfeDadosMsg,
        @WebParam(name = "nfeCabecMsg", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", header = true, mode = WebParam.Mode.INOUT, partName = "nfeCabecMsg")
        Holder<NfeCabecMsg> nfeCabecMsg);

}
