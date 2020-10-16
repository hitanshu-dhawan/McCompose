package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

// TODO : change design and have a look at all the extra parameters of this compose function

@Composable
fun QuantityStepper(
    text: String,
    primaryColor: Color,
    secondaryColor: Color,
    count: Int,
    onIncrement: () -> Unit,
    onDecrement: () -> Unit
) {
    Box(
        modifier = Modifier
            .preferredWidth(88.dp)
            .preferredHeight(34.dp),
        shape = RoundedCornerShape(4.dp),
        border = BorderStroke(1.dp, primaryColor)
    ) {
        if (count == 0) {
            Row(
                modifier = Modifier.clickable(onClick = onIncrement),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier.weight(1f),
                    gravity = ContentGravity.Center
                ) {
                    Text(
                        text = text,
                        color = primaryColor
                    )
                }
                QuantityStepperIcon(
                    asset = Icons.Default.Add,
                    backgroundColor = secondaryColor,
                    tint = primaryColor
                )
            }
        } else {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                QuantityStepperIcon(
                    modifier = Modifier.clickable(onClick = onDecrement),
                    asset = Icons.Default.Remove,
                    backgroundColor = primaryColor,
                    tint = Color.White
                )
                Box(
                    modifier = Modifier.weight(1f),
                    gravity = ContentGravity.Center
                ) {
                    Text(
                        text = "$count",
                        color = primaryColor
                    )
                }
                QuantityStepperIcon(
                    modifier = Modifier.clickable(onClick = onIncrement),
                    asset = Icons.Default.Add,
                    backgroundColor = primaryColor,
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
fun QuantityStepperIcon(
    modifier: Modifier = Modifier,
    asset: VectorAsset,
    tint: Color,
    backgroundColor: Color
) {
    Box(
        modifier = modifier
            .background(backgroundColor)
            .padding(horizontal = 4.dp, vertical = 8.dp),
        gravity = ContentGravity.Center
    ) {
        Icon(
            asset = asset,
            modifier = Modifier.preferredSize(18.dp),
            tint = tint
        )
    }
}

@Preview
@Composable
fun QuantityStepper_Zero_Preview() {
    QuantityStepper(
        count = 0,
        onIncrement = {},
        onDecrement = {},
        text = "ADD",
        primaryColor = Color(0xff304ffe),
        secondaryColor = Color(0xfff0f0f0)
    )
}

@Preview
@Composable
fun QuantityStepper_NonZero_Preview() {
    QuantityStepper(
        count = 3,
        onIncrement = {},
        onDecrement = {},
        text = "ADD",
        primaryColor = Color(0xff304ffe),
        secondaryColor = Color(0xfff0f0f0)
    )
}