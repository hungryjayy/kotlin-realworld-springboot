package back.model.dto

import back.model.User
import com.fasterxml.jackson.annotation.JsonRootName
import java.time.ZonedDateTime
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@JsonRootName("comment")
data class Comment(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val createdAt: ZonedDateTime = ZonedDateTime.now(),
    val updatedAt: ZonedDateTime = ZonedDateTime.now(),
    val body: String = "",
    val author: User
)
