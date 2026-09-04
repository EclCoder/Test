package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ao f24492a = new Ao();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3428xb f24493b = new C3428xb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3337to f24494c;

    static {
        Context context = Xi.f26021a;
        f24494c = context != null ? new C3337to(context, a()) : null;
    }

    public static AdConfig.WebAssetCacheConfig a() {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getWebAssetCache();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ce A[Catch: Exception -> 0x01ec, TimeoutCancellationException -> 0x01f1, PHI: r0 r2 r6 r10 r13 r14 r18 r19
      0x01ce: PHI (r0v31 java.lang.Object) = (r0v25 java.lang.Object), (r0v1 java.lang.Object) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r2v7 com.inmobi.media.t9) = (r2v1 com.inmobi.media.t9), (r2v16 com.inmobi.media.t9) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r6v8 java.lang.String) = (r6v7 java.lang.String), (r6v11 java.lang.String) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r10v8 java.util.Map) = (r10v2 java.util.Map), (r10v19 java.util.Map) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r13v12 java.lang.String) = (r13v9 java.lang.String), (r13v21 java.lang.String) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r14v7 long) = (r14v1 long), (r14v15 long) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r18v6 java.lang.String) = (r18v2 java.lang.String), (r18v7 java.lang.String) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r19v15 java.lang.Object) = (r19v9 java.lang.Object), (r19v18 java.lang.Object) binds: [B:99:0x01cb, B:25:0x007a] A[DONT_GENERATE, DONT_INLINE], TryCatch #18 {TimeoutCancellationException -> 0x01f1, Exception -> 0x01ec, blocks: (B:101:0x01ce, B:103:0x01d2, B:98:0x01a2), top: B:166:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01d2 A[Catch: Exception -> 0x01ec, TimeoutCancellationException -> 0x01f1, TRY_LEAVE, TryCatch #18 {TimeoutCancellationException -> 0x01f1, Exception -> 0x01ec, blocks: (B:101:0x01ce, B:103:0x01d2, B:98:0x01a2), top: B:166:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0212 A[Catch: TimeoutCancellationException -> 0x0242, Exception -> 0x0247, TryCatch #6 {TimeoutCancellationException -> 0x0242, blocks: (B:116:0x0212, B:118:0x0218, B:121:0x022a, B:126:0x0249, B:129:0x0292, B:131:0x02b5, B:105:0x01e8, B:111:0x01f7, B:96:0x0195), top: B:154:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0292 A[Catch: TimeoutCancellationException -> 0x0242, Exception -> 0x0247, TryCatch #6 {TimeoutCancellationException -> 0x0242, blocks: (B:116:0x0212, B:118:0x0218, B:121:0x022a, B:126:0x0249, B:129:0x0292, B:131:0x02b5, B:105:0x01e8, B:111:0x01f7, B:96:0x0195), top: B:154:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01d2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x0292, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:142:0x02d2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x02f8, please report this as an issue */
    public final Object a(String str, InterfaceC3322t9 interfaceC3322t9, kotlin.coroutines.jvm.internal.d dVar) throws Throwable {
        xo xoVar;
        Map linkedHashMap;
        long jCurrentTimeMillis;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        String str4;
        String str5;
        Ve ve2;
        C3428xb c3428xb;
        Ve ve3;
        long j10;
        InterfaceC3322t9 interfaceC3322t10;
        InterfaceC3322t9 interfaceC3322t11;
        InterfaceC3322t9 interfaceC3322t12 = interfaceC3322t9;
        if (dVar instanceof xo) {
            xoVar = (xo) dVar;
            int i10 = xoVar.f27889i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xoVar.f27889i = i10 - Integer.MIN_VALUE;
            } else {
                xoVar = new xo(this, dVar);
            }
        } else {
            xoVar = new xo(this, dVar);
        }
        Object objA = xoVar.f27887g;
        Object objF = ll.b.f();
        int i11 = xoVar.f27889i;
        if (i11 == 0) {
            fl.s.b(objA);
            C3337to c3337to = f24494c;
            if (c3337to == null || c3337to.f27578a == null) {
                if (interfaceC3322t12 == null) {
                    return null;
                }
                ((C3348u9) interfaceC3322t12).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + c3337to + " for URL: " + str);
                return null;
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                String mimeTypeFromExtension = J3.a(fileExtensionFromUrl) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
                String str6 = (mimeTypeFromExtension == null || mimeTypeFromExtension.length() == 0) ? "text/html" : mimeTypeFromExtension;
                if (interfaceC3322t12 != null) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        str4 = "WebResourceHandler";
                        try {
                            try {
                                sb2.append("mimeType is ");
                                sb2.append(str6);
                                sb2.append(" for ");
                                sb2.append(str);
                                try {
                                    obj2 = "errorCode";
                                    str2 = str4;
                                    try {
                                        try {
                                            ((C3348u9) interfaceC3322t12).a(str2, sb2.toString());
                                        } catch (TimeoutCancellationException e10) {
                                            e = e10;
                                            obj = obj2;
                                            str3 = str;
                                            linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2193));
                                            if (interfaceC3322t12 != null) {
                                                ((C3348u9) interfaceC3322t12).a(str2, "Timeout occurred for url: " + str3, e);
                                            }
                                            linkedHashMap.put("networkType", B5.o());
                                            linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                                            C3178nk c3178nk = C3178nk.f27064a;
                                            C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                                            return null;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        obj = obj2;
                                        linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                                        if (interfaceC3322t12 != null) {
                                            ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                                        }
                                        linkedHashMap.put("networkType", B5.o());
                                        linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                                        C3178nk c3178nk2 = C3178nk.f27064a;
                                        C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                                        return null;
                                    }
                                } catch (TimeoutCancellationException e12) {
                                    e = e12;
                                    obj2 = "errorCode";
                                    str2 = str4;
                                }
                            } catch (TimeoutCancellationException e13) {
                                e = e13;
                                obj2 = "errorCode";
                                str2 = str4;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            obj2 = "errorCode";
                            str2 = str4;
                            obj = obj2;
                            linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                            if (interfaceC3322t12 != null) {
                                ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                            }
                            linkedHashMap.put("networkType", B5.o());
                            linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                            C3178nk c3178nk3 = C3178nk.f27064a;
                            C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                            return null;
                        }
                    } catch (TimeoutCancellationException e15) {
                        e = e15;
                        obj2 = "errorCode";
                        str2 = "WebResourceHandler";
                    } catch (Exception e16) {
                        e = e16;
                        obj2 = "errorCode";
                        str2 = "WebResourceHandler";
                    }
                } else {
                    obj2 = "errorCode";
                    str2 = "WebResourceHandler";
                }
                try {
                    InputStream inputStreamA = c3337to.a(str, interfaceC3322t12);
                    if (inputStreamA != null) {
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).a(str2, "Found in cache: " + str);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("url", str);
                        C3178nk c3178nk4 = C3178nk.f27064a;
                        C3178nk.b("ResourceCacheHit", linkedHashMap2, EnumC3281rk.SDK);
                        return J3.a(inputStreamA, str6);
                    }
                    C3428xb c3428xb2 = f24493b;
                    yo yoVar = new yo(str, interfaceC3322t12, null);
                    xoVar.f27881a = str;
                    xoVar.f27882b = interfaceC3322t12;
                    xoVar.f27883c = linkedHashMap;
                    xoVar.f27884d = str6;
                    xoVar.f27886f = jCurrentTimeMillis;
                    xoVar.f27889i = 1;
                    objA = c3428xb2.a(str, yoVar, xoVar);
                    if (objA != objF) {
                        str3 = str;
                        str5 = str6;
                        em.v0 v0Var = (em.v0) objA;
                        str4 = str2;
                        long jMax = ((long) Math.max(1, a().getMaxRetries())) * ((long) a().getTimeout());
                        zo zoVar = new zo(interfaceC3322t12, str3, v0Var, null);
                        xoVar.f27881a = str3;
                        xoVar.f27882b = interfaceC3322t12;
                        xoVar.f27883c = linkedHashMap;
                        xoVar.f27884d = str5;
                        xoVar.f27886f = jCurrentTimeMillis;
                        xoVar.f27889i = 2;
                        objA = em.z2.c(jMax, zoVar, xoVar);
                        if (objA == objF) {
                            ve2 = (Ve) objA;
                            if (interfaceC3322t12 != null) {
                                str2 = str4;
                                ((C3348u9) interfaceC3322t12).c(str2, "Response received for url: " + str3);
                            } else {
                                str2 = str4;
                            }
                            c3428xb = f24493b;
                            xoVar.f27881a = str3;
                            xoVar.f27882b = interfaceC3322t12;
                            xoVar.f27883c = linkedHashMap;
                            xoVar.f27884d = str5;
                            xoVar.f27885e = ve2;
                            xoVar.f27886f = jCurrentTimeMillis;
                            xoVar.f27889i = 3;
                            if (c3428xb.a(str3, xoVar) != objF) {
                                ve3 = ve2;
                                if (ve3 == null) {
                                }
                                if (interfaceC3322t12 != null) {
                                    ((C3348u9) interfaceC3322t12).b(str2, "onFailedResponse: " + str3 + " " + ve3);
                                }
                                obj = obj2;
                                linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2194));
                            }
                        }
                    }
                    return objF;
                } catch (TimeoutCancellationException e17) {
                    e = e17;
                    obj = obj2;
                    str3 = str;
                }
            } catch (TimeoutCancellationException e18) {
                e = e18;
                obj = "errorCode";
                str2 = "WebResourceHandler";
            } catch (Exception e19) {
                e = e19;
                obj = "errorCode";
                str2 = "WebResourceHandler";
                linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                if (interfaceC3322t12 != null) {
                    ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                }
                linkedHashMap.put("networkType", B5.o());
                linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                C3178nk c3178nk5 = C3178nk.f27064a;
                C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                return null;
            }
        } else if (i11 == 1) {
            j10 = xoVar.f27886f;
            str5 = xoVar.f27884d;
            linkedHashMap = xoVar.f27883c;
            interfaceC3322t10 = xoVar.f27882b;
            str3 = xoVar.f27881a;
            try {
                fl.s.b(objA);
                obj2 = "errorCode";
                str2 = "WebResourceHandler";
                jCurrentTimeMillis = j10;
                interfaceC3322t12 = interfaceC3322t10;
                try {
                    em.v0 v0Var2 = (em.v0) objA;
                    str4 = str2;
                    try {
                        long jMax2 = ((long) Math.max(1, a().getMaxRetries())) * ((long) a().getTimeout());
                        zo zoVar2 = new zo(interfaceC3322t12, str3, v0Var2, null);
                        xoVar.f27881a = str3;
                        xoVar.f27882b = interfaceC3322t12;
                        xoVar.f27883c = linkedHashMap;
                        xoVar.f27884d = str5;
                        xoVar.f27886f = jCurrentTimeMillis;
                        xoVar.f27889i = 2;
                        objA = em.z2.c(jMax2, zoVar2, xoVar);
                        if (objA == objF) {
                            ve2 = (Ve) objA;
                            if (interfaceC3322t12 != null) {
                                str2 = str4;
                                ((C3348u9) interfaceC3322t12).c(str2, "Response received for url: " + str3);
                            } else {
                                str2 = str4;
                            }
                            c3428xb = f24493b;
                            xoVar.f27881a = str3;
                            xoVar.f27882b = interfaceC3322t12;
                            xoVar.f27883c = linkedHashMap;
                            xoVar.f27884d = str5;
                            xoVar.f27885e = ve2;
                            xoVar.f27886f = jCurrentTimeMillis;
                            xoVar.f27889i = 3;
                            if (c3428xb.a(str3, xoVar) != objF) {
                                ve3 = ve2;
                                if (ve3 == null) {
                                }
                                if (interfaceC3322t12 != null) {
                                    ((C3348u9) interfaceC3322t12).b(str2, "onFailedResponse: " + str3 + " " + ve3);
                                }
                                obj = obj2;
                                linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2194));
                            }
                        }
                        return objF;
                    } catch (TimeoutCancellationException e20) {
                        e = e20;
                        str2 = str4;
                        obj = obj2;
                    } catch (Exception e21) {
                        e = e21;
                        str2 = str4;
                        obj = obj2;
                        linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                        }
                        linkedHashMap.put("networkType", B5.o());
                        linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                        C3178nk c3178nk6 = C3178nk.f27064a;
                        C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                        return null;
                    }
                } catch (TimeoutCancellationException e22) {
                    e = e22;
                    obj = obj2;
                }
            } catch (TimeoutCancellationException e23) {
                e = e23;
                obj = "errorCode";
                str2 = "WebResourceHandler";
                jCurrentTimeMillis = j10;
                interfaceC3322t12 = interfaceC3322t10;
            } catch (Exception e24) {
                e = e24;
                interfaceC3322t11 = interfaceC3322t10;
                obj = "errorCode";
                str2 = "WebResourceHandler";
                jCurrentTimeMillis = j10;
                interfaceC3322t12 = interfaceC3322t11;
                linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                if (interfaceC3322t12 != null) {
                    ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                }
                linkedHashMap.put("networkType", B5.o());
                linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                C3178nk c3178nk7 = C3178nk.f27064a;
                C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                return null;
            }
        } else {
            if (i11 == 2) {
                j10 = xoVar.f27886f;
                str5 = xoVar.f27884d;
                Map map = xoVar.f27883c;
                interfaceC3322t11 = xoVar.f27882b;
                String str7 = xoVar.f27881a;
                try {
                    fl.s.b(objA);
                    obj2 = "errorCode";
                    str4 = "WebResourceHandler";
                    jCurrentTimeMillis = j10;
                    interfaceC3322t12 = interfaceC3322t11;
                    str3 = str7;
                    linkedHashMap = map;
                    ve2 = (Ve) objA;
                    if (interfaceC3322t12 != null) {
                        str2 = str4;
                        ((C3348u9) interfaceC3322t12).c(str2, "Response received for url: " + str3);
                    } else {
                        str2 = str4;
                    }
                    c3428xb = f24493b;
                    xoVar.f27881a = str3;
                    xoVar.f27882b = interfaceC3322t12;
                    xoVar.f27883c = linkedHashMap;
                    xoVar.f27884d = str5;
                    xoVar.f27885e = ve2;
                    xoVar.f27886f = jCurrentTimeMillis;
                    xoVar.f27889i = 3;
                    if (c3428xb.a(str3, xoVar) != objF) {
                        ve3 = ve2;
                        if (ve3 == null) {
                        }
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).b(str2, "onFailedResponse: " + str3 + " " + ve3);
                        }
                        obj = obj2;
                        linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2194));
                    }
                    return objF;
                } catch (TimeoutCancellationException e25) {
                    e = e25;
                    str3 = str7;
                    linkedHashMap = map;
                    interfaceC3322t10 = interfaceC3322t11;
                    obj = "errorCode";
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j10;
                    interfaceC3322t12 = interfaceC3322t10;
                } catch (Exception e26) {
                    e = e26;
                    linkedHashMap = map;
                    obj = "errorCode";
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j10;
                    interfaceC3322t12 = interfaceC3322t11;
                    linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                    if (interfaceC3322t12 != null) {
                        ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                    }
                    linkedHashMap.put("networkType", B5.o());
                    linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                    C3178nk c3178nk8 = C3178nk.f27064a;
                    C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                    return null;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = xoVar.f27886f;
                ve3 = xoVar.f27885e;
                str5 = xoVar.f27884d;
                linkedHashMap = xoVar.f27883c;
                interfaceC3322t10 = xoVar.f27882b;
                String str8 = xoVar.f27881a;
                try {
                    fl.s.b(objA);
                    str3 = str8;
                    obj2 = "errorCode";
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j10;
                    interfaceC3322t12 = interfaceC3322t10;
                    if (ve3 == null && AbstractC3438xl.a(ve3) && ve3.d().F(bm.d.f9079b).length() > 0) {
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).c(str2, "onSuccessfulResponse: " + str3);
                        }
                        linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                        linkedHashMap.put("size", kotlin.coroutines.jvm.internal.b.e(((long) ve3.b().f25559c) / 1024));
                        linkedHashMap.put("networkType", B5.o());
                        C3178nk c3178nk9 = C3178nk.f27064a;
                        C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                        yl.f fVar = AbstractC2837af.f26214a;
                        kotlin.jvm.internal.s.h(ve3, "<this>");
                        return J3.a(new ByteArrayInputStream(ve3.d().J()), str5);
                    }
                    if (interfaceC3322t12 != null) {
                        ((C3348u9) interfaceC3322t12).b(str2, "onFailedResponse: " + str3 + " " + ve3);
                    }
                    obj = obj2;
                    try {
                        linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2194));
                    } catch (TimeoutCancellationException e27) {
                        e = e27;
                        linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2193));
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).a(str2, "Timeout occurred for url: " + str3, e);
                        }
                    } catch (Exception e28) {
                        e = e28;
                        linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                        if (interfaceC3322t12 != null) {
                            ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                        }
                    }
                } catch (TimeoutCancellationException e29) {
                    e = e29;
                    str3 = str8;
                    obj = "errorCode";
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j10;
                    interfaceC3322t12 = interfaceC3322t10;
                } catch (Exception e30) {
                    e = e30;
                    obj = "errorCode";
                    str2 = "WebResourceHandler";
                    jCurrentTimeMillis = j10;
                    interfaceC3322t12 = interfaceC3322t10;
                    linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2195));
                    if (interfaceC3322t12 != null) {
                        ((C3348u9) interfaceC3322t12).a(str2, "Unhandled exception occurred: " + e.getMessage(), e);
                    }
                    linkedHashMap.put("networkType", B5.o());
                    linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
                    C3178nk c3178nk10 = C3178nk.f27064a;
                    C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
                    return null;
                }
            }
            obj = "errorCode";
            str2 = "WebResourceHandler";
            jCurrentTimeMillis = j10;
            interfaceC3322t12 = interfaceC3322t10;
            linkedHashMap.put(obj, kotlin.coroutines.jvm.internal.b.f((short) 2193));
            if (interfaceC3322t12 != null) {
                ((C3348u9) interfaceC3322t12).a(str2, "Timeout occurred for url: " + str3, e);
            }
        }
        linkedHashMap.put("networkType", B5.o());
        linkedHashMap.put("latency", kotlin.coroutines.jvm.internal.b.e(System.currentTimeMillis() - jCurrentTimeMillis));
        C3178nk c3178nk11 = C3178nk.f27064a;
        C3178nk.b("ResourceCacheMiss", linkedHashMap, EnumC3281rk.SDK);
        return null;
    }

    public static em.v0 a(String str, InterfaceC3322t9 interfaceC3322t9) {
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("WebResourceHandler", "downloadResourceFile(): " + str);
        }
        return ((B9) Pe.f25487d.getValue()).a(new Re(str, null, new Gk(a().getTimeout(), a().getTimeout(), a().getTimeout()), null, new Ni(500L, a().getMaxRetries()), false, 42));
    }
}
