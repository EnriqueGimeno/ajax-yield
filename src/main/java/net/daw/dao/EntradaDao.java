/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao;

import net.daw.bean.EntradaBean;
import net.daw.helper.Conexion;

/**
 *
 * @author José
 */
public class EntradaDao extends GenericDaoImplementation<EntradaBean> {

    public EntradaDao(Conexion.Tipo_conexion tipoConexion) throws Exception {
        super(tipoConexion, "entrada");
    }

}
