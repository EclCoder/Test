package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f20015c = new u(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f20016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f20017b;

    private u(Long l10, TimeZone timeZone) {
        this.f20016a = l10;
        this.f20017b = timeZone;
    }

    static u c() {
        return f20015c;
    }

    Calendar a() {
        return b(this.f20017b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f20016a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
