package com.skyrim.fcmNotification.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ErrorDetails {
    LocalDateTime timestamp;
    String message;
    String details;


}
