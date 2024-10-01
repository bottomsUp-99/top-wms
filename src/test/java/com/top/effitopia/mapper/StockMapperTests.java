package com.top.effitopia.mapper;

import com.top.effitopia.domain.Cell;
import com.top.effitopia.domain.Stock;
import com.top.effitopia.domain.StockCheck;
import com.top.effitopia.dto.PageRequestDTO;
import com.top.effitopia.dto.StockDTO;
import com.top.effitopia.dto.StockSearchCond;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@Log4j2
public class StockMapperTests {

    @Autowired
    private StockMapper stockMapper;
    @Autowired
    private  StockCheckMapper stockCheckMapper;

    @Test
    public void updateListTest() {
        stockMapper.updateList();
    }

    @Test
    public void getListStockTest() {
        StockSearchCond stockSearchCond = StockSearchCond.builder().build();

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().searchCond(stockSearchCond).build();
        log.info("재고 페이지당 리스트개수" +pageRequestDTO.getSize());

        log.info("pageRequest : " + pageRequestDTO);
        List<Stock> stockList = stockMapper.selectListStock(pageRequestDTO);
        stockList.forEach(stock -> log.info("stock : " + stock));

    }

    @Test
    public void insertListStockCheck() {
        List<StockCheck> stockCheckList = new ArrayList<>();

        StockCheck stockCheck1 = StockCheck.builder().checkAmount(20).stock(Stock.builder().id(4).build()).cell(Cell.builder().id(107).build()).checkComment("").build();
        stockCheckList.add(stockCheck1);
        StockCheck stockCheck2 = StockCheck.builder().checkAmount(40).stock(Stock.builder().id(3).build()).cell(Cell.builder().id(132).build()).checkComment("").build();
        stockCheckList.add(stockCheck2);
        stockCheckList.forEach(stockCheck -> log.info(stockCheck));
        stockCheckMapper.insertListStockCheck(stockCheckList);
    }
}
