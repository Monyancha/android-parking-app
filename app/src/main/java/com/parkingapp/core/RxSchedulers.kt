package com.parkingapp.core

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RxSchedulers {

    val io get() = Schedulers.io()

    val ui get() = AndroidSchedulers.mainThread() as Scheduler

    val computation get() = Schedulers.computation()
}
