package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3428xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm.a[] f27839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f27840b;

    public C3428xb() {
        nm.a[] aVarArr = new nm.a[16];
        for (int i10 = 0; i10 < 16; i10++) {
            aVarArr[i10] = nm.g.b(false, 1, null);
        }
        this.f27839a = aVarArr;
        this.f27840b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, yo yoVar, kotlin.coroutines.jvm.internal.d dVar) throws Throwable {
        C3376vb c3376vb;
        nm.a aVar;
        Function1 function1;
        nm.a aVar2;
        Object obj;
        String str2;
        if (dVar instanceof C3376vb) {
            c3376vb = (C3376vb) dVar;
            int i10 = c3376vb.f27711f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3376vb.f27711f = i10 - Integer.MIN_VALUE;
            } else {
                c3376vb = new C3376vb(this, dVar);
            }
        } else {
            c3376vb = new C3376vb(this, dVar);
        }
        Object obj2 = c3376vb.f27709d;
        Object objF = ll.b.f();
        int i11 = c3376vb.f27711f;
        try {
            if (i11 == 0) {
                fl.s.b(obj2);
                aVar = this.f27839a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                c3376vb.f27706a = str;
                c3376vb.f27707b = yoVar;
                c3376vb.f27708c = aVar;
                c3376vb.f27711f = 1;
                function1 = yoVar;
                if (aVar.e(null, c3376vb) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (nm.a) c3376vb.f27707b;
                str2 = c3376vb.f27706a;
                try {
                    fl.s.b(obj2);
                    this.f27840b.put(str2, obj2);
                    obj = obj2;
                    aVar = aVar2;
                    aVar.f(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.f(null);
                    throw th;
                }
            }
            nm.a aVar3 = c3376vb.f27708c;
            Function1 function2 = (Function1) c3376vb.f27707b;
            String str3 = c3376vb.f27706a;
            fl.s.b(obj2);
            aVar = aVar3;
            str = str3;
            function1 = function2;
            obj = this.f27840b.get(str);
            if (obj == null) {
                c3376vb.f27706a = str;
                c3376vb.f27707b = aVar;
                c3376vb.f27708c = null;
                c3376vb.f27711f = 2;
                Object objInvoke = function1.invoke(c3376vb);
                if (objInvoke != objF) {
                    str2 = str;
                    aVar2 = aVar;
                    obj2 = objInvoke;
                    this.f27840b.put(str2, obj2);
                    obj = obj2;
                    aVar = aVar2;
                }
                return objF;
            }
            aVar.f(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.f(null);
            throw th;
        }
    }

    public final String toString() {
        String str = this.f27840b.toString();
        kotlin.jvm.internal.s.g(str, "toString(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, kotlin.coroutines.jvm.internal.d dVar) {
        C3402wb c3402wb;
        String str2;
        nm.a aVar;
        if (dVar instanceof C3402wb) {
            c3402wb = (C3402wb) dVar;
            int i10 = c3402wb.f27779e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3402wb.f27779e = i10 - Integer.MIN_VALUE;
            } else {
                c3402wb = new C3402wb(this, dVar);
            }
        } else {
            c3402wb = new C3402wb(this, dVar);
        }
        Object obj = c3402wb.f27777c;
        Object objF = ll.b.f();
        int i11 = c3402wb.f27779e;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.f27839a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
            c3402wb.f27775a = str;
            c3402wb.f27776b = aVar2;
            c3402wb.f27779e = 1;
            if (aVar2.e(null, c3402wb) == objF) {
                return objF;
            }
            str2 = str;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3402wb.f27776b;
            str2 = c3402wb.f27775a;
            fl.s.b(obj);
        }
        try {
            this.f27840b.remove(str2);
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }
}
