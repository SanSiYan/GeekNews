package com.codeest.geeknews.ui.main;

import com.codeest.geeknews.base.BasePresenter;
import com.codeest.geeknews.base.BaseView;

/**
 * Created by codeest on 16/8/9.
 */

public interface MainContract {

    interface View extends BaseView{

    }

    interface  Presenter extends BasePresenter<View> {

    }
}
