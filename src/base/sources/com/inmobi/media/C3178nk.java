package com.inmobi.media;

import com.inmobi.media.C3178nk;
import com.inmobi.media.J2;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import o4.Wz.OGoz;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3178nk implements Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3178nk f27064a = new C3178nk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nm.a f27065b = nm.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f27067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fl.k f27068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f27069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C3216p6 f27070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Ak f27071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Function1 f27072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static C3411wk f27073j;

    static {
        String simpleName = C3178nk.class.getSimpleName();
        kotlin.jvm.internal.s.g(simpleName, "getSimpleName(...)");
        f27066c = simpleName;
        List listQ = gl.r.q("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed", "HtmlUrlPrefetchStarted", "HtmlUrlPrefetchCompleted", "InAppBrowserLoaderShown", "InAppBrowserLoaderHidden");
        f27067d = listQ;
        f27068e = fl.l.b(new tl.a() { // from class: yh.x9
            @Override // tl.a
            public final Object invoke() {
                return C3178nk.c();
            }
        });
        f27069f = new AtomicBoolean(false);
        C3152mk c3152mk = new C3152mk();
        f27072i = new Function1() { // from class: yh.y9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3178nk.a((J2) obj);
            }
        };
        TelemetryConfig telemetryConfigB = b();
        f27071h = new Ak(new C3230pk(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetReporting().isImageEnabled(), telemetryConfigB.getAssetReporting().isGifEnabled(), telemetryConfigB.getAssetReporting().isVideoEnabled(), telemetryConfigB.getDisableAllGeneralEvents(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), gl.r.I0(listQ));
        AbstractC2878c4.a("telemetry", c3152mk);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final fl.g0 a(J2 it) {
        kotlin.jvm.internal.s.h(it, "it");
        int i10 = it.f25043a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case 150:
                    C3411wk c3411wk = f27073j;
                    if (c3411wk != null) {
                        Map map = it.f25045c;
                        Object obj = map != null ? map.get(DataSchemeDataSource.SCHEME_DATA) : null;
                        c3411wk.a("CrashEventOccurred", obj instanceof X4 ? (X4) obj : null);
                    }
                    break;
                case 151:
                    C3411wk c3411wk2 = f27073j;
                    if (c3411wk2 != null) {
                        Map map2 = it.f25045c;
                        Object obj2 = map2 != null ? map2.get(DataSchemeDataSource.SCHEME_DATA) : null;
                        C3208oo c3208oo = obj2 instanceof C3208oo ? (C3208oo) obj2 : null;
                        if (c3208oo != null && AbstractC3488zl.a(c3208oo)) {
                            B5.f24500a.getClass();
                            if (!B5.t()) {
                                c3411wk2.a("MainThreadBlockedEvent", c3208oo);
                            }
                        }
                    }
                    break;
                case 152:
                    C3411wk c3411wk3 = f27073j;
                    if (c3411wk3 != null) {
                        Map map3 = it.f25045c;
                        Object obj3 = map3 != null ? map3.get(DataSchemeDataSource.SCHEME_DATA) : null;
                        c3411wk3.a(obj3 instanceof C3468z1 ? (C3468z1) obj3 : null);
                    }
                    break;
            }
        } else {
            f27069f.set(false);
            C3216p6 c3216p6 = f27070g;
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
            f27070g = null;
            f27073j = null;
            ((Fc) Xi.f26025e.getValue()).a(f27072i);
        }
        return fl.g0.f38750a;
    }

    public static final void b(String eventType, Map keyValueMap, EnumC3281rk telemetryEventType) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        kotlin.jvm.internal.s.h(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.s.h(telemetryEventType, "telemetryEventType");
        em.k.d(H9.f24930c, null, null, new C3126lk(eventType, keyValueMap, telemetryEventType, null), 3, null);
    }

    public static final C3359uk c() {
        return new C3359uk(AbstractC3193o9.b());
    }

    public static TelemetryConfig b() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        return (TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(kotlin.coroutines.jvm.internal.d dVar) {
        C3100kk c3100kk;
        if (dVar instanceof C3100kk) {
            c3100kk = (C3100kk) dVar;
            int i10 = c3100kk.f26865b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3100kk.f26865b = i10 - Integer.MIN_VALUE;
            } else {
                c3100kk = new C3100kk(dVar);
            }
        } else {
            c3100kk = new C3100kk(dVar);
        }
        Object obj = c3100kk.f26864a;
        Object objF = ll.b.f();
        int i11 = c3100kk.f26865b;
        if (i11 == 0) {
            fl.s.b(obj);
            if (!f27069f.getAndSet(true)) {
                C3178nk c3178nk = f27064a;
                c3100kk.f26865b = 1;
                if (c3178nk.a((kotlin.coroutines.jvm.internal.d) c3100kk) == objF) {
                    return objF;
                }
            }
            return fl.g0.f38750a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fl.s.b(obj);
        ((Fc) Xi.f26025e.getValue()).a(new int[]{2, 1, 150, 152, 151}, f27072i);
        f27073j = new C3411wk(b());
        return fl.g0.f38750a;
    }

    public static boolean a(String eventType, Map map, EnumC3281rk telemetryEventType) {
        boolean zA;
        Ak ak2 = f27071h;
        if (ak2 == null) {
            kotlin.jvm.internal.s.w("mTelemetryValidator");
            ak2 = null;
        }
        ak2.getClass();
        kotlin.jvm.internal.s.h(telemetryEventType, "telemetryEventType");
        kotlin.jvm.internal.s.h(map, OGoz.czo);
        kotlin.jvm.internal.s.h(eventType, "eventType");
        if (ak2.f24483a.f27271a) {
            int iOrdinal = telemetryEventType.ordinal();
            if (iOrdinal == 0) {
                zA = ak2.f24484b.a(eventType, map);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                zA = true;
            }
        } else {
            zA = false;
        }
        return !zA;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r9.a(r8, (kotlin.coroutines.jvm.internal.d) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3385vk r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3178nk.a(com.inmobi.media.vk, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a() {
        if (f27069f.get()) {
            C2983g6 eventConfig = b().getEventConfig();
            eventConfig.f26593k = b().getTelemetryUrl();
            C3216p6 c3216p6 = f27070g;
            if (c3216p6 == null) {
                f27070g = new C3216p6("telemetry", (C3359uk) f27068e.getValue(), this, eventConfig, this);
            } else {
                kotlin.jvm.internal.s.h(eventConfig, "eventConfig");
                c3216p6.f27176i = eventConfig;
            }
            C3216p6 c3216p7 = f27070g;
            if (c3216p7 != null) {
                c3216p7.a(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        C3023hk c3023hk;
        if (dVar instanceof C3023hk) {
            c3023hk = (C3023hk) dVar;
            int i10 = c3023hk.f26698c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3023hk.f26698c = i10 - Integer.MIN_VALUE;
            } else {
                c3023hk = new C3023hk(this, dVar);
            }
        } else {
            c3023hk = new C3023hk(this, dVar);
        }
        Object objA = c3023hk.f26696a;
        Object objF = ll.b.f();
        int i11 = c3023hk.f26698c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3359uk c3359uk = (C3359uk) f27068e.getValue();
            c3023hk.f26698c = 1;
            objA = c3359uk.a(c3023hk);
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
            a();
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.Rf
    public final Object a(kl.f fVar) {
        C3048ik c3048ik;
        int iA;
        String string;
        if (fVar instanceof C3048ik) {
            c3048ik = (C3048ik) fVar;
            int i10 = c3048ik.f26756c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3048ik.f26756c = i10 - Integer.MIN_VALUE;
            } else {
                c3048ik = new C3048ik(this, (kotlin.coroutines.jvm.internal.d) fVar);
            }
        } else {
            c3048ik = new C3048ik(this, (kotlin.coroutines.jvm.internal.d) fVar);
        }
        Object objB = c3048ik.f26754a;
        Object objF = ll.b.f();
        int i11 = c3048ik.f26756c;
        if (i11 == 0) {
            fl.s.b(objB);
            B5.f24500a.getClass();
            if (B5.n() == 1) {
                iA = b().getWifiConfig().a();
            } else {
                iA = b().getMobileConfig().a();
            }
            C3359uk c3359uk = (C3359uk) f27068e.getValue();
            c3048ik.f26756c = 1;
            objB = c3359uk.b(iA, c3048ik);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objB);
        }
        List<C3385vk> listL0 = gl.r.L0((Collection) objB);
        if (!a("DatabaseMaxLimitReachedV2", gl.l0.h(), EnumC3281rk.SDK) && AbstractC3307sk.a() > 0) {
            AbstractC3307sk.a();
            int iA2 = AbstractC3307sk.a();
            C3385vk c3385vk = new C3385vk("DatabaseMaxLimitReachedV2", null, "sdk");
            String string2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.g(string2, "toString(...)");
            HashMap mapJ = gl.l0.j(fl.w.a("eventId", string2), fl.w.a("eventType", "DatabaseMaxLimitReachedV2"), fl.w.a("samplingRate", 100), fl.w.a("isTemplateEvent", Boolean.FALSE), fl.w.a("eventLostCount", Integer.valueOf(iA2)));
            kotlin.jvm.internal.s.f(mapJ, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String payload = new JSONObject(mapJ).toString();
            kotlin.jvm.internal.s.g(payload, "toString(...)");
            kotlin.jvm.internal.s.h(payload, "payload");
            c3385vk.f26768b = payload;
            AbstractC3307sk.f27478c = kotlin.coroutines.jvm.internal.b.d(c3385vk.f26770d);
            listL0.add(c3385vk);
        }
        if (listL0.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.coroutines.jvm.internal.b.d(((C3385vk) it.next()).f26770d));
        }
        try {
            String str = Xi.f26023c;
            if (str == null) {
                str = "";
            }
            Map mapM = gl.l0.m(fl.w.a("im-accid", str), fl.w.a("version", "4.0.0"), fl.w.a("mk-version", Yi.a()), fl.w.a("u-appbid", A1.f24429a), fl.w.a("tp", Yi.f26090b));
            String str2 = Yi.f26089a;
            if (str2 != null) {
                mapM.put("tp-v", str2);
            }
            kotlin.jvm.internal.s.f(mapM, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            JSONObject jSONObject = new JSONObject(mapM);
            JSONArray jSONArray = new JSONArray();
            for (C3385vk c3385vk2 : listL0) {
                String str3 = c3385vk2.f26768b;
                if (str3 == null) {
                    str3 = "";
                }
                if (bm.r.V0(str3).toString().length() > 0) {
                    String str4 = c3385vk2.f26768b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    JSONObject jSONObject2 = new JSONObject(str4);
                    jSONObject2.put("dts", c3385vk2.f26769c);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("payload", jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        if (string != null) {
            return new C3035i6(string, arrayList);
        }
        return null;
    }
}
