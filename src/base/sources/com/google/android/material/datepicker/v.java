package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static AtomicReference f20018a = new AtomicReference();

    static long a(long j10) {
        Calendar calendarI = i();
        calendarI.setTimeInMillis(j10);
        return c(calendarI).getTimeInMillis();
    }

    private static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar c(Calendar calendar) {
        Calendar calendarJ = j(calendar);
        Calendar calendarI = i();
        calendarI.set(calendarJ.get(1), calendarJ.get(2), calendarJ.get(5));
        return calendarI;
    }

    static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static u e() {
        u uVar = (u) f20018a.get();
        return uVar == null ? u.c() : uVar;
    }

    private static TimeZone f() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    static Calendar g() {
        Calendar calendarA = e().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(f());
        return calendarA;
    }

    private static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        return j(null);
    }

    static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
