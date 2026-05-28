package com.example.neveranother.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MeasurementVM: ViewModel() {
    var upperCircumference by mutableStateOf("")
    var lowerCircumference by mutableStateOf("")
    var breastHeight by mutableStateOf("")
    var breastWidth by mutableStateOf("")


    fun hasMeasurements(): Boolean {
        if (upperCircumference.isEmpty() || lowerCircumference.isEmpty() || breastHeight.isEmpty() || breastWidth.isEmpty())
            return false
        else
            return true
    }


}


