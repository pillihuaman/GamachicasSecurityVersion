package domain.System.BusinessEntity.BusinessLogic;
import domain.System.BusinessEntity.ViewStockBE;
import repository.System.DataAccess.Oracle.stockClothesDA;
import java.sql.SQLException;
import java.util.List;
public class stockClothesBL {
    
    public  List<ViewStockBE> getViewStock( ViewStockBE objs) throws SQLException
    {
        return stockClothesDA.getViewStock(objs);
    }
    
}
