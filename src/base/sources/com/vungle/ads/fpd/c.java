package com.vungle.ads.fpd;

import fl.g0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.json.v;
import pm.k;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.v2;
import tm.z0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002<=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Bo\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0002\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0083D¢\u0006\f\n\u0004\b\u0007\u0010 \u0012\u0004\b!\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\t\u0010\"\u0012\u0004\b#\u0010\u0003R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000b\u0010$\u0012\u0004\b%\u0010\u0003R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\r\u0010&\u0012\u0004\b'\u0010\u0003R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010(\u0012\u0004\b)\u0010\u0003R*\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010*\u0012\u0004\b+\u0010\u0003R\u0011\u0010.\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00104\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00107\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00108F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/vungle/ads/fpd/c;", "", "<init>", "()V", "", "seen1", "", "modelVersion", "Lcom/vungle/ads/fpd/g;", "_sessionContext", "Lcom/vungle/ads/fpd/b;", "_demographic", "Lcom/vungle/ads/fpd/e;", "_location", "Lcom/vungle/ads/fpd/f;", "_revenue", "", "_customData", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/fpd/g;Lcom/vungle/ads/fpd/b;Lcom/vungle/ads/fpd/e;Lcom/vungle/ads/fpd/f;Ljava/util/Map;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/fpd/c;Lsm/d;Lrm/f;)V", "debug", "()Ljava/lang/String;", "clearAll", "Ljava/lang/String;", "getModelVersion$annotations", "Lcom/vungle/ads/fpd/g;", "get_sessionContext$annotations", "Lcom/vungle/ads/fpd/b;", "get_demographic$annotations", "Lcom/vungle/ads/fpd/e;", "get_location$annotations", "Lcom/vungle/ads/fpd/f;", "get_revenue$annotations", "Ljava/util/Map;", "get_customData$annotations", "getSessionContext", "()Lcom/vungle/ads/fpd/g;", "sessionContext", "getDemographic", "()Lcom/vungle/ads/fpd/b;", "demographic", "getLocation", "()Lcom/vungle/ads/fpd/e;", "location", "getRevenue", "()Lcom/vungle/ads/fpd/f;", "revenue", "getCustomData", "()Ljava/util/Map;", "customData", "Companion", "a", "c", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@k
public final class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final kotlinx.serialization.json.b JSON = v.b(null, b.INSTANCE, 1, null);
    private static final String MODEL_VERSION = "2.0";
    private Map<String, String> _customData;
    private volatile com.vungle.ads.fpd.b _demographic;
    private volatile e _location;
    private volatile f _revenue;
    private volatile g _sessionContext;
    private final String modelVersion;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.fpd.FirstPartyData", aVar, 6);
            g2Var.p("model_version", true);
            g2Var.p("session_context", true);
            g2Var.p("demographic", true);
            g2Var.p("location", true);
            g2Var.p("revenue", true);
            g2Var.p("custom_data", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            v2 v2Var = v2.f53598a;
            return new pm.d[]{v2Var, qm.a.t(g.a.INSTANCE), qm.a.t(com.vungle.ads.fpd.b.a.INSTANCE), qm.a.t(e.a.INSTANCE), qm.a.t(f.a.INSTANCE), qm.a.t(new z0(v2Var, v2Var))};
        }

        @Override // pm.c
        public c deserialize(sm.e decoder) {
            int i10;
            String str;
            Object objE;
            Object objE2;
            Object objE3;
            Object objE4;
            Object objE5;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            boolean z10 = true;
            String strH = null;
            if (cVarB.l()) {
                String strH2 = cVarB.H(descriptor2, 0);
                objE = cVarB.e(descriptor2, 1, g.a.INSTANCE, null);
                objE2 = cVarB.e(descriptor2, 2, com.vungle.ads.fpd.b.a.INSTANCE, null);
                objE3 = cVarB.e(descriptor2, 3, e.a.INSTANCE, null);
                objE4 = cVarB.e(descriptor2, 4, f.a.INSTANCE, null);
                v2 v2Var = v2.f53598a;
                objE5 = cVarB.e(descriptor2, 5, new z0(v2Var, v2Var), null);
                str = strH2;
                i10 = 63;
            } else {
                boolean z11 = true;
                int i11 = 0;
                Object objE6 = null;
                Object objE7 = null;
                Object objE8 = null;
                Object objE9 = null;
                Object objE10 = null;
                while (z11) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z11 = false;
                            z10 = z10;
                            break;
                        case 0:
                            strH = cVarB.H(descriptor2, 0);
                            i11 |= 1;
                            z10 = z10;
                            break;
                        case 1:
                            objE6 = cVarB.e(descriptor2, 1, g.a.INSTANCE, objE6);
                            i11 |= 2;
                            z10 = true;
                            break;
                        case 2:
                            objE7 = cVarB.e(descriptor2, 2, com.vungle.ads.fpd.b.a.INSTANCE, objE7);
                            i11 |= 4;
                            z10 = true;
                            break;
                        case 3:
                            objE8 = cVarB.e(descriptor2, 3, e.a.INSTANCE, objE8);
                            i11 |= 8;
                            z10 = true;
                            break;
                        case 4:
                            objE9 = cVarB.e(descriptor2, 4, f.a.INSTANCE, objE9);
                            i11 |= 16;
                            z10 = true;
                            break;
                        case 5:
                            v2 v2Var2 = v2.f53598a;
                            objE10 = cVarB.e(descriptor2, 5, new z0(v2Var2, v2Var2), objE10);
                            i11 |= 32;
                            z10 = true;
                            break;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = i11;
                str = strH;
                objE = objE6;
                objE2 = objE7;
                objE3 = objE8;
                objE4 = objE9;
                objE5 = objE10;
            }
            cVarB.d(descriptor2);
            return new c(i10, str, (g) objE, (com.vungle.ads.fpd.b) objE2, (e) objE3, (f) objE4, (Map) objE5, null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, c value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            c.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements Function1 {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((kotlinx.serialization.json.e) obj);
            return g0.f38750a;
        }

        public final void invoke(kotlinx.serialization.json.e Json) {
            s.h(Json, "$this$Json");
            Json.g(true);
            Json.e(false);
            Json.d(false);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.fpd.c$c, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pm.d serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }

    public c() {
        this.modelVersion = "2.0";
    }

    public static final void write$Self(c self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || !s.c(self.modelVersion, "2.0")) {
            output.F(serialDesc, 0, self.modelVersion);
        }
        if (output.k(serialDesc, 1) || self._sessionContext != null) {
            output.w(serialDesc, 1, g.a.INSTANCE, self._sessionContext);
        }
        if (output.k(serialDesc, 2) || self._demographic != null) {
            output.w(serialDesc, 2, com.vungle.ads.fpd.b.a.INSTANCE, self._demographic);
        }
        if (output.k(serialDesc, 3) || self._location != null) {
            output.w(serialDesc, 3, e.a.INSTANCE, self._location);
        }
        if (output.k(serialDesc, 4) || self._revenue != null) {
            output.w(serialDesc, 4, f.a.INSTANCE, self._revenue);
        }
        if (!output.k(serialDesc, 5) && self._customData == null) {
            return;
        }
        v2 v2Var = v2.f53598a;
        output.w(serialDesc, 5, new z0(v2Var, v2Var), self._customData);
    }

    public final synchronized void clearAll() {
        try {
            this._sessionContext = null;
            this._demographic = null;
            this._revenue = null;
            this._location = null;
            Map<String, String> map = this._customData;
            if (map != null) {
                map.clear();
            }
            this._customData = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String debug() {
        kotlinx.serialization.json.b bVar = JSON;
        pm.d dVarB = pm.t.b(bVar.a(), kotlin.jvm.internal.l0.k(c.class));
        s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return bVar.c(dVarB, this);
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    public final synchronized com.vungle.ads.fpd.b getDemographic() {
        com.vungle.ads.fpd.b bVar;
        bVar = this._demographic;
        if (bVar == null) {
            bVar = new com.vungle.ads.fpd.b();
            this._demographic = bVar;
        }
        return bVar;
    }

    public final synchronized e getLocation() {
        e eVar;
        eVar = this._location;
        if (eVar == null) {
            eVar = new e();
            this._location = eVar;
        }
        return eVar;
    }

    public final synchronized f getRevenue() {
        f fVar;
        fVar = this._revenue;
        if (fVar == null) {
            fVar = new f();
            this._revenue = fVar;
        }
        return fVar;
    }

    public final synchronized g getSessionContext() {
        g gVar;
        gVar = this._sessionContext;
        if (gVar == null) {
            gVar = new g();
            this._sessionContext = gVar;
        }
        return gVar;
    }

    public /* synthetic */ c(int i10, String str, g gVar, com.vungle.ads.fpd.b bVar, e eVar, f fVar, Map map, q2 q2Var) {
        this.modelVersion = (i10 & 1) == 0 ? "2.0" : str;
        if ((i10 & 2) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = gVar;
        }
        if ((i10 & 4) == 0) {
            this._demographic = null;
        } else {
            this._demographic = bVar;
        }
        if ((i10 & 8) == 0) {
            this._location = null;
        } else {
            this._location = eVar;
        }
        if ((i10 & 16) == 0) {
            this._revenue = null;
        } else {
            this._revenue = fVar;
        }
        if ((i10 & 32) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }

    private static /* synthetic */ void getModelVersion$annotations() {
    }

    private static /* synthetic */ void get_customData$annotations() {
    }

    private static /* synthetic */ void get_demographic$annotations() {
    }

    private static /* synthetic */ void get_location$annotations() {
    }

    private static /* synthetic */ void get_revenue$annotations() {
    }

    private static /* synthetic */ void get_sessionContext$annotations() {
    }
}
