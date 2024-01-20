package com.david.EasyShift.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.TimeZone;

public class Dates {
    private static final DateTimeFormatter shortDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final TimeZone TIME_ZONE = TimeZone.getTimeZone("Asia/Jerusalem");
    private static final DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("yyyy/MM");

    private Dates() {
    }

    public static String getCurMonth() {
        return LocalDate.now().format(monthFormatter);
    }

    public static String dateToStr(LocalDate date) {
        return date == null ? null : date.format(shortDateFormatter);
    }

    public static LocalDateTime atUtc(LocalDateTime date) {
        return atUtc(date, TIME_ZONE);
    }

    public static LocalDateTime atUtc(LocalDateTime date, TimeZone zone) {
        return date == null ? null : date.atZone(zone.toZoneId()).withZoneSameInstant(TimeZone.getTimeZone("UTC").toZoneId()).toLocalDateTime();
    }

    public static LocalDateTime atLocalTime(OffsetDateTime dateTime) {
        return dateTime == null ? null : dateTime.atZoneSameInstant(TIME_ZONE.toZoneId()).toLocalDateTime();
    }

    public static OffsetDateTime atUtc(LocalDate date) {
        return date == null ? null : date.atStartOfDay().atOffset(OffsetDateTime.now().getOffset());
    }

    public static OffsetDateTime atUtc(LocalDate date, TimeZone zone) {
        return date == null ? null : date.atStartOfDay().atOffset(zone.toZoneId().getRules().getOffset(date.atStartOfDay()));
    }

    public static LocalDate atLocalDate(OffsetDateTime dateTime) {
        return dateTime == null ? null : dateTime.toLocalDate();
    }

    public static OffsetDateTime nowUTC() {
        return OffsetDateTime.now(ZoneOffset.UTC);
    }

    public static String getFullDateTime() {
        return OffsetDateTime.now(ZoneOffset.UTC).toString();
    }

    public static boolean equals(OffsetDateTime dateTime1, OffsetDateTime dateTime2) {
        return Objects.equals(dateTime1, dateTime2);
    }
}

