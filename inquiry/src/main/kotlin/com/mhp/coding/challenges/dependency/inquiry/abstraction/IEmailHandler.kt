package com.mhp.coding.challenges.dependency.inquiry.abstraction

import com.mhp.coding.challenges.dependency.inquiry.Inquiry

interface IEmailHandler {
    /**
     * @description Sends Email based on specific Inquiry
     * @param Inquiry - The inquiry
     */
    fun sendEmail(inquiry: Inquiry)
}