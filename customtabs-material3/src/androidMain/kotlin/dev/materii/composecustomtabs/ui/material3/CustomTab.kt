@file:SuppressLint("SetJavaScriptEnabled")
package dev.materii.composecustomtabs.ui.material3

import android.annotation.SuppressLint
import android.webkit.WebSettings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.materii.composecustomtabs.state.CustomTabState

@Composable
fun AndroidCustomTab(
    state: CustomTabState,
    modifier: Modifier = Modifier,
    webviewSettings: WebSettings.() -> Unit = { javaScriptEnabled = true },
    titleBar: @Composable () -> Unit = { CustomTabTitleBar(state) },
    webpage: @Composable () -> Unit = {
        AndroidCustomTabWebpage(
            state,
            webviewSettings = webviewSettings
        )
    }
) {
    CustomTab(
        state = state,
        modifier = modifier,
        titleBar = titleBar,
        webpage = webpage
    )
}