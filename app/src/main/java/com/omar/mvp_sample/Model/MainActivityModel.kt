package com.omar.mvp_sample.Model

import com.omar.mvp_sample.Contract.ContractInterface

class MainActivityModel: ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter() = mCounter

    override fun incrementCounter() {
        mCounter++
    }

}