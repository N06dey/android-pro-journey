package com.example.basisCi

import app.cash.turbine.test
import com.example.basisCi.ui.theme.di.TimeProvider
import com.example.basisCi.ui.theme.viewModels.HomePageViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class CounterViewModelTest {
    @Test
    fun incrementsAndResets() = runTest {
        val vm = HomePageViewModel(object : TimeProvider { override fun now() = 0L })
        vm.ans.test {
            assertEquals(0, awaitItem())
            vm.inc(); assertEquals(1, awaitItem())
            vm.inc(); assertEquals(2, awaitItem())
            vm.reset(); assertEquals(0, awaitItem())
            cancelAndIgnoreRemainingEvents()
        }
    }
}