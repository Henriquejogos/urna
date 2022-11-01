/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica.DAO;

/**
 *
 * @author PC-
 */
public class Eleitor {

    Integer codigo;
    Integer voto;

    public Eleitor(Integer codigo) {
        this.codigo = codigo;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

    public Integer getVoto() {
        return voto;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
