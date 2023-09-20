package androidx.wear.tiles.presentation.hello

import android.util.Log
import androidx.wear.protolayout.LayoutElementBuilders
import androidx.wear.protolayout.LayoutElementBuilders.Layout
import androidx.wear.protolayout.TimelineBuilders
import androidx.wear.protolayout.TimelineBuilders.TimelineEntry
import androidx.wear.tiles.RequestBuilders
import androidx.wear.tiles.ResourceBuilders
import androidx.wear.tiles.TileBuilders
import androidx.wear.tiles.TileBuilders.Tile
import androidx.wear.tiles.TileService
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

/**
 * Tiles are actually part of the system ui, so they're actually in their own application container
 * There's not access to your activities or any xml layout files instead a service which we'll implement here actually
 * describes the layout and the content and the system ui will render it when it's needed
 */
class HelloWorldTileService : TileService() {

    //Define layout
    override fun onTileRequest(requestParams: RequestBuilders.TileRequest): ListenableFuture<TileBuilders.Tile> {
        return Futures.immediateFuture(
            Tile.Builder().setResourcesVersion("1")
                .setTileTimeline(
                    TimelineBuilders.Timeline.Builder().addTimelineEntry(
                        TimelineEntry.Builder().setLayout(
                            Layout.Builder().setRoot(
                                LayoutElementBuilders.Text.Builder().setText("Hello, world!")
                                    .build()
                            ).build()
                        ).build()
                    ).build()
                ).build()
        )

    }

    override fun onResourcesRequest(requestParams: RequestBuilders.ResourcesRequest): ListenableFuture<ResourceBuilders.Resources> {
        Log.i("heec.choi", "onResourcesRequest")
        return Futures.immediateFuture(ResourceBuilders.Resources.Builder().setVersion("1").build())
    }
}