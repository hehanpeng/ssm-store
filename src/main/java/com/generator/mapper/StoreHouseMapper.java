package com.generator.mapper;

import com.generator.pojo.StoreHouse;

public interface StoreHouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_house
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String shId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_house
     *
     * @mbggenerated
     */
    int insert(StoreHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_house
     *
     * @mbggenerated
     */
    int insertSelective(StoreHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_house
     *
     * @mbggenerated
     */
    StoreHouse selectByPrimaryKey(String shId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_house
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StoreHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_house
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StoreHouse record);
}