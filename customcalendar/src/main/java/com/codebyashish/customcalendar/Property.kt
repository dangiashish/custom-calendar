package com.codebyashish.customcalendar

class Property {
    /**
     * Resource id for the layout to be inflated.
     */
	@kotlin.jvm.JvmField
	var layoutResource: Int = -1

    /**
     * Resource id for the text view within the date view which will be used to display day of month.
     */
	@kotlin.jvm.JvmField
	var dateTextViewResource: Int = -1

    /**
     * true if the date view should be enabled, false otherwise.
     */
	@kotlin.jvm.JvmField
	var enable: Boolean = true
}
