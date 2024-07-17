package org.stackoverflow.user.dto;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;
import org.stackoverflow.user.util.UserRole;

public record SignUpDTO(
        @NotNull
        String login,

        @NotNull
        String password,

        @NonNull
        UserRole role) {
}
