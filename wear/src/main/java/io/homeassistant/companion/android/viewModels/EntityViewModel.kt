package io.homeassistant.companion.android.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import io.homeassistant.companion.android.common.data.integration.Entity

class EntityViewModel : ViewModel() {

    var entitiesResponse: List<Entity<Any>> by mutableStateOf(mutableListOf())
    var favoriteEntities: MutableSet<String> by mutableStateOf(mutableSetOf())
}