package com.example.questnavigasimvvm_030.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.questnavigasimvvm_030.model.Mahasiswa


@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onBackButton: () -> Unit // Tambahkan parameter ini
) {
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Nim", dataMhs.nim),
