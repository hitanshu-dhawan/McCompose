package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun QuantityStepper(
    quantity: Int,
    onIncrementQuantity: () -> Unit,
    onDecrementQuantity: () -> Unit,
) {
    // TODO
}

@Preview("QuantityStepper • Zero")
@Composable
fun QuantityStepperZeroPreview() {
    McComposeTheme {
        QuantityStepper(
            quantity = 0,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}

@Preview("QuantityStepper • NonZero")
@Composable
fun QuantityStepperNonZeroPreview() {
    McComposeTheme {
        QuantityStepper(
            quantity = 3,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}

@Preview("QuantityStepper • Zero • Dark")
@Composable
fun QuantityStepperZeroDarkPreview() {
    McComposeTheme(lightTheme = false) {
        QuantityStepper(
            quantity = 0,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}

@Preview("QuantityStepper • NonZero • Dark")
@Composable
fun QuantityStepperNonZeroDarkPreview() {
    McComposeTheme(lightTheme = false) {
        QuantityStepper(
            quantity = 3,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}