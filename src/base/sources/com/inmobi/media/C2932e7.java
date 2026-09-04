package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2932e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2932e7 f26472a = new C2932e7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InMobiUserDataModel f26473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nm.a f26474c;

    static {
        kotlin.jvm.internal.s.g(C2932e7.class.getSimpleName(), "getSimpleName(...)");
        f26474c = nm.g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, kotlin.coroutines.jvm.internal.d dVar) {
        C2907d7 c2907d7;
        nm.a aVar;
        if (dVar instanceof C2907d7) {
            c2907d7 = (C2907d7) dVar;
            int i10 = c2907d7.f26397d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2907d7.f26397d = i10 - Integer.MIN_VALUE;
            } else {
                c2907d7 = new C2907d7(dVar);
            }
        } else {
            c2907d7 = new C2907d7(dVar);
        }
        Object obj = c2907d7.f26396c;
        Object objF = ll.b.f();
        int i11 = c2907d7.f26397d;
        if (i11 == 0) {
            fl.s.b(obj);
            aVar = f26474c;
            c2907d7.f26394a = inMobiUserDataModel;
            c2907d7.f26395b = aVar;
            c2907d7.f26397d = 1;
            if (aVar.e(null, c2907d7) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm.a aVar2 = c2907d7.f26395b;
            InMobiUserDataModel inMobiUserDataModel2 = c2907d7.f26394a;
            fl.s.b(obj);
            aVar = aVar2;
            inMobiUserDataModel = inMobiUserDataModel2;
        }
        try {
            Objects.toString(f26473b);
            Objects.toString(inMobiUserDataModel);
            f26473b = inMobiUserDataModel;
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    public final String toString() {
        return String.valueOf(f26473b);
    }
}
