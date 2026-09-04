package com.google.api.client.util;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sc.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class DateTime implements Serializable {
    private static final long serialVersionUID = 1;
    private final boolean dateOnly;
    private final int tzShift;
    private final long value;
    private static final TimeZone GMT = DesugarTimeZone.getTimeZone("GMT");
    private static final String RFC3339_REGEX = "(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?";
    private static final Pattern RFC3339_PATTERN = Pattern.compile(RFC3339_REGEX);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class Rfc3339ParseResult implements Serializable {
        private final int nanos;
        private final long seconds;
        private final boolean timeGiven;
        private final Integer tzShift;

        /* JADX INFO: Access modifiers changed from: private */
        public DateTime toDateTime() {
            return new DateTime(!this.timeGiven, TimeUnit.SECONDS.toMillis(this.seconds) + TimeUnit.NANOSECONDS.toMillis(this.nanos), this.tzShift);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SecondsAndNanos toSecondsAndNanos() {
            return new SecondsAndNanos(this.seconds, this.nanos);
        }

        private Rfc3339ParseResult(long j10, int i10, boolean z10, Integer num) {
            this.seconds = j10;
            this.nanos = i10;
            this.timeGiven = z10;
            this.tzShift = num;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class SecondsAndNanos implements Serializable {
        private final int nanos;
        private final long seconds;

        public static SecondsAndNanos ofSecondsAndNanos(long j10, int i10) {
            return new SecondsAndNanos(j10, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SecondsAndNanos.class == obj.getClass()) {
                SecondsAndNanos secondsAndNanos = (SecondsAndNanos) obj;
                if (this.seconds == secondsAndNanos.seconds && this.nanos == secondsAndNanos.nanos) {
                    return true;
                }
            }
            return false;
        }

        public int getNanos() {
            return this.nanos;
        }

        public long getSeconds() {
            return this.seconds;
        }

        public int hashCode() {
            return java.util.Objects.hash(Long.valueOf(this.seconds), Integer.valueOf(this.nanos));
        }

        public String toString() {
            return String.format("Seconds: %d, Nanos: %d", Long.valueOf(this.seconds), Integer.valueOf(this.nanos));
        }

        private SecondsAndNanos(long j10, int i10) {
            this.seconds = j10;
            this.nanos = i10;
        }
    }

    public DateTime(Date date, TimeZone timeZone) {
        this(false, date.getTime(), timeZone == null ? null : Integer.valueOf(timeZone.getOffset(date.getTime()) / 60000));
    }

    private static void appendInt(StringBuilder sb2, int i10, int i11) {
        if (i10 < 0) {
            sb2.append('-');
            i10 = -i10;
        }
        int i12 = i10;
        while (i12 > 0) {
            i12 /= 10;
            i11--;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append('0');
        }
        if (i10 != 0) {
            sb2.append(i10);
        }
    }

    public static DateTime parseRfc3339(String str) {
        return parseRfc3339WithNanoSeconds(str).toDateTime();
    }

    public static SecondsAndNanos parseRfc3339ToSecondsAndNanos(String str) {
        return parseRfc3339WithNanoSeconds(str).toSecondsAndNanos();
    }

    private static Rfc3339ParseResult parseRfc3339WithNanoSeconds(String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        Integer numValueOf;
        Matcher matcher = RFC3339_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException("Invalid date/time format: " + str);
        }
        int i14 = Integer.parseInt(matcher.group(1));
        int i15 = Integer.parseInt(matcher.group(2)) - 1;
        int i16 = Integer.parseInt(matcher.group(3));
        boolean z10 = matcher.group(4) != null;
        String strGroup = matcher.group(9);
        boolean z11 = strGroup != null;
        if (z11 && !z10) {
            throw new NumberFormatException("Invalid date/time format, cannot specify time zone shift without specifying time: " + str);
        }
        if (z10) {
            int i17 = Integer.parseInt(matcher.group(5));
            i11 = Integer.parseInt(matcher.group(6));
            i12 = Integer.parseInt(matcher.group(7));
            i13 = matcher.group(8) != null ? Integer.parseInt(w.f(matcher.group(8).substring(1), 9, '0')) : 0;
            i10 = i17;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.clear();
        gregorianCalendar.set(i14, i15, i16, i10, i11, i12);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (!z10 || !z11) {
            numValueOf = null;
        } else if (Character.toUpperCase(strGroup.charAt(0)) != 'Z') {
            int i18 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
            if (matcher.group(10).charAt(0) == '-') {
                i18 = -i18;
            }
            timeInMillis -= ((long) i18) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            numValueOf = Integer.valueOf(i18);
        } else {
            numValueOf = 0;
        }
        return new Rfc3339ParseResult(timeInMillis / 1000, i13, z10, numValueOf);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateTime)) {
            return false;
        }
        DateTime dateTime = (DateTime) obj;
        return this.dateOnly == dateTime.dateOnly && this.value == dateTime.value && this.tzShift == dateTime.tzShift;
    }

    public int getTimeZoneShift() {
        return this.tzShift;
    }

    public long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(new long[]{this.value, this.dateOnly ? 1L : 0L, this.tzShift});
    }

    public boolean isDateOnly() {
        return this.dateOnly;
    }

    public String toString() {
        return toStringRfc3339();
    }

    public String toStringRfc3339() {
        StringBuilder sb2 = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.setTimeInMillis(this.value + (((long) this.tzShift) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS));
        appendInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        appendInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        appendInt(sb2, gregorianCalendar.get(5), 2);
        if (!this.dateOnly) {
            sb2.append('T');
            appendInt(sb2, gregorianCalendar.get(11), 2);
            sb2.append(':');
            appendInt(sb2, gregorianCalendar.get(12), 2);
            sb2.append(':');
            appendInt(sb2, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb2.append('.');
                appendInt(sb2, gregorianCalendar.get(14), 3);
            }
            int i10 = this.tzShift;
            if (i10 == 0) {
                sb2.append('Z');
            } else {
                if (i10 > 0) {
                    sb2.append('+');
                } else {
                    sb2.append('-');
                    i10 = -i10;
                }
                appendInt(sb2, i10 / 60, 2);
                sb2.append(':');
                appendInt(sb2, i10 % 60, 2);
            }
        }
        return sb2.toString();
    }

    public DateTime(long j10) {
        this(false, j10, null);
    }

    public DateTime(Date date) {
        this(date.getTime());
    }

    public DateTime(long j10, int i10) {
        this(false, j10, Integer.valueOf(i10));
    }

    public DateTime(boolean z10, long j10, Integer num) {
        int offset;
        this.dateOnly = z10;
        this.value = j10;
        if (z10) {
            offset = 0;
        } else {
            offset = num == null ? TimeZone.getDefault().getOffset(j10) / 60000 : num.intValue();
        }
        this.tzShift = offset;
    }

    public DateTime(String str) {
        DateTime rfc3339 = parseRfc3339(str);
        this.dateOnly = rfc3339.dateOnly;
        this.value = rfc3339.value;
        this.tzShift = rfc3339.tzShift;
    }
}
