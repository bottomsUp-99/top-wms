package com.top.effitopia.domain;

import com.top.effitopia.enumeration.InboundStatus;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Inbound {

    private Integer id;
    private Member member;
    private Warehouse warehouse;
    private Product product;
    private Vendor vendor;
    private LocalDate inboundRequestDate;
    private LocalDate inboundApprovedDate;
    private LocalDate inboundExpectDate;
    private LocalDate inboundCompletedDate;
    private InboundStatus inboundStatus;

}
