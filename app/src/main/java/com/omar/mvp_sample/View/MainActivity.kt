package com.omar.mvp_sample.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.omar.mvp_sample.Contract.ContractInterface
import com.omar.mvp_sample.Presenter.Presenter
import com.omar.mvp_sample.R
import com.omar.mvp_sample.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private  val binding: ActivityMainBinding? = null

    private  var presenter: Presenter? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)
    }

    override fun initView() {
         binding?.counterTextView?.text = presenter?.getCounter()
         binding?.clickButton?.setOnClickListener{presenter?.incrementValue()}
    }

    override fun updateViewData() {

        binding?.counterTextView?.text  = presenter?.getCounter()
    }

}