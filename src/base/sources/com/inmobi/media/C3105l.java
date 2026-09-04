package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.inmobi.media.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3105l extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f26886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3053j f26887b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3105l(InterfaceC3322t9 interfaceC3322t9, InterfaceC3053j interfaceC3053j, kl.f fVar) {
        super(2, fVar);
        this.f26886a = interfaceC3322t9;
        this.f26887b = interfaceC3053j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3105l(this.f26886a, this.f26887b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3105l(this.f26886a, this.f26887b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        InterfaceC3322t9 interfaceC3322t9 = this.f26886a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + C3235q.f27296h.size());
        }
        for (WeakReference weakReference : C3235q.f27296h) {
            if (weakReference.get() == null) {
                C3235q.f27296h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = C3235q.f27296h;
        boolean zIsEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.f26887b));
        InterfaceC3053j interfaceC3053j = this.f26887b;
        Float f10 = (Float) C3235q.f27293e.get();
        ((Yh) interfaceC3053j).a(f10 != null ? kotlin.coroutines.jvm.internal.b.c(J3.a(f10.floatValue() * 100.0f)) : null);
        if (zIsEmpty) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26886a;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).c("AdAudioTracker", "Starting audio volume change listener");
            }
            C3235q.a(this.f26886a);
        } else {
            InterfaceC3322t9 interfaceC3322t11 = this.f26886a;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return fl.g0.f38750a;
    }
}
