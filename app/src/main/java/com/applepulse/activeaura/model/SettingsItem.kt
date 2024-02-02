package com.applepulse.activeaura.model

data class SettingsItem(
    val itemID: Int,
    val drawableInt: Int,
    val itemName: String
)

enum class SettingsState {
    TO_EDIT_PROFILE,
    TO_ABOUT_US,
    TO_FEEDBACK,
    TO_NEED_HELP,
    TO_LOGOUT;

    companion object {
        fun getSettingsState(state: SettingsState) : Int {
            return when (state) {
                TO_EDIT_PROFILE -> 0
                TO_ABOUT_US -> 1
                TO_FEEDBACK-> 2
                TO_NEED_HELP-> 3
                TO_LOGOUT-> 4
            }
        }
    }
}