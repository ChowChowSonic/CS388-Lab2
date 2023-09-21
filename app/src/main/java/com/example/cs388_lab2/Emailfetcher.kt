package com.example.cs388_lab2

class EmailFetcher {
    companion object {
        val senders = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val title = "Welcome to Kotlin!"
        val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."
        fun getEmails(): MutableList<email> {
            var emails : MutableList<email> = ArrayList()
            for (i in 0..9) {
                val email = email(senders[i], title, summary)
                emails.add(email)
            }
            return emails
        }

        fun getNext5Emails(): MutableList<email> {
            var newEmails : MutableList<email> = ArrayList()
            for (i in 10..14) {
                val email = email(senders[i], title, summary)
                newEmails.add(email)
            }
            return newEmails
        }
    }
}