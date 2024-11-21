package com.example.questnavigasimvvm_030.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm_030.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    //hanya bisa di akses di dalam kelas
    private val _dataModel = MutableStateFlow(Mahasiswa())
    //akses untuk publik
    val dataModel: StateFlow<Mahasiswa> = _dataModel.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ){
        _dataModel.update { mhs ->
            mhs.copy(
                nama = listData[0],
                nim = listData[1],
