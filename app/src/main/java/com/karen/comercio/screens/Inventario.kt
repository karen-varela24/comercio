package com.karen.comercio.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.karen.comercio.ui.theme.ComercioTheme

private val FondoPantalla = Color(0xFFF6F7F9)
private val FondoPanelGris = Color(0xFFE8E8E8)
private val BotonSinSeleccionar = Color(0xFFB8CCE0)
private val Bss = Color(0xFFB8CCE0)
private val AzulBotonPrincipal = Color(0xFF4A88BE)
private val AzulObscuroFinalizar = Color(0xFF143658)

private val RojoCancelar = Color(0xFFC43838)
private val TextoAzulOscuro = Color(0xFF1E3A5F)
private val TextoGris = Color(0xFF4A5568)

@Composable
fun Inventario (modifier: Modifier= Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = FondoPantalla
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ListaInsumos(
                modifier = Modifier
                    .weight(1.05f)
                    .fillMaxHeight()
            )
            DetalleInsumos(
                modifier = Modifier
                    .weight(1.05f)
                    .fillMaxHeight()
            )
        }
    }
}

@Composable
private fun ListaInsumos(modifier: Modifier= Modifier){
    Column(
        modifier= Modifier,
        verticalArrangement = Arrangement.spacedBy((14.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(24.dp))
                .background(AzulBotonPrincipal)
                .padding(horizontal = 14.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "≡",
                    color = TextoAzulOscuro
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(AzulBotonPrincipal)
                    .padding(horizontal = 24.dp, vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Chat",
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(AzulBotonPrincipal)
                    .padding(horizontal = 24.dp, vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Inventario",
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(28.dp))
            .background(FondoPanelGris)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(28.dp))
                .background(AzulBotonPrincipal.copy(alpha = 0.7f))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {

                Text(text = "Hinted search text", color = TextoGris)
            }
            Text(text = "🔍", color = TextoGris)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(24.dp))
                .background(Color.White)
                .padding(12.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(AzulBotonPrincipal.copy(alpha = 0.7f)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "+",
                    color = Color.Black,
                    style = MaterialTheme.typography.headlineMedium
                )
            }
            Text(
                text = "Agregar Insumo nuevo",
                color = TextoAzulOscuro,
                style = MaterialTheme.typography.titleMedium
            )
        }

    }
}

@Composable
private fun DetalleInsumos(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(28.dp))
            .background(FondoPanelGris)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth(0.65f)
                .height(190.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(AzulBotonPrincipal.copy(alpha = 0.8f))
                .padding(12.dp),
            contentAlignment = Alignment.Center
        ) {

        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            }
        }
    }


