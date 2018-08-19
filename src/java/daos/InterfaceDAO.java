/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author budiarti
 */
public interface InterfaceDAO {
    public boolean insertUpdate(Object object);
    public boolean delete(String id);
    public List<Object> getData(String query);
    public Object getById(String query);
    public Object AutoId(String query);
}
