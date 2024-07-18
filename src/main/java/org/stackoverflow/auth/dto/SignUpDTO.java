package org.stackoverflow.auth.dto;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;
import org.stackoverflow.auth.util.UserRole;

public record SignUpDTO(
        @NotNull
        String login,

        @NotNull
        String password,

        @NonNull
        UserRole role) {
}
