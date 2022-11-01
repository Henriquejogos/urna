/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urnaeletronica.DTO;

import excessoes.persistenciaException;
import java.util.List;
import java.util.ArrayList;
import urnaeletronica.DAO.Eleitor;

/**
 *
 * @author PC-
 */


public class EleicaoDTO {
    static List<Eleitor> listaEleitores = new ArrayList<>();
    
    public EleicaoDTO(){
       
    }
     static public void novoVoto(Integer codigo, Integer voto){

            Eleitor eleitor = procurarEleitor(codigo);
            eleitor.setVoto(voto);
             
         }
     static public void iniciareleitores(){
        Eleitor eleitorteste1 = new Eleitor( new Integer(20708));
        listaEleitores.add(eleitorteste1);
        
        Eleitor eleitorteste2 = new Eleitor( new Integer(27860));
        listaEleitores.add(eleitorteste2);
        
        Eleitor eleitorteste3 = new Eleitor( new Integer(22005));
        listaEleitores.add(eleitorteste3);
        
        Eleitor eleitorteste4 = new Eleitor( new Integer(66570));
        listaEleitores.add(eleitorteste4);
       
        Eleitor eleitorteste5 = new Eleitor( new Integer(89395));
        listaEleitores.add(eleitorteste5);
        
        Eleitor eleitorteste6 = new Eleitor( new Integer(82364));
        listaEleitores.add(eleitorteste6);
        
        Eleitor eleitorteste7 = new Eleitor( new Integer(48734));
        listaEleitores.add(eleitorteste7);
        
        Eleitor eleitorteste8 = new Eleitor( new Integer(21927));
        listaEleitores.add(eleitorteste8);
        
        Eleitor eleitorteste9 = new Eleitor( new Integer(31869));
        listaEleitores.add(eleitorteste9);
        
        Eleitor eleitorteste10 = new Eleitor( new Integer(77874));
        listaEleitores.add(eleitorteste10);
        
        Eleitor eleitorteste11 = new Eleitor( new Integer(15107));
        listaEleitores.add(eleitorteste11);
        
        Eleitor eleitorteste12 = new Eleitor( new Integer(79882));
        listaEleitores.add(eleitorteste12);
        
        Eleitor eleitorteste13 = new Eleitor( new Integer(21017));
        listaEleitores.add(eleitorteste13);
        
        Eleitor eleitorteste14 = new Eleitor( new Integer(77800));
        listaEleitores.add(eleitorteste14);
        
        Eleitor eleitorteste15 = new Eleitor( new Integer(41883));
        listaEleitores.add(eleitorteste15);
        
        Eleitor eleitorteste16 = new Eleitor( new Integer(14815));
        listaEleitores.add(eleitorteste16);
        
        Eleitor eleitorteste17 = new Eleitor( new Integer(22525));
        listaEleitores.add(eleitorteste17);
        
        Eleitor eleitorteste18 = new Eleitor( new Integer(61233));
        listaEleitores.add(eleitorteste18);
        
        Eleitor eleitorteste19 = new Eleitor( new Integer(94355));
        listaEleitores.add(eleitorteste19);
        
        Eleitor eleitorteste20 = new Eleitor( new Integer(40580));
        listaEleitores.add(eleitorteste20);
        
        Eleitor eleitorteste21 = new Eleitor( new Integer(19573));
        listaEleitores.add(eleitorteste21);
        
        Eleitor eleitorteste22 = new Eleitor( new Integer(58864));
        listaEleitores.add(eleitorteste22);
        
        Eleitor eleitorteste23 = new Eleitor( new Integer(60973));
        listaEleitores.add(eleitorteste23);
        
        Eleitor eleitorteste24 = new Eleitor( new Integer(75182));
        listaEleitores.add(eleitorteste24);
        
        Eleitor eleitorteste25 = new Eleitor( new Integer(82757));
        listaEleitores.add(eleitorteste25);
        
        Eleitor eleitorteste26 = new Eleitor( new Integer(32642));
        listaEleitores.add(eleitorteste26);
        
        Eleitor eleitorteste27 = new Eleitor( new Integer(35420));
        listaEleitores.add(eleitorteste27);
        
        Eleitor eleitorteste28 = new Eleitor( new Integer(13236));
        listaEleitores.add(eleitorteste28);
        
        Eleitor eleitorteste29 = new Eleitor( new Integer(24573));
        listaEleitores.add(eleitorteste29);
        
        Eleitor eleitorteste30 = new Eleitor( new Integer(23273));
        listaEleitores.add(eleitorteste30);
        
        Eleitor eleitorteste31 = new Eleitor( new Integer(35950));
        listaEleitores.add(eleitorteste31);
        
        Eleitor eleitorteste32 = new Eleitor( new Integer(33580));
        listaEleitores.add(eleitorteste32);
        
        Eleitor eleitorteste33 = new Eleitor( new Integer(92997));
        listaEleitores.add(eleitorteste33);
        
        Eleitor eleitorteste34 = new Eleitor( new Integer(40112));
        listaEleitores.add(eleitorteste34);
        
        Eleitor eleitorteste35 = new Eleitor( new Integer(73390));
        listaEleitores.add(eleitorteste35);
        
        Eleitor eleitorteste36 = new Eleitor( new Integer(87966));
        listaEleitores.add(eleitorteste36);
        
        Eleitor eleitorteste37 = new Eleitor( new Integer(63696));
        listaEleitores.add(eleitorteste37);
        
        Eleitor eleitorteste38 = new Eleitor( new Integer(27876));
        listaEleitores.add(eleitorteste38);
        
        Eleitor eleitorteste39 = new Eleitor( new Integer(34047));
        listaEleitores.add(eleitorteste39);
        
        Eleitor eleitorteste40 = new Eleitor( new Integer(73485));
        listaEleitores.add(eleitorteste40);
        
        Eleitor eleitorteste41 = new Eleitor( new Integer(53936));
        listaEleitores.add(eleitorteste41);
        
        Eleitor eleitorteste42 = new Eleitor( new Integer(87921));
        listaEleitores.add(eleitorteste42);
        
        Eleitor eleitorteste43 = new Eleitor( new Integer(64509));
        listaEleitores.add(eleitorteste43);
        
        Eleitor eleitorteste44 = new Eleitor( new Integer(33468));
        listaEleitores.add(eleitorteste44);
        
        Eleitor eleitorteste45 = new Eleitor( new Integer(79050));
        listaEleitores.add(eleitorteste45);
        
        Eleitor eleitorteste46 = new Eleitor( new Integer(27024));
        listaEleitores.add(eleitorteste46);
        
        Eleitor eleitorteste47 = new Eleitor( new Integer(73545));
        listaEleitores.add(eleitorteste47);
        
        Eleitor eleitorteste48 = new Eleitor( new Integer(70653));
        listaEleitores.add(eleitorteste48);
        
        Eleitor eleitorteste49 = new Eleitor( new Integer(83240));
        listaEleitores.add(eleitorteste49);
        
        Eleitor eleitorteste50 = new Eleitor( new Integer(66099));
        listaEleitores.add(eleitorteste50);
        
        Eleitor eleitorteste51 = new Eleitor( new Integer(60000));
        listaEleitores.add(eleitorteste51);
        
        Eleitor eleitorteste52 = new Eleitor( new Integer(61440));
        listaEleitores.add(eleitorteste52);
        
        Eleitor eleitorteste53 = new Eleitor( new Integer(16203));
        listaEleitores.add(eleitorteste53);
        
        Eleitor eleitorteste54 = new Eleitor( new Integer(90035));
        listaEleitores.add(eleitorteste54);
        
        Eleitor eleitorteste55 = new Eleitor( new Integer(64411));
        listaEleitores.add(eleitorteste55);
        
        Eleitor eleitorteste56 = new Eleitor( new Integer(64946));
        listaEleitores.add(eleitorteste56);
        
        Eleitor eleitorteste57 = new Eleitor( new Integer(11748));
        listaEleitores.add(eleitorteste57);
        
        Eleitor eleitorteste58 = new Eleitor( new Integer(75844));
        listaEleitores.add(eleitorteste58);
        
        Eleitor eleitorteste59 = new Eleitor( new Integer(67011));
        listaEleitores.add(eleitorteste59);
        
        Eleitor eleitorteste60 = new Eleitor( new Integer(18915));
        listaEleitores.add(eleitorteste60);

     }
     static public Eleitor procurarEleitor(int codigo){
         if(listaEleitores != null){
            for(Eleitor r : listaEleitores){
                if(r.getCodigo() == codigo){
                    return r;
                }
            }
         }
         return null;
     }
    static public Integer conferirCodigo(Integer codigo)throws persistenciaException{

        Eleitor eleitor = procurarEleitor(codigo);
        if(eleitor == null){
            throw new persistenciaException("Código não encontrado");
        }
        Integer voto;
        voto = eleitor.getVoto();
        if(voto != null){
            throw new persistenciaException("Voce já votou");
        }  
        return codigo;
    }
    static public double[] apuracao(){
        Integer bolsonaro = 0;
        Integer lula = 0;
        for(Eleitor r : listaEleitores){
            if(r.getVoto() == null){
                
            }else if(r.getVoto() == 13){
                lula++;
            }else if(r.getVoto() == 22){
                bolsonaro++;
            }
            
            
        }
        Integer total = bolsonaro + lula;
        double[] resultado = new double[2];
        if(bolsonaro > lula){
            double porcentagem = (bolsonaro * 100) / total;
            porcentagem = (Math.round(porcentagem*10.0)/10.0);
            resultado[0] = 22;
            resultado[1] = porcentagem;
            return resultado;
        }
        if(lula > bolsonaro){
            double porcentagem = (lula * 100) / total;
            porcentagem = (Math.round(porcentagem*10.0)/10.0);
            resultado[0] = 13;
            resultado[1] = porcentagem;
            return resultado;
        }
        if(lula == bolsonaro){
            resultado[0] = 50;
            resultado[1] = 50;
            return resultado;
        }
        return null;
}
    
}
