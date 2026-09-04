package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Ph;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Kb f25498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ui f25499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f25500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f25501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f25502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f25504k;

    public Ph(Context context, double d10, Ib logLevel, long j10, int i10) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(logLevel, "logLevel");
        this.f25494a = context;
        this.f25495b = j10;
        this.f25496c = i10;
        this.f25497d = false;
        this.f25498e = new Kb(logLevel);
        this.f25499f = new Ui(d10);
        this.f25500g = Collections.synchronizedList(new ArrayList());
        this.f25501h = new ConcurrentHashMap();
        this.f25502i = new AtomicBoolean(false);
        this.f25503j = "";
        this.f25504k = new AtomicInteger(0);
    }

    public final void a(Ib logLevel, String tag, String message) throws JSONException {
        kotlin.jvm.internal.s.h(logLevel, "logLevel");
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(message, "message");
        if (this.f25502i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Lb.f25199a;
        kotlin.jvm.internal.s.h(logLevel, "logLevel");
        kotlin.jvm.internal.s.h(tag, "tag");
        kotlin.jvm.internal.s.h(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, Lb.f25199a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, message);
        em.o0 o0Var = AbstractC2834ac.f26174a;
        Zb.a(new Nh(this, logLevel, jSONObject, null));
    }

    public final void b() {
        Objects.toString(this.f25502i);
        if ((this.f25497d || this.f25499f.a()) && !this.f25502i.getAndSet(true)) {
            em.o0 o0Var = AbstractC2834ac.f26174a;
            Zb.a(new Mh(this, null));
        }
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f25501h) {
            try {
                for (Map.Entry entry : this.f25501h.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String string = jSONObject.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.f25500g;
        kotlin.jvm.internal.s.g(logData, "logData");
        synchronized (logData) {
            try {
                List logData2 = this.f25500g;
                kotlin.jvm.internal.s.g(logData2, "logData");
                Iterator it = logData2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONArray;
    }

    public final boolean e() throws JSONException {
        if (this.f25500g.isEmpty() || this.f25501h.isEmpty()) {
            return true;
        }
        String strC = c();
        kotlin.jvm.internal.s.h(strC, "<this>");
        return kotlin.jvm.internal.s.c(strC, "{}");
    }

    public final void b(boolean z10) {
        Objects.toString(this.f25502i);
        if (this.f25502i.get()) {
            return;
        }
        this.f25497d = z10;
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        Objects.toString(this.f25502i);
        if (this.f25502i.get()) {
            return;
        }
        this.f25501h.put(key, value);
    }

    public final void a() {
        Objects.toString(this.f25502i);
        if ((this.f25497d || this.f25499f.a()) && !this.f25502i.get()) {
            em.o0 o0Var = AbstractC2834ac.f26174a;
            Zb.a(new Lh(this, null));
        }
    }

    public final void a(final boolean z10) {
        Objects.toString(this.f25502i);
        em.o0 o0Var = AbstractC2834ac.f26174a;
        if (fl.r.e(Zb.a(new tl.a() { // from class: yh.r3
            @Override // tl.a
            public final Object invoke() {
                return Ph.a(this.f57902a, z10);
            }
        })) != null) {
            try {
                fl.r.b(fl.g0.f38750a);
            } catch (Throwable th2) {
                fl.r.a aVar = fl.r.f38769b;
                fl.r.b(fl.s.a(th2));
            }
        }
    }

    public static final fl.g0 a(Ph ph2, boolean z10) {
        if (ph2.e()) {
            return fl.g0.f38750a;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (ph2.f25503j.length() == 0) {
            em.o0 o0Var = AbstractC2834ac.f26174a;
            ph2.f25503j = Zb.a(ph2.f25494a, timeInMillis);
        }
        if (ph2.a(ph2.f25503j)) {
            em.j.b(null, new Oh(ph2, timeInMillis, z10, null), 1, null);
        }
        return fl.g0.f38750a;
    }

    public final boolean a(String str) {
        return AbstractC2860bc.a("RemoteLogger", c(), str);
    }
}
