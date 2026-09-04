package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class e {
    static String a(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strD = d(j10);
        if (z10) {
            strD = String.format(context.getString(sb.k.Q), strD);
        }
        if (z11) {
            return String.format(context.getString(sb.k.P), strD);
        }
        return z12 ? String.format(context.getString(sb.k.I), strD) : strD;
    }

    static String b(long j10) {
        return c(j10, Locale.getDefault());
    }

    static String c(long j10, Locale locale) {
        return v.d(locale).format(new Date(j10));
    }

    static String d(long j10) {
        return i(j10) ? b(j10) : g(j10);
    }

    static String e(Context context, int i10) {
        return v.g().get(1) == i10 ? String.format(context.getString(sb.k.J), Integer.valueOf(i10)) : String.format(context.getString(sb.k.K), Integer.valueOf(i10));
    }

    static String f(long j10) {
        return v.k(Locale.getDefault()).format(new Date(j10));
    }

    static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    static String h(long j10, Locale locale) {
        return v.l(locale).format(new Date(j10));
    }

    private static boolean i(long j10) {
        Calendar calendarG = v.g();
        Calendar calendarI = v.i();
        calendarI.setTimeInMillis(j10);
        return calendarG.get(1) == calendarI.get(1);
    }
}
