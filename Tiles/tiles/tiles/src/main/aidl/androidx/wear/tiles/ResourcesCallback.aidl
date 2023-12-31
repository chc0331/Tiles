/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.wear.tiles;

import androidx.wear.tiles.ResourcesData;

/**
  * Callback used to return resources from a Tile Provider to the system.
  *
  * Note that this callback is not versioned; new fields in the inner TileData will be handled
  * by standard proto version compatibility in the underlying payload. Any significant changes to
  * this interface will be handled by instead adding new calls into TileProvider.
  *
  */
@JavaPassthrough(annotation="@androidx.annotation.RestrictTo(androidx.annotation.RestrictTo.Scope.LIBRARY)")
interface ResourcesCallback {
    /**
      * Pass a new resource bundle to the system. This should be called in
      * response to a request from TileProvider.onResourcesRequest.
      */
    oneway void updateResources(in ResourcesData resourcesData) = 0;
}
