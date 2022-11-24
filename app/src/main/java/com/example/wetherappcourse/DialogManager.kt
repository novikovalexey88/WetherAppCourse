package com.example.wetherappcourse

import android.app.AlertDialog
import android.content.Context
import android.widget.EditText

object DialogManager {
    fun locationSettingsDialog(context: Context, listener: Listener) {
        val builder = AlertDialog.Builder(context)
        val dialog = builder.create()
        dialog.setTitle("Enable location?")
        dialog.setMessage("Location disabled, do you whant enable location?")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ok") {_,_ ->
            listener.onClick(null)
            dialog.dismiss() }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancle") {_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }

    fun searchByNameDialog(context: Context, listener: Listener) {
        val builder = AlertDialog.Builder(context)
        val edName = EditText(context)
        builder.setView(edName)

        val dialog = builder.create()
        dialog.setTitle("City name:")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ok") {_,_ ->
            listener.onClick(edName.text.toString())
            dialog.dismiss() }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancle") {_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }

    interface Listener {
        fun onClick (name: String?)
    }
}