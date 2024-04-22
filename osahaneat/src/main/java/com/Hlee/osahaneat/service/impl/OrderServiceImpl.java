package com.Hlee.osahaneat.service.impl;

import com.Hlee.osahaneat.payload.request.OrderRequest;

public interface OrderServiceImpl {
    boolean insertOrder(OrderRequest orderRequest);
}
