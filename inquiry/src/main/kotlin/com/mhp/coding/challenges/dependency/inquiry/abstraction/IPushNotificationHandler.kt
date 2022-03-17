package com.mhp.coding.challenges.dependency.inquiry.abstraction

import com.mhp.coding.challenges.dependency.inquiry.Inquiry

interface IPushNotificationHandler {
    /**
     * @description Sends notification based on the specific inquiry
     * @param inquiry - The inquiry
     */
    fun sendNotification(inquiry: Inquiry)
}