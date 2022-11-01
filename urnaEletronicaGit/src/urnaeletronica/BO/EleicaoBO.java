/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica.BO;

import excessoes.BusinessException;
import excessoes.persistenciaException;
import urnaeletronica.DTO.EleicaoDTO;

/**
 *
 * @author PC-
 */
public class EleicaoBO {
    static public double[] apuracao()throws BusinessException{
        return EleicaoDTO.apuracao();
    }
    static public Integer conferirCodigo(Integer codigo)throws BusinessException{
        try{
            Integer conferir = EleicaoDTO.conferirCodigo(codigo);
            return conferir;
        }catch(persistenciaException ex){
            throw new BusinessException(ex.getMessage());
        }
    }
    static public void novoVoto(Integer codigo, Integer voto){
         EleicaoDTO.novoVoto(codigo, voto);             
    }
}
