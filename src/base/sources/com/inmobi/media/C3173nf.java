package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.media.C3173nf;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.nf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3173nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3348u9 f27058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f27061e;

    public C3173nf(Context context, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(context, "context");
        this.f27057a = context;
        this.f27058b = c3348u9;
        this.f27059c = "";
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        this.f27061e = ((SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class)).getNovatiqConfig();
        b();
    }

    public final C3121lf a() {
        if (this.f27060d) {
            return new C3121lf(gl.l0.j(fl.w.a("n-h-id", this.f27059c)));
        }
        C3348u9 c3348u9 = this.f27058b;
        if (c3348u9 != null) {
            c3348u9.a("NovatiqDataHandler", "Novatiq disabled. skip");
        }
        return new C3121lf(gl.l0.h());
    }

    public final void b() {
        String networkOperatorName;
        Context context = this.f27057a;
        kotlin.jvm.internal.s.h(context, "context");
        if (this.f27061e.getIsNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
                networkOperatorName = "";
            }
            List<String> carrierNames = this.f27061e.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (bm.r.R(networkOperatorName, (String) it.next(), true)) {
                        try {
                            String strA = a(this.f27057a);
                            this.f27060d = true;
                            StringBuilder sb2 = new StringBuilder();
                            Random random = new Random();
                            for (int i10 = 0; i10 < 40; i10++) {
                                char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i10);
                                if (cCharAt == 'x') {
                                    sb2.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            String string = sb2.toString();
                            kotlin.jvm.internal.s.g(string, "toString(...)");
                            this.f27059c = string;
                            ((B9) Pe.f25486c.getValue()).a(new C3199of(this.f27061e, new C3147mf(string, strA), this.f27058b).a()).q(new Function1() { // from class: yh.w9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C3173nf.a(this.f57991a, (Throwable) obj);
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        C3348u9 c3348u9 = this.f27058b;
        if (c3348u9 != null) {
            c3348u9.a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }

    public static final fl.g0 a(C3173nf c3173nf, Throwable th2) {
        if (th2 == null) {
            C3348u9 c3348u9 = c3173nf.f27058b;
            if (c3348u9 != null) {
                c3348u9.a("NovatiqDataHandler", "Novatiq data sync successful");
            }
        } else {
            C3348u9 c3348u10 = c3173nf.f27058b;
            if (c3348u10 != null) {
                c3348u10.a("NovatiqDataHandler", "Error: " + th2);
            }
        }
        return fl.g0.f38750a;
    }

    public static String a(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        return bm.r.H(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString(), ' ', '_', false, 4, null) + "_app";
    }
}
