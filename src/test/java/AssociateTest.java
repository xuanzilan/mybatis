import com.xuanzilan.mybatis.beans.Country;
import com.xuanzilan.mybatis.beans.CountryWithMinister;
import com.xuanzilan.mybatis.beans.Minister;
import com.xuanzilan.mybatis.beans.MinisterWithCountry;
import com.xuanzilan.mybatis.dao.IAssociateDao;
import com.xuanzilan.mybatis.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssociateTest {
    private static Logger logger = Logger.getLogger(AssociateTest.class);
    private SqlSession sqlSession;
    private IAssociateDao dao;

    @Before
    public void before(){
        sqlSession = DBUtil.getSqlSession();
        dao = sqlSession.getMapper(IAssociateDao.class);
    }

    @After
    public void after(){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }

    /**
     * 一对多关联（单表查询）
     */
    @Test
    public void findCountryByCId(){
        CountryWithMinister country =  dao.findCountryByCId(1);
        logger.info(country.getList());
        CountryWithMinister country1 =  dao.findCountryByCId(1);
        logger.info(country1.getList());
    }

    /**
     * 一对多关联（多表查询）
     */
    @Test
    public void findCountryByCId2(){
        CountryWithMinister country =  dao.findCountryByCId2(1);
        logger.info(country);
    }

    /**
     * 多对一关联
     */
    @Test
    public void findMinisterByMId(){
        MinisterWithCountry minister =  dao.findMinisterByMId(1);
        logger.info(minister);
    }
}
