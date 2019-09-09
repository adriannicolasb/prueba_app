package Tabla;

import DAO.ClienteDAO;
import VO.ClienteVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ClienteVO{

   ClienteDAO dao = null;


    public void visualizar_ClienteVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("nombre");
        dt.addColumn("cuit");
        dt.addColumn("categoria");

        dao = new ClienteDAO();
        ClienteVO vo = new ClienteVO();
        ArrayList<ClienteVO> list = dao.Listar_ClienteVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombre();
                fila[2] = vo.getCuit();
                fila[3] = vo.getCategoria();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


