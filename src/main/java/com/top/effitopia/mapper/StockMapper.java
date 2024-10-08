package com.top.effitopia.mapper;


import com.top.effitopia.domain.Stock;
import com.top.effitopia.domain.StockCheck;
import com.top.effitopia.domain.TempStock;
import com.top.effitopia.dto.PageRequestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

/**
 * 재고 Mapper
 */
@Mapper
public interface StockMapper {
    
    /**
     * 재고 테이블의 상품 리스트 조회
     * @return 재고 리스트
     */
    List<Stock> selectListStock(PageRequestDTO pageRequestDTO);

    /**
     * 재고 테이블의 상품 하나 조회
     * @param id
     * @return
     */
    Optional<Stock> selectOneStock(@Param("id")int id);

    /**
     * 임시재고를 재고 테이블에 반영
     * @param: 재고 List
     */
    void updateList();


    int getStockCount(PageRequestDTO pageRequestDTO);

    
    
    
    


    /**
     * 임시재고 테이블에 상품 등록( 입고 및 출고시 )
     * @param: tempStock
     */
    void insertTempStock(TempStock tempStock);

    /**
     * 임시재고 테이블의 상품 수정
     * @param: stock
     */
    void updateTempStock(TempStock tempStock);

    /**
     * 임시재고 테이블의 상품 삭제
     * @param: 삭제할 ID
     */
    void	deleteTempStock(int no);

    /**
     * 임시재고 테이블의 상품 리스트 조회
     * @return : 임시재고 리스트
     */
    List<TempStock>	selectListTempStock(PageRequestDTO pageRequestDTO);

    int getTempStockCount(PageRequestDTO pageRequestDTO);



    
}
