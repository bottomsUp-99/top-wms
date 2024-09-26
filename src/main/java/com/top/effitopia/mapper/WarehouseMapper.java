package com.top.effitopia.mapper;

import com.top.effitopia.domain.Cell;
import com.top.effitopia.domain.Warehouse;
import com.top.effitopia.dto.Id;
import com.top.effitopia.dto.PageRequestDTO;
import com.top.effitopia.dto.WarehouseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface WarehouseMapper {
    List<Warehouse> selectWarehouseList(PageRequestDTO pageRequestDTO);
    List<Cell> selectCellList(Integer id, PageRequestDTO pageRequestDTO);
    Optional<Warehouse> update(Warehouse warehouse);
    int delete(Integer warehouse_id);
    Warehouse select(Integer id);
    int insert(Warehouse warehouse);
}
