package domain.System.BusinessEntity.BusinessLogic;
import domain.System.BusinessEntity.ViewStockBE;
import repository.System.DataAccess.MySql.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
public class stockClothesBL {
    
    public static  List<ViewStockBE>getStock( ViewStockBE objs) 
    { 
    	stockClothesDA obb= new stockClothesDA();
    	stockClothesDA.list();
        return null;
        		//stockClothesDA.getViewStock(objs);
    }
    
}
