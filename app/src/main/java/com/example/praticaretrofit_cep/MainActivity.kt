package com.example.praticaretrofit_cep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praticaretrofit_cep.ui.theme.PraticaRetrofitCEPTheme
import com.example.praticaretrofit_cep.ui.theme.tela.TelaPrincipal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PraticaRetrofitCEPTheme {
                Scaffold() { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "principal") {
                        composable("principal") {
                            TelaPrincipal(modifier = Modifier.padding(innerPadding), onLogoffClick = {
                                navController.navigate("principal")
                            })
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    TelaPrincipal()
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PraticaRetrofitCEPTheme {
       TelaPrincipal()
    }
}