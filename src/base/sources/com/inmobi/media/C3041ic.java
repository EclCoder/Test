package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ic, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3041ic implements InterfaceC3015hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3015hc f26736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26737b;

    public C3041ic(InterfaceC3015hc mediaChangeReceiver) {
        kotlin.jvm.internal.s.h(mediaChangeReceiver, "mediaChangeReceiver");
        this.f26736a = mediaChangeReceiver;
        this.f26737b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3015hc
    public final void a() {
        if (this.f26737b.getAndSet(false)) {
            this.f26736a.a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3015hc
    public final void b() {
        if (this.f26737b.getAndSet(true)) {
            return;
        }
        this.f26736a.b();
    }
}
