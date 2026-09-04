package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.dl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2921dl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nm.a f26416c = nm.g.b(false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ve f26417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f26418b;

    public C2921dl(Ve networkResponse, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        kotlin.jvm.internal.s.h(networkResponse, "networkResponse");
        kotlin.jvm.internal.s.h(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.f26417a = networkResponse;
        this.f26418b = inMobiUnifiedIdInterfaceSet;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:35:0x0087, B:36:0x00a0, B:38:0x00a6, B:40:0x00ae, B:41:0x00b9, B:42:0x00bd, B:24:0x0058, B:28:0x0067, B:31:0x0081, B:45:0x00c8), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(JSONObject jSONObject, kotlin.coroutines.jvm.internal.d dVar) {
        C2895cl c2895cl;
        JSONObject jSONObject2;
        nm.a aVar;
        JSONObject jSONObject3;
        JSONObject jSONObjectA;
        if (dVar instanceof C2895cl) {
            c2895cl = (C2895cl) dVar;
            int i10 = c2895cl.f26360e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2895cl.f26360e = i10 - Integer.MIN_VALUE;
            } else {
                c2895cl = new C2895cl(this, dVar);
            }
        } else {
            c2895cl = new C2895cl(this, dVar);
        }
        Object obj = c2895cl.f26358c;
        Object objF = ll.b.f();
        int i11 = c2895cl.f26360e;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                nm.a aVar2 = f26416c;
                c2895cl.f26356a = jSONObject;
                c2895cl.f26357b = aVar2;
                c2895cl.f26360e = 1;
                if (aVar2.e(null, c2895cl) != objF) {
                    jSONObject2 = jSONObject;
                    aVar = aVar2;
                }
                return objF;
            }
            if (i11 == 1) {
                aVar = c2895cl.f26357b;
                JSONObject jSONObject4 = c2895cl.f26356a;
                fl.s.b(obj);
                jSONObject2 = jSONObject4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = c2895cl.f26357b;
                JSONObject jSONObject5 = c2895cl.f26356a;
                fl.s.b(obj);
                jSONObject3 = jSONObject5;
            }
            M9.b(AbstractC2972fl.a(jSONObject3, M9.b()));
            jSONObjectA = AbstractC2972fl.a(M9.b());
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f26418b) {
                if (jSONObjectA == null) {
                    AbstractC2972fl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                } else {
                    AbstractC2972fl.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                }
            }
            this.f26418b.clear();
            fl.g0 g0Var = fl.g0.f38750a;
            aVar.f(null);
            return g0Var;
            int iC = this.f26417a.c();
            C2880c6 c2880c6 = EnumC2931e6.f26451b;
            if (iC != 192 && iC != 0) {
                C2843al c2843al = C2843al.f26226a;
                c2895cl.f26356a = jSONObject2;
                c2895cl.f26357b = aVar;
                c2895cl.f26360e = 2;
                Object objA = J3.a(C2843al.f26227b, new Vk(null), c2895cl);
                if (objA != ll.b.f()) {
                    objA = fl.g0.f38750a;
                }
                if (objA != objF) {
                    jSONObject3 = jSONObject2;
                    M9.b(AbstractC2972fl.a(jSONObject3, M9.b()));
                    jSONObjectA = AbstractC2972fl.a(M9.b());
                    while (r0.hasNext()) {
                        if (jSONObjectA == null) {
                            AbstractC2972fl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                        } else {
                            AbstractC2972fl.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                        }
                    }
                    this.f26418b.clear();
                    fl.g0 g0Var2 = fl.g0.f38750a;
                    aVar.f(null);
                    return g0Var2;
                }
                return objF;
            }
            fl.g0 g0Var3 = fl.g0.f38750a;
            aVar.f(null);
            return g0Var3;
        } catch (Throwable th2) {
            jSONObject.f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i10, String str, kotlin.coroutines.jvm.internal.d dVar) throws Throwable {
        C2869bl c2869bl;
        String str2;
        nm.a aVar;
        Throwable th2;
        nm.a aVar2;
        String str3;
        if (dVar instanceof C2869bl) {
            c2869bl = (C2869bl) dVar;
            int i11 = c2869bl.f26276f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2869bl.f26276f = i11 - Integer.MIN_VALUE;
            } else {
                c2869bl = new C2869bl(this, dVar);
            }
        } else {
            c2869bl = new C2869bl(this, dVar);
        }
        Object obj = c2869bl.f26274d;
        Object objF = ll.b.f();
        int i12 = c2869bl.f26276f;
        try {
            if (i12 == 0) {
                fl.s.b(obj);
                nm.a aVar3 = f26416c;
                c2869bl.f26272b = str;
                c2869bl.f26273c = aVar3;
                c2869bl.f26271a = i10;
                c2869bl.f26276f = 1;
                if (aVar3.e(null, c2869bl) != objF) {
                    str2 = str;
                    aVar = aVar3;
                }
                return objF;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = c2869bl.f26273c;
                str3 = c2869bl.f26272b;
                try {
                    fl.s.b(obj);
                    a(str3);
                    fl.g0 g0Var = fl.g0.f38750a;
                    aVar2.f(null);
                    return g0Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.f(null);
                    throw th2;
                }
            }
            i10 = c2869bl.f26271a;
            aVar = c2869bl.f26273c;
            str2 = c2869bl.f26272b;
            fl.s.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("errorCode", Integer.valueOf(i10));
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC3281rk.SDK);
            int iC = this.f26417a.c();
            C2880c6 c2880c6 = EnumC2931e6.f26451b;
            if (iC != 192 && iC != 0) {
                C2843al c2843al = C2843al.f26226a;
                c2869bl.f26272b = str2;
                c2869bl.f26273c = aVar;
                c2869bl.f26276f = 2;
                Object objA = J3.a(C2843al.f26227b, new Vk(null), c2869bl);
                if (objA != ll.b.f()) {
                    objA = fl.g0.f38750a;
                }
                if (objA != objF) {
                    aVar2 = aVar;
                    str3 = str2;
                    a(str3);
                    fl.g0 g0Var2 = fl.g0.f38750a;
                    aVar2.f(null);
                    return g0Var2;
                }
                return objF;
            }
            fl.g0 g0Var3 = fl.g0.f38750a;
            aVar.f(null);
            return g0Var3;
        } catch (Throwable th4) {
            nm.a aVar4 = aVar;
            th2 = th4;
            aVar2 = aVar4;
            aVar2.f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x0033, JSONException -> 0x0035, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:23:0x005a), top: B:28:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0033, JSONException -> 0x0035, LOOP:0: B:17:0x003d->B:19:0x0043, LOOP_END, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:23:0x005a), top: B:28:0x000b }, TRY_LEAVE] */
    public final void a(String str) {
        Iterator it;
        JSONObject jSONObjectA = AbstractC2972fl.a(M9.b());
        try {
            if (jSONObjectA != null) {
                if (jSONObjectA.has("ufids") && jSONObjectA.getJSONArray("ufids").length() > 0) {
                    Iterator it2 = this.f26418b.iterator();
                    while (it2.hasNext()) {
                        AbstractC2972fl.a((InMobiUnifiedIdInterface) it2.next(), jSONObjectA, null);
                    }
                } else {
                    it = this.f26418b.iterator();
                    while (it.hasNext()) {
                        AbstractC2972fl.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                    }
                }
            } else {
                it = this.f26418b.iterator();
                while (it.hasNext()) {
                    AbstractC2972fl.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        } finally {
            this.f26418b.clear();
        }
    }
}
