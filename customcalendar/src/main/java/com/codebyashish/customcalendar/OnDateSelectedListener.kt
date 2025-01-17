package com.codebyashish.customcalendar

import android.view.View
import java.util.Calendar

interface OnDateSelectedListener {
    /**
     * Called when a date is selected
     * @param view The date view that was clicked (the tag on this view will be as given in the map linking date to the tag)
     * @param selectedDate Calendar representation of the selected date
     * @param clickedDate Description of the date (as given in the map linking date to its description)
     */
    fun onDateSelected(view: View?, selectedDate: Calendar?, clickedDate: Int?)
}
