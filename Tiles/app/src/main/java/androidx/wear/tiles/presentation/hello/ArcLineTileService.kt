package androidx.wear.tiles.presentation.hello

import androidx.core.content.ContextCompat
import androidx.wear.protolayout.ColorBuilders
import androidx.wear.protolayout.DeviceParametersBuilders
import androidx.wear.protolayout.DimensionBuilders
import androidx.wear.protolayout.LayoutElementBuilders
import androidx.wear.protolayout.ResourceBuilders
import androidx.wear.protolayout.TimelineBuilders
import androidx.wear.tiles.RequestBuilders
import androidx.wear.tiles.TileBuilders
import androidx.wear.tiles.TileService
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

class ArcLineTileService : TileService() {

    //Define layout
    override fun onTileRequest(requestParams: RequestBuilders.TileRequest): ListenableFuture<TileBuilders.Tile> {
        return Futures.immediateFuture(
            TileBuilders.Tile.Builder().setResourcesVersion("1").setTileTimeline(
                TimelineBuilders.Timeline.Builder().addTimelineEntry(
                    TimelineBuilders.TimelineEntry.Builder().setLayout(
                        LayoutElementBuilders.Layout.Builder().setRoot(
//                                Text.Builder().setText("Hello, world!")
//                                    .build()
                            layout(deviceParameters = requestParams.deviceConfiguration)
                        ).build()
                    ).build()
                ).build()
            ).build()
        )
    }

    override fun onTileResourcesRequest(requestParams: RequestBuilders.ResourcesRequest): ListenableFuture<ResourceBuilders.Resources> {
        return Futures.immediateFuture(ResourceBuilders.Resources.Builder().setVersion("1").build())
    }

    private fun layout(deviceParameters: DeviceParametersBuilders.DeviceParameters) =
        LayoutElementBuilders.Box.Builder().setWidth(DimensionBuilders.expand()).setHeight(
            DimensionBuilders.expand()
        ).addContent(progressArc(1f))
            .addContent(
                LayoutElementBuilders.Text.Builder().setText("CHANGE ME!").setFontStyle(
                    LayoutElementBuilders.FontStyles.display3(deviceParameters).build()
                ).build()
            ).build()

    private fun progressArc(percentage: Float) = LayoutElementBuilders.Arc.Builder().addContent(
        LayoutElementBuilders.ArcLine.Builder().setLength(DimensionBuilders.degrees(percentage)).setColor(
            ColorBuilders.argb(
                ContextCompat.getColor(
                    this, com.google.android.material.R.color.m3_ref_palette_white
                )
            )
        ).setThickness(DimensionBuilders.dp(1f)).build()
    )
        .setAnchorAngle(DimensionBuilders.degrees(0.0f))
        .build()

}