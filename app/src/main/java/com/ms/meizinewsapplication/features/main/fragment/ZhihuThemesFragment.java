package com.ms.meizinewsapplication.features.main.fragment;

import android.os.Bundle;

import com.ms.meizinewsapplication.features.base.fragment.FragmentPresenterImpl;
import com.ms.meizinewsapplication.features.main.iview.ZhihuThemesIView;
import com.ms.meizinewsapplication.features.main.json.zhihu_theme.Story;
import com.ms.meizinewsapplication.features.main.json.zhihu_theme.ZhihuThemeNew;
import com.ms.meizinewsapplication.features.main.model.ZhihuThemeNewModel;
import com.ms.meizinewsapplication.features.main.pojo.ZhiHuData;

import org.loader.model.OnModelListener;

import java.util.ArrayList;

/**
 * Created by 啟成 on 2016/5/21.
 */
public class ZhihuThemesFragment extends FragmentPresenterImpl<ZhihuThemesIView> {

    private ZhihuThemeNewModel zhihuThemeNewModel;

    @Override
    public void created(Bundle savedInstance) {
        super.created(savedInstance);
        mView.init(getActivity());
        initModel();
        loadWeb();
    }

    //TODO Model ========================================================

    private void initModel()
    {
        initZhihuThemeNewModel();
    }

    private void loadWeb()
    {
        zhihuThemeNewModelloadWeb();
    }

    private void initZhihuThemeNewModel()
    {
        zhihuThemeNewModel = new ZhihuThemeNewModel();
    }

    private void zhihuThemeNewModelloadWeb()
    {
        zhihuThemeNewModel.loadWeb(
                getContext(),
                listener
        );
    }

    //TODO listener ==========================================

    OnModelListener<ZhihuThemeNew> listener = new OnModelListener<ZhihuThemeNew>() {
        @Override
        public void onSuccess(ZhihuThemeNew zhihuThemeNew) {

            Story story = new Story();
            story.setTitle(zhihuThemeNew.getName());
            story.setType(ZhiHuData.ZHIHU_THEMES);

            zhihuThemeNew.getStories().add(0,story);

            mView.addAllData2QuickAdapter((ArrayList<Story>) zhihuThemeNew.getStories());

        }

        @Override
        public void onError(String err) {

        }

        @Override
        public void onCompleted() {

        }
    };
}