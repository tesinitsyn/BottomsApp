package org.sinitsyn.bottomsapp.usecase.model;

import java.time.LocalDate;
import java.util.UUID;

public record User(UUID id, String name, String lastName, String email, LocalDate birthDate) {
}
