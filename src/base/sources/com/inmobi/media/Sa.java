package com.inmobi.media;

import com.google.android.gms.measurement.AppMeasurement;
import com.inmobi.media.J2;
import com.inmobi.media.Sa;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Sa implements Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CrashConfig f25681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3216p6 f25682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y9 f25683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f25684d;

    public Sa(CrashConfig crashConfig) {
        kotlin.jvm.internal.s.h(crashConfig, "crashConfig");
        this.f25681a = crashConfig;
        this.f25683c = new Y9(crashConfig);
        this.f25684d = new Function1() { // from class: yh.y3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Sa.a(this.f58017a, (J2) obj);
            }
        };
    }

    public static final fl.g0 a(Sa sa2, J2 it) {
        kotlin.jvm.internal.s.h(it, "it");
        int i10 = it.f25043a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case 150:
                case 151:
                case 152:
                    Map map = it.f25045c;
                    if (map != null && map.containsKey(DataSchemeDataSource.SCHEME_DATA)) {
                        Object obj = it.f25045c.get(DataSchemeDataSource.SCHEME_DATA);
                        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        X9 incident = (X9) obj;
                        sa2.getClass();
                        kotlin.jvm.internal.s.h(incident, "incident");
                        AbstractC3488zl.a(new Ra(sa2, incident, null));
                    }
                    break;
            }
        } else {
            C3216p6 c3216p6 = sa2.f25682b;
            if (c3216p6 != null) {
                c3216p6.f27173f.set(false);
                c3216p6.f27174g.set(true);
                em.z1 z1Var = c3216p6.f27177j;
                if (z1Var != null) {
                    em.z1.c0(z1Var, null, 1, null);
                }
                c3216p6.f27177j = null;
                c3216p6.f27176i = null;
            }
            sa2.f25682b = null;
            ((Fc) Xi.f26025e.getValue()).a(sa2.f25684d);
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r13.a(r15, (kotlin.coroutines.jvm.internal.d) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (r13 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.Sa r13, com.inmobi.media.X9 r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Sa.a(com.inmobi.media.Sa, com.inmobi.media.X9, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(Sa sa2, kotlin.coroutines.jvm.internal.d dVar) {
        Qa qa2;
        sa2.getClass();
        if (dVar instanceof Qa) {
            qa2 = (Qa) dVar;
            int i10 = qa2.f25548c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qa2.f25548c = i10 - Integer.MIN_VALUE;
            } else {
                qa2 = new Qa(sa2, dVar);
            }
        } else {
            qa2 = new Qa(sa2, dVar);
        }
        Object objA = qa2.f25546a;
        Object objF = ll.b.f();
        int i11 = qa2.f25548c;
        if (i11 == 0) {
            fl.s.b(objA);
            U9 u10 = (U9) W9.f25935a.getValue();
            qa2.f25548c = 1;
            objA = u10.a(qa2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        if (((Number) objA).intValue() > 0) {
            sa2.a();
        }
        return fl.g0.f38750a;
    }

    public final void a() {
        Sa sa2;
        C2983g6 eventConfig = this.f25681a.getEventConfig();
        eventConfig.f26593k = this.f25681a.getUrl();
        C3216p6 c3216p6 = this.f25682b;
        if (c3216p6 != null) {
            kotlin.jvm.internal.s.h(eventConfig, "eventConfig");
            c3216p6.f27176i = eventConfig;
            sa2 = this;
        } else {
            sa2 = this;
            sa2.f25682b = new C3216p6(AppMeasurement.CRASH_ORIGIN, (U9) W9.f25935a.getValue(), sa2, this.f25681a.getEventConfig(), null);
        }
        C3216p6 c3216p7 = sa2.f25682b;
        if (c3216p7 != null) {
            c3216p7.a(false);
        }
    }

    @Override // com.inmobi.media.Rf
    public final Object a(kl.f fVar) {
        int iA;
        String string;
        B5.f24500a.getClass();
        int iN = B5.n();
        int i10 = 1;
        if (iN == 0 || iN != 1) {
            iA = this.f25681a.getMobileConfig().a();
        } else {
            iA = this.f25681a.getWifiConfig().a();
        }
        List<X9> list = (List) em.j.b(null, new Ma(iA, null), 1, null);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.coroutines.jvm.internal.b.d(((X9) it.next()).f26770d));
            }
            try {
                HashMap map = new HashMap(B5.f24500a.a(false));
                map.put("im-accid", Xi.f26023c);
                map.put("version", "2.0.0");
                map.put("component", AppMeasurement.CRASH_ORIGIN);
                map.put("mk-version", Yi.a());
                map.putAll(A1.f24433e);
                map.put("tp", Yi.f26090b);
                String str = Yi.f26089a;
                if (str == null) {
                    str = "";
                }
                map.put("tpVer", str);
                JSONObject jSONObject = new JSONObject(map);
                JSONArray jSONArray = new JSONArray();
                for (X9 x10 : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", x10.f25997e);
                    jSONObject2.put("eventType", x10.f26767a);
                    String str2 = x10.f26768b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    int length = str2.length() - i10;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = kotlin.jvm.internal.s.i(str2.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (str2.subSequence(i11, length + 1).toString().length() > 0) {
                        String str3 = x10.f26768b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONObject2.put("crash_report", str3);
                    }
                    jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, x10.f26769c);
                    jSONArray.put(jSONObject2);
                    i10 = 1;
                }
                jSONObject.put(AppMeasurement.CRASH_ORIGIN, jSONArray);
                string = jSONObject.toString();
            } catch (JSONException unused) {
                string = null;
            }
            if (string != null) {
                return new C3035i6(string, arrayList);
            }
        }
        return null;
    }
}
