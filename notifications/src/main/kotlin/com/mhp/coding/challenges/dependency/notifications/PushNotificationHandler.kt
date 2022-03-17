package com.mhp.coding.challenges.dependency.notifications

import com.mhp.coding.challenges.dependency.inquiry.Inquiry
import com.mhp.coding.challenges.dependency.inquiry.abstraction.IPushNotificationHandler
import mu.KotlinLogging
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class PushNotificationHandler : IPushNotificationHandler {
    override fun sendNotification(inquiry: Inquiry) {
        logger.info {
            "Sending push notification for: $inquiry"
        }
    }
}
