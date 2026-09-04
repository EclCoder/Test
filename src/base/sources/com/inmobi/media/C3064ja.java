package com.inmobi.media;

import c1.pGX.geAgcEazw;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.inmobi.media.C3064ja;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3064ja implements InterfaceC2987ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2910da f26798a;

    public C3064ja(C2910da incompleteLogData) {
        kotlin.jvm.internal.s.h(incompleteLogData, "incompleteLogData");
        this.f26798a = incompleteLogData;
    }

    public final void a(String message) {
        kotlin.jvm.internal.s.h("IncompleteLogFinalizer", "tag");
        kotlin.jvm.internal.s.h(message, "message");
        try {
            JSONArray jSONArray = this.f26798a.f26401b;
            Ib logLevel = Ib.ERROR;
            SimpleDateFormat simpleDateFormat = Lb.f25199a;
            kotlin.jvm.internal.s.h(logLevel, "logLevel");
            kotlin.jvm.internal.s.h("IncompleteLogFinalizer", "tag");
            kotlin.jvm.internal.s.h(message, "message");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, Lb.f25199a.format(new Date()));
            jSONObject.put("tag", "IncompleteLogFinalizer");
            jSONObject.put(Lykgign.euI, message);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void b(String value) {
        kotlin.jvm.internal.s.h("IncompleteLogFinalizer", "tag");
        kotlin.jvm.internal.s.h("exitReason", "key");
        kotlin.jvm.internal.s.h(value, "value");
        try {
            this.f26798a.f26400a.put("exitReason", value);
        } catch (Exception unused) {
        }
    }

    public final Object b() {
        String str = geAgcEazw.Biy;
        final String str2 = "IncompleteLogFinalizer";
        kotlin.jvm.internal.s.h("IncompleteLogFinalizer", "tag");
        try {
            fl.r.a aVar = fl.r.f38769b;
            JSONObject jSONObject = this.f26798a.f26400a;
            kotlin.jvm.internal.s.h(jSONObject, str);
            if (!kotlin.jvm.internal.s.c(jSONObject.toString(), "{}")) {
                JSONArray jSONArray = this.f26798a.f26401b;
                kotlin.jvm.internal.s.h(jSONArray, str);
                if (jSONArray.length() != 0) {
                    em.o0 o0Var = AbstractC2834ac.f26174a;
                    Zb.a(new tl.a() { // from class: yh.z8
                        @Override // tl.a
                        public final Object invoke() {
                            return C3064ja.a(this.f58044a, str2);
                        }
                    });
                }
            }
            return fl.r.b(fl.g0.f38750a);
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            return fl.r.b(fl.s.a(th2));
        }
    }

    public static final fl.g0 a(C3064ja c3064ja, String str) throws JSONException {
        C2910da c2910da = c3064ja.f26798a;
        JSONObject jSONObject = c2910da.f26400a;
        JSONArray jSONArray = c2910da.f26401b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String string = jSONObject2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        AbstractC2860bc.a(str, string, c3064ja.f26798a.f26402c.f27931a);
        String str2 = c3064ja.f26798a.f26402c.f27931a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C3453yb c3453yb = c3064ja.f26798a.f26402c;
        em.j.b(null, new C3039ia(new C3453yb(str2, timeInMillis, 0, c3453yb.f27934d, true, c3453yb.f27936f), null), 1, null);
        return fl.g0.f38750a;
    }

    public final Object a() {
        try {
            fl.r.a aVar = fl.r.f38769b;
            em.o0 o0Var = AbstractC2834ac.f26174a;
            return fl.r.b(fl.r.a(Zb.a(new tl.a() { // from class: yh.a9
                @Override // tl.a
                public final Object invoke() {
                    return C3064ja.a(this.f57604a);
                }
            })));
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            return fl.r.b(fl.s.a(th2));
        }
    }

    public static final fl.g0 a(C3064ja c3064ja) {
        AbstractC2860bc.a(c3064ja.f26798a.f26402c.f27931a);
        em.j.b(null, new C3013ha(c3064ja, null), 1, null);
        return fl.g0.f38750a;
    }
}
