package com.xuanzilan.mybatis.dao;

import com.xuanzilan.mybatis.beans.Country;
import com.xuanzilan.mybatis.beans.CountryWithMinister;
import com.xuanzilan.mybatis.beans.MinisterWithCountry;

public interface IAssociateDao {
    /**
     * 通过cid获取Country（包含set数组，单表）
     * @param cid
     * @return
     */
    CountryWithMinister findCountryByCId(int cid);

    /**
     * 通过cid获取Country（包含set数组，连表）
     * @param cid
     * @return
     */
    CountryWithMinister findCountryByCId2(int cid);

    /**
     * 通过mid获取Minister（包含Country）
     * @param mid
     * @return
     */
    MinisterWithCountry findMinisterByMId(int mid);
}
