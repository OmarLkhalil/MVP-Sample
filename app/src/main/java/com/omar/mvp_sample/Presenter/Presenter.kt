package com.omar.mvp_sample.Presenter

import com.omar.mvp_sample.Contract.ContractInterface
import com.omar.mvp_sample.Model.MainActivityModel

class Presenter (_view: ContractInterface.View) : ContractInterface.Presenter{


    private  var view : ContractInterface.View = _view
    private  var model: ContractInterface.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}