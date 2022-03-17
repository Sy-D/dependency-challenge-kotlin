package com.mhp.coding.challenges.dependency.inquiry

import com.mhp.coding.challenges.dependency.inquiry.abstraction.IEmailHandler
import com.mhp.coding.challenges.dependency.inquiry.abstraction.IPushNotificationHandler
import mu.KotlinLogging
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@Component
class InquiryService {
    val emailHandler: IEmailHandler
    val pushNotificationHandler: IPushNotificationHandler;

    constructor(
        emailHandler: IEmailHandler,
        pushNotificationHandler: IPushNotificationHandler,
    ) {
        this.emailHandler = emailHandler;
        this.pushNotificationHandler = pushNotificationHandler
    }

    fun create(inquiry: Inquiry) {
        logger.info {
            "User sent inquiry: $inquiry"
        }

        this.emailHandler.sendEmail(inquiry)
        this.pushNotificationHandler.sendNotification(inquiry)
    }
}

data class Inquiry(
    var username: String,
    var recipient: String,
    var text: String,
)
