package Tabla;

import DAO.ProductoDAO;
import VO.ProductoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ProductoVO{

   ProductoDAO dao = null;


    public void visualizar_ProductoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("id");
        dt.addColumn("descripcion");
        dt.addColumn("precio");
        dt.addColumn("stock");

        dao = new ProductoDAO();
        ProductoVO vo = new ProductoVO();
        ArrayList<ProductoVO> list = dao.Listar_ProductoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getDescripcion();
                fila[2] = vo.getPrecio();
                fila[3] = vo.getStock();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


