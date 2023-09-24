package androidx.wear.tiles.presentation.hello

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.annotation.OptIn
import androidx.core.content.ContextCompat
import androidx.wear.protolayout.ActionBuilders
import androidx.wear.protolayout.ColorBuilders
import androidx.wear.protolayout.DeviceParametersBuilders
import androidx.wear.protolayout.DimensionBuilders
import androidx.wear.protolayout.DimensionBuilders.DpProp
import androidx.wear.protolayout.LayoutElementBuilders
import androidx.wear.protolayout.LayoutElementBuilders.Arc
import androidx.wear.protolayout.LayoutElementBuilders.ArcLine
import androidx.wear.protolayout.LayoutElementBuilders.Box
import androidx.wear.protolayout.LayoutElementBuilders.Image
import androidx.wear.protolayout.LayoutElementBuilders.Layout
import androidx.wear.protolayout.LayoutElementBuilders.Text
import androidx.wear.protolayout.ModifiersBuilders
import androidx.wear.protolayout.ModifiersBuilders.AnimatedVisibility
import androidx.wear.protolayout.ModifiersBuilders.Clickable
import androidx.wear.protolayout.ModifiersBuilders.DefaultContentTransitions
import androidx.wear.protolayout.ModifiersBuilders.Modifiers
import androidx.wear.protolayout.ModifiersBuilders.SLIDE_DIRECTION_LEFT_TO_RIGHT
import androidx.wear.protolayout.ResourceBuilders
import androidx.wear.protolayout.ResourceBuilders.AndroidImageResourceByResId
import androidx.wear.protolayout.ResourceBuilders.ImageResource
import androidx.wear.protolayout.TimelineBuilders
import androidx.wear.protolayout.expression.ProtoLayoutExperimental
import androidx.wear.tiles.R
import androidx.wear.tiles.RequestBuilders
import androidx.wear.tiles.TileBuilders
import androidx.wear.tiles.TileService
import androidx.wear.tiles.TileUpdateRequestData
import androidx.wear.tiles.TileUpdateRequester
import androidx.wear.tiles.TileUpdateRequesterService
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

class ArcLineTileService : TileService() {

    companion object {
        var count = 0
        var isFlag = false
    }

    //Define layout
    @OptIn(ProtoLayoutExperimental::class)
    override fun onTileRequest(requestParams: RequestBuilders.TileRequest): ListenableFuture<TileBuilders.Tile> {
        Log.i("heec.choi", "Clickable : ${requestParams.currentState.lastClickableId}")
        count++

        isFlag = !isFlag

        return Futures.immediateFuture(
            TileBuilders.Tile.Builder().setResourcesVersion("1").setTileTimeline(
                TimelineBuilders.Timeline.fromLayoutElement(
                    Text.Builder().setText(getTileTextToShow()).setModifiers(
                        ModifiersBuilders.Modifiers.Builder()
                            .setContentUpdateAnimation(
                                AnimatedVisibility.Builder()
                                    .setEnterTransition(
                                        DefaultContentTransitions.slideIn(
                                            SLIDE_DIRECTION_LEFT_TO_RIGHT
                                        )
                                    )
                                    .setExitTransition(
                                        DefaultContentTransitions.slideOut(
                                            SLIDE_DIRECTION_LEFT_TO_RIGHT
                                        )
                                    ).build()
                            )
                            .setClickable(
                                Clickable.Builder()
                                    .setOnClick(ActionBuilders.LoadAction.Builder().build()).build()
                            )
                            .build()
                    ).build()
                )

//                TimelineBuilders.Timeline.Builder().addTimelineEntry(
//                    TimelineBuilders.TimelineEntry.Builder().setLayout(
//                        Layout.Builder().setRoot(
//                            layout(deviceParameters = requestParams.deviceConfiguration)
//                                .addContent(tappableElement())
//                                .build()
//                        ).build()
//                    ).build()
//                ).build()

            ).build()
        )
    }

    private fun getTileTextToShow(): String {

        return if (count % 4 == 0) "Zero"
        else if (count % 4 == 1) "One"
        else if (count % 4 == 2) "Two"
        else "Three"
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

    @OptIn(ProtoLayoutExperimental::class)
    private fun layout(deviceParameters: DeviceParametersBuilders.DeviceParameters) =
        Box.Builder().setWidth(DimensionBuilders.expand()).setHeight(
            DimensionBuilders.expand()
        ).setModifiers(
            Modifiers.Builder()
                .setClickable(
                    ModifiersBuilders.Clickable.Builder().setOnClick(
                        ActionBuilders.LoadAction.Builder().build()
                    ).build()
                )
                .setPadding(
                    ModifiersBuilders.Padding.Builder()
                        .setStart(DimensionBuilders.dp(20f))
                        .setEnd(DimensionBuilders.dp(20f))
                        .build()
                )
                .build()
        )

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
                ).setClickable(
                    Clickable.Builder().setId("START_RUN").setOnClick(
                        ActionBuilders.LaunchAction.Builder().setAndroidActivity(
                            ActionBuilders.AndroidActivity.Builder()
                                .setPackageName("androidx.wear.tiles")
                                .setClassName("androidx.wear.tiles.presentation.MainActivity")
                                .build()
                        ).build()
                    ).build()
                ).build()
            ).build()

    @SuppressLint("Range")
    @OptIn(ProtoLayoutExperimental::class)
    private fun tappableElement(): LayoutElementBuilders.LayoutElement =
        Text.Builder()
            .setText("Tap me $count")
            .setModifiers(
                Modifiers.Builder()
//                    .setPadding(
//                        ModifiersBuilders.Padding.Builder().setAll(DimensionBuilders.dp(20f))
//                            .build()
//                    )
//                    .setBackground(
//                        ModifiersBuilders.Background.Builder().setColor(
//                            ColorBuilders.argb(
//                                ContextCompat.getColor(
//                                    this,
//                                    R.color.red
//                                )
//                            )
//                        ).setCorner(
//                            ModifiersBuilders.Corner.Builder().setRadius(DimensionBuilders.dp(30f))
//                                .build()
//                        ).build()
//                    )
                    .setClickable(
                        ModifiersBuilders.Clickable.Builder()
                            .setOnClick(ActionBuilders.LoadAction.Builder().build()).build()
                    )
//                    .setBorder(
//                        ModifiersBuilders.Border.Builder().setColor(
//                            ColorBuilders.argb(getColor(this, R.color.blue))
//                        ).setWidth(DimensionBuilders.dp(2f))
//                            .build()
//                    )
                    .setContentUpdateAnimation(
                        ModifiersBuilders.AnimatedVisibility.Builder()
                            .setEnterTransition(
                                DefaultContentTransitions.slideIn(
                                    SLIDE_DIRECTION_LEFT_TO_RIGHT
                                )
                            )
                            .setExitTransition(
                                DefaultContentTransitions.slideOut(
                                    SLIDE_DIRECTION_LEFT_TO_RIGHT
                                )
                            )
                            .build()
                    )
//                    .setSemantics(ModifiersBuilders.Semantics.Builder().setRole().setStateDescription().build())
//                    .setMetadata(ModifiersBuilders.ElementMetadata.Builder()
//                        .build())
                    .build()
            )
            .build()

    private fun getColor(context: Context, color: Int) = ContextCompat.getColor(context, color)
}