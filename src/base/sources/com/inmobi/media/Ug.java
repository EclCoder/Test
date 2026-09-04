package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Ug;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ug extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25842a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ug(Context context, kl.f fVar) {
        super(2, fVar);
        this.f25842a = context;
    }

    public static final boolean a(String str) {
        kotlin.jvm.internal.s.e(str);
        return bm.r.N(str, "auto_", false, 2, null);
    }

    public static final boolean b(String str) {
        return kotlin.jvm.internal.s.c(str, "a_i_dep");
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Ug(this.f25842a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Ug(this.f25842a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            Xg xg2 = Xg.f26013a;
            Context context = this.f25842a;
            xg2.getClass();
            if (Xg.f26016d == null) {
                Xg.f26016d = new Ig(context, "pub_signals_store");
            }
            Ig ig2 = null;
            try {
                Ig ig3 = Xg.f26016d;
                if (ig3 == null) {
                    kotlin.jvm.internal.s.w("prefDao");
                    ig3 = null;
                }
                String strA = ig3.a("saved_signals");
                if (strA != null) {
                    JSONObject jSONObject = new JSONObject(strA);
                    Iterator<String> itKeys = jSONObject.keys();
                    kotlin.jvm.internal.s.g(itKeys, "keys(...)");
                    Iterator it = am.j.B(am.j.p(am.j.e(itKeys), new Function1() { // from class: yh.v4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Ug.a((String) obj2));
                        }
                    })).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    Ig ig4 = Xg.f26016d;
                    if (ig4 == null) {
                        kotlin.jvm.internal.s.w("prefDao");
                        ig4 = null;
                    }
                    String value = jSONObject.toString();
                    kotlin.jvm.internal.s.g(value, "toString(...)");
                    ig4.getClass();
                    kotlin.jvm.internal.s.h("saved_signals", "key");
                    kotlin.jvm.internal.s.h(value, "value");
                    ig4.f25006a.a("saved_signals", value, true);
                }
            } catch (Exception e10) {
                Ig ig5 = Xg.f26016d;
                if (ig5 == null) {
                    kotlin.jvm.internal.s.w("prefDao");
                    ig5 = null;
                }
                ig5.getClass();
                kotlin.jvm.internal.s.h("saved_signals", "key");
                ig5.f25006a.a("saved_signals");
                Xg.f26013a.getClass();
                Xg.f26017e.a();
                Sb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
                fl.k kVar = W9.f25935a;
                W9.a(new M2(e10));
            }
            try {
                Ig ig6 = Xg.f26016d;
                if (ig6 == null) {
                    kotlin.jvm.internal.s.w("prefDao");
                    ig6 = null;
                }
                String strA2 = ig6.a("imp_depth");
                if (strA2 != null) {
                    JSONObject jSONObject2 = new JSONObject(strA2);
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    kotlin.jvm.internal.s.g(itKeys2, "keys(...)");
                    Iterator it2 = am.j.B(am.j.p(am.j.e(itKeys2), new Function1() { // from class: yh.w4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(Ug.b((String) obj2));
                        }
                    })).iterator();
                    while (it2.hasNext()) {
                        jSONObject2.remove((String) it2.next());
                    }
                    Ig ig7 = Xg.f26016d;
                    if (ig7 == null) {
                        kotlin.jvm.internal.s.w("prefDao");
                        ig7 = null;
                    }
                    String value2 = jSONObject2.toString();
                    kotlin.jvm.internal.s.g(value2, "toString(...)");
                    ig7.getClass();
                    kotlin.jvm.internal.s.h("imp_depth", "key");
                    kotlin.jvm.internal.s.h(value2, "value");
                    La la2 = ig7.f25006a;
                    ConcurrentHashMap concurrentHashMap = La.f25197b;
                    la2.a("imp_depth", value2, false);
                }
            } catch (Exception unused) {
                Ig ig8 = Xg.f26016d;
                if (ig8 == null) {
                    kotlin.jvm.internal.s.w("prefDao");
                } else {
                    ig2 = ig8;
                }
                ig2.getClass();
                kotlin.jvm.internal.s.h("imp_depth", "key");
                ig2.f25006a.a("imp_depth");
            }
            Xg.f26013a.getClass();
            I1 i10 = Xg.f26017e;
            i10.f24976c = i10.f24974a.invoke();
            I1 i11 = Xg.f26018f;
            i11.f24976c = i11.f24974a.invoke();
        } catch (Exception e11) {
            Sb.a((byte) 1, "PubSignals", "Publisher signals could not be reset.");
            fl.k kVar2 = W9.f25935a;
            AbstractC3219p9.a(e11);
        }
        Xg.f26013a.getClass();
        I1 i12 = Xg.f26017e;
        i12.f24976c = i12.f24974a.invoke();
        I1 i13 = Xg.f26018f;
        i13.f24976c = i13.f24974a.invoke();
        return fl.g0.f38750a;
    }
}
