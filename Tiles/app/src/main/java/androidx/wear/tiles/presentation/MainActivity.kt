/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package androidx.wear.tiles.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.protolayout.expression.proto.AnimationParameterProto
import androidx.wear.protolayout.proto.DeviceParametersProto
import androidx.wear.tiles.R
import androidx.wear.tiles.presentation.theme.TilesTheme
import androidx.wear.tiles.proto.EventProto
import androidx.wear.tiles.proto.RequestProto
//import com.google.protobuf.GeneratedMessageLite


/*
*
* byte : 10
byte : 15
byte : 8
byte : -76
byte : 1
byte : 16
byte : -76
byte : 1
byte : 29
byte : 0
byte : 0
byte : 64
byte : 32
byte : 1
byte : 40
byte : 2
byte : 18
byte : 0
* */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val contents = byteArrayOf(10, 15, 8, -76, 1, 16, -76, 1, 29, 0, 0, 64, 32, 1, 40, 2, 18, 0)
//        val tileRequestProto = RequestProto.TileRequest.parseFrom(contents);

        val request = RequestProto.TileRequest::class.java
        val eventAdd = EventProto.TileAddEvent::class.java
        val deviceParameters = DeviceParametersProto.DeviceParameters::class.java
        val animation = AnimationParameterProto.AnimationParameters::class.java

        log("Request : ${isAssignable(request)}")
        log("EventAdd : ${isAssignable(eventAdd)}")
        log("Device : ${isAssignable(deviceParameters)}")
        log("Animation : ${isAssignable(animation)}")

        setContent {
//            WearApp("Android")
        }
    }
}

fun log(content: String) {
    Log.i("AndroidRuntime", "$content")
}

fun isAssignable(cls: Class<*>) =
    androidx.wear.protolayout.protobuf.GeneratedMessageLite::class.java.isAssignableFrom(cls)

@Composable
fun WearApp(greetingName: String) {
    TilesTheme {
        /* If you have enough items in your list, use [ScalingLazyColumn] which is an optimized
         * version of LazyColumn for wear devices with some added features. For more information,
         * see d.android.com/wear/compose.
         */
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Center
        ) {
            Greeting(greetingName = greetingName)
        }
    }
}

@Composable
fun Greeting(greetingName: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.hello_world, greetingName)
    )
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp("Preview Android")
}