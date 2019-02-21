package model.system.repository;
import domain.System.BusinessEntity.BusinessLogic.stockClothesBL;
import domain.System.BusinessEntity.ViewStockBE;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.system.Abstract.IstockClothes;
import org.springframework.stereotype.Service;
public class stockClothes implements IstockClothes{

    @Override
    public   List<ViewStockBE> getViewStock(ViewStockBE objs) {
        ViewStockBE ob= new ViewStockBE();
        stockClothesBL obl= new stockClothesBL();
        try {
            return  obl.getViewStock(objs);
        } catch (SQLException ex) {
            Logger.getLogger(stockClothes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
