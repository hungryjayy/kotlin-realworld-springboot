package back.model.dto

import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("user")
data class Login(val email: String, val password: String)
