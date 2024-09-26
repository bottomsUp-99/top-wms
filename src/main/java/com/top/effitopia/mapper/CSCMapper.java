package com.top.effitopia.mapper;

import com.top.effitopia.domain.CustomerAnswer;
import com.top.effitopia.domain.CustomerInquiry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 고객센터 Mapper interface
 */
@Mapper
public interface CSCMapper {

    /**
     * 문의글 등록
     * @param: customerInquiry
     */
    void insertInquiry(CustomerInquiry customerInquiry);

    /**
     * 문의 글 전체 조회
     * @return 문의글 list
     */
    List<CustomerInquiry> selectInquiryList();

    /**
     * 문의글 하나 조회(Read)
     * @param: 조회할 문의글ID
     * @return CustomerInquiry
     */
    CustomerInquiry selectOneInquiry(@Param("no") int no);

    /**
     * 문의글 수정
     * param: 수정된 CustomerInquiry
     */
    void updateInquiry(CustomerInquiry customerInquiry);

    /**
     * 문의글 삭제
     * @param: 삭제할 문의글ID
     */
    void deleteInquiry(@Param("no") int no);


//============================================================


    /**
     * 답변 등록
     * @param: customerAnswer
     */
    void insertAnswer(CustomerAnswer customerAnswer);

    /**
     * 답변 한개 조회
     * @param: 조회할 답변ID
     * @return CustomerAnswer
     */
    CustomerAnswer selectOneAnswer(@Param("no")int no);

    /**
     * 답변 수정
     * @param: 수정 된 customerAnswer
     */
    void updateAnswer(CustomerAnswer customerAnswer);

    /**
     * 답변 한개 삭제
     * @param: 삭제할 답변ID
     */
    void deleteAnswer(@Param("no") int no);
}
