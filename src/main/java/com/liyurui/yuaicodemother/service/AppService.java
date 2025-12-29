package com.liyurui.yuaicodemother.service;


import com.liyurui.yuaicodemother.model.dto.app.AppQueryRequest;
import com.liyurui.yuaicodemother.model.entity.App;
import com.liyurui.yuaicodemother.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AppService extends IService<App> {


    /**
     * 获取应用封装类
     *
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装类列表
     *
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     *
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);
}
