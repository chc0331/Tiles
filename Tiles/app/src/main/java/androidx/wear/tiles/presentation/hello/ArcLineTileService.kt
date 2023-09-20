package androidx.wear.tiles.presentation.hello

import android.util.Log
import androidx.core.content.ContextCompat
import androidx.wear.protolayout.ActionBuilders
import androidx.wear.protolayout.ColorBuilders
import androidx.wear.protolayout.DeviceParametersBuilders
import androidx.wear.protolayout.DeviceParametersBuilders.DeviceParameters
import androidx.wear.protolayout.DimensionBuilders
import androidx.wear.protolayout.DimensionBuilders.DpProp
import androidx.wear.protolayout.LayoutElementBuilders.Arc
import androidx.wear.protolayout.LayoutElementBuilders.ArcLine
import androidx.wear.protolayout.LayoutElementBuilders.Box
import androidx.wear.protolayout.LayoutElementBuilders.Column
import androidx.wear.protolayout.LayoutElementBuilders.FontStyles
import androidx.wear.protolayout.LayoutElementBuilders.Image
import androidx.wear.protolayout.LayoutElementBuilders.Layout
import androidx.wear.protolayout.LayoutElementBuilders.Spacer
import androidx.wear.protolayout.LayoutElementBuilders.Text
import androidx.wear.protolayout.ModifiersBuilders
import androidx.wear.protolayout.ModifiersBuilders.Background
import androidx.wear.protolayout.ModifiersBuilders.Clickable
import androidx.wear.protolayout.ModifiersBuilders.Modifiers
import androidx.wear.protolayout.ResourceBuilders
import androidx.wear.protolayout.ResourceBuilders.AndroidImageResourceByResId
import androidx.wear.protolayout.ResourceBuilders.ImageResource
import androidx.wear.protolayout.TimelineBuilders
import androidx.wear.tiles.R
import androidx.wear.tiles.RequestBuilders
import androidx.wear.tiles.TileBuilders
import androidx.wear.tiles.TileService
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

class ArcLineTileService : TileService() {

    //Define layout
    override fun onTileRequest(requestParams: RequestBuilders.TileRequest): ListenableFuture<TileBuilders.Tile> {
        Log.i("heec.choi","Clickable : ${requestParams.currentState.lastClickableId}")

        return Futures.immediateFuture(
            TileBuilders.Tile.Builder().setResourcesVersion("1").setTileTimeline(
                TimelineBuilders.Timeline.Builder().addTimelineEntry(
                    TimelineBuilders.TimelineEntry.Builder().setLayout(
                        Layout.Builder().setRoot(
                            layout(deviceParameters = requestParams.deviceConfiguration)
                        ).build()
                    ).build()
                ).build()
            ).build()
        )
    }

    override fun onTileResourcesRequest(requestParams: RequestBuilders.ResourcesRequest): ListenableFuture<ResourceBuilders.Resources> {
        return Futures.immediateFuture(
            ResourceBuilders.Resources.Builder().setVersion("1")
                .addIdToImageMapping(
                    "RunningMan",
                    ImageResource.Builder().setAndroidResourceByResId(
                        AndroidImageResourceByResId.Builder()
                            .setResourceId(R.drawable.baseline_run_circle_24).build()
                    ).build()
                ).build()
        )
    }

    private fun layout(deviceParameters: DeviceParametersBuilders.DeviceParameters) =
        Box.Builder().setWidth(DimensionBuilders.expand()).setHeight(
            DimensionBuilders.expand()
        ).addContent(progressArc(1f))
            .addContent(
                Column.Builder()
                    .addContent(currentStepsText("1280", deviceParameters))
                    .addContent(totalStepsText("/ 10000 Steps", deviceParameters))
                    .addContent(
                        Spacer.Builder()
                            .setHeight(DimensionBuilders.dp(10f)).build()
                    )
                    .addContent(startRunButton())
                    .build()
            )
//            .addContent(
//                Text.Builder().setText("CHANGE ME!").setFontStyle(
//                    FontStyles.display3(deviceParameters).build()
//                ).build()
//            )
            .build()

    private fun progressArc(percentage: Float) = Arc.Builder().addContent(
        ArcLine.Builder().setLength(DimensionBuilders.degrees(percentage * 90))
            .setColor(
                ColorBuilders.argb(
                    ContextCompat.getColor(
                        this, com.google.android.material.R.color.m3_ref_palette_white
                    )
                )
            ).setThickness(DimensionBuilders.dp(5f)).build()
    ).setAnchorAngle(DimensionBuilders.degrees(0.0f))
        .build()

    private fun currentStepsText(current: String, deviceParameters: DeviceParameters) =
        Text.Builder()
            .setText(current).setFontStyle(FontStyles.display2(deviceParameters).build()).build()

    private fun totalStepsText(goal: String, deviceParameters: DeviceParameters) =
        Text.Builder().setText(goal).setFontStyle(FontStyles.title3(deviceParameters).build())
            .build()

    private fun startRunButton() =
        Image.Builder().setWidth(DpProp.Builder(30f).build())
            .setHeight(DpProp.Builder(30f).build())
            .setResourceId("RunningMan")
            .setModifiers(
                Modifiers.Builder().setPadding(
                    ModifiersBuilders.Padding.Builder().setStart(DpProp.Builder(1f).build())
                        .setEnd(DpProp.Builder(1f).build())
                        .setTop(DpProp.Builder(1f).build())
                        .setBottom(DpProp.Builder(1f).build()).build()
                ).setBackground(
                    Background.Builder().setCorner(
                        ModifiersBuilders.Corner.Builder().setRadius(DpProp.Builder(15f).build())
                            .build()
                    ).setColor(
                        ColorBuilders.argb(
                            ContextCompat.getColor(
                                this,
                                androidx.appcompat.R.color.material_blue_grey_800
                            )
                        )
                    ).build()
                ).setClickable(
                    Clickable.Builder().setId("START_RUN").setOnClick(
                        ActionBuilders.LoadAction.Builder().build()
                    ).build()
                )
                    .build()
            ).build()


}