package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.inmobi.media.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3157n extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3053j f27015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3157n(InterfaceC3322t9 interfaceC3322t9, InterfaceC3053j interfaceC3053j, kl.f fVar) {
        super(2, fVar);
        this.f27014a = interfaceC3322t9;
        this.f27015b = interfaceC3053j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3157n(this.f27014a, this.f27015b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3157n(this.f27014a, this.f27015b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        InterfaceC3322t9 interfaceC3322t9 = this.f27014a;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet<WeakReference> copyOnWriteArraySet = C3235q.f27296h;
        InterfaceC3053j interfaceC3053j = this.f27015b;
        for (WeakReference weakReference : copyOnWriteArraySet) {
            if (kotlin.jvm.internal.s.c(weakReference.get(), interfaceC3053j)) {
                C3235q.f27296h.remove(weakReference);
            }
        }
        if (C3235q.f27296h.isEmpty()) {
            InterfaceC3322t9 interfaceC3322t10 = this.f27014a;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            InterfaceC3322t9 interfaceC3322t11 = this.f27014a;
            Context context = Xi.f26021a;
            if (context == null) {
                if (interfaceC3322t11 != null) {
                    ((C3348u9) interfaceC3322t11).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                C3235q.a((Float) null);
            } else if (C3235q.f27292d.compareAndSet(true, false)) {
                if (interfaceC3322t11 != null) {
                    ((C3348u9) interfaceC3322t11).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                C3235q.a(context, interfaceC3322t11);
            } else if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return fl.g0.f38750a;
    }
}
