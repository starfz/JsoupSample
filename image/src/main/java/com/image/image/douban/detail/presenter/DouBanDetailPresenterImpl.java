package com.image.image.douban.detail.presenter;


import com.framework.base.mvp.PresenterImplCompat;
import com.image.image.douban.detail.model.DouBanDetailModel;
import com.image.image.douban.detail.view.DouBanDetailView;
import com.image.manager.JsoupDoubanManager;

import org.jsoup.nodes.Document;

import java.util.List;

/**
 * by y on 2016/7/28.
 */
public class DouBanDetailPresenterImpl extends PresenterImplCompat<List<DouBanDetailModel>, DouBanDetailView>
        implements DouBanDetailPresenter {

    public DouBanDetailPresenterImpl(DouBanDetailView view) {
        super(view);
    }

    @Override
    public void netWorkRequest(String url) {
        netWork(url);
    }


    @Override
    public List<DouBanDetailModel> getT(Document document) {
        return JsoupDoubanManager.get(document).getImageDetail();
    }
}