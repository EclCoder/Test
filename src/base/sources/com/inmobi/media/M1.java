package com.inmobi.media;

import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class M1 implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f25238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f25239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hm.w f25240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3322t9 f25242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public em.z1 f25243f;

    public M1(long j10, ViewGroup observableView, InterfaceC3322t9 interfaceC3322t9, em.o0 coroutineScope, hm.w visibilityStateFlow) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(observableView, "observableView");
        kotlin.jvm.internal.s.h(visibilityStateFlow, "visibilityStateFlow");
        this.f25238a = coroutineScope;
        this.f25239b = observableView;
        this.f25240c = visibilityStateFlow;
        this.f25241d = j10;
        this.f25242e = interfaceC3322t9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r12.collect(r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r14.collect(r4, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.M1 r11, android.view.ViewGroup r12, em.o0 r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M1.a(com.inmobi.media.M1, android.view.ViewGroup, em.o0, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ Object emit(Object obj, kl.f fVar) {
        return a(((Boolean) obj).booleanValue());
    }

    public final fl.g0 a(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f25242e;
        String str = giNWGaNAgVQoO.kaOdz;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a(str, "AttachedStateCollector - view attachment state changed: " + z10);
        }
        if (z10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f25242e;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a(str, "AttachedStateCollector - starting visibility observation");
            }
            this.f25243f = em.k.d(this.f25238a, null, null, new J1(this, null), 3, null);
        } else {
            InterfaceC3322t9 interfaceC3322t11 = this.f25242e;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).a(str, "AttachedStateCollector - view detached, stopping observation");
            }
            this.f25240c.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            L6.a(this.f25243f);
            this.f25243f = null;
        }
        return fl.g0.f38750a;
    }
}
