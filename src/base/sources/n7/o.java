package n7;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.o0;
import com.facebook.internal.r0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f46913a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f46914b = o.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long[] f46915c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private o() {
    }

    public static final int a(long j10) {
        if (x7.a.c(o.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = f46915c;
                if (i10 >= jArr.length || jArr[i10] >= j10) {
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                x7.a.b(th2, o.class);
                return 0;
            }
        }
        return i10;
    }

    public static final void b(String activityName, p pVar, String str, Context context) {
        String string;
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            s.h(activityName, "activityName");
            s.h(context, "context");
            if (pVar == null || (string = pVar.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            o0.a aVar = o0.f14970b;
            o0 o0VarB = aVar.b(activityName, str, null);
            o0VarB.d("fb_mobile_activate_app", bundle);
            if (aVar.d() != com.facebook.appevents.o.b.EXPLICIT_ONLY) {
                o0VarB.a();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }

    private final void c() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            r0.a aVar = r0.f15352e;
            com.facebook.r0 r0Var = com.facebook.r0.APP_EVENTS;
            String str = f46914b;
            s.e(str);
            aVar.b(r0Var, str, "Clock skew detected");
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public static final void d(String activityName, n nVar, String str) {
        long jLongValue;
        String string;
        if (x7.a.c(o.class)) {
            return;
        }
        try {
            s.h(activityName, "activityName");
            if (nVar == null) {
                return;
            }
            Long lB = nVar.b();
            if (lB != null) {
                jLongValue = lB.longValue();
            } else {
                Long lE = nVar.e();
                jLongValue = 0 - (lE != null ? lE.longValue() : 0L);
            }
            if (jLongValue < 0) {
                f46913a.c();
                jLongValue = 0;
            }
            long jF = nVar.f();
            if (jF < 0) {
                f46913a.c();
                jF = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", nVar.c());
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str2 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(a(jLongValue))}, 1));
            s.g(str2, "format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str2);
            p pVarG = nVar.g();
            if (pVarG == null || (string = pVarG.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long lE2 = nVar.e();
            bundle.putLong("_logTime", (lE2 != null ? lE2.longValue() : 0L) / ((long) 1000));
            o0.f14970b.b(activityName, str, null).c("fb_mobile_deactivate_app", jF / 1000, bundle);
        } catch (Throwable th2) {
            x7.a.b(th2, o.class);
        }
    }
}
