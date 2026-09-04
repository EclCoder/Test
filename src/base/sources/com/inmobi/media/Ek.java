package com.inmobi.media;

import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ek extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fk f24731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f24732b;

    public Ek(Fk fk2, byte b10) {
        this.f24731a = fk2;
        this.f24732b = b10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f24731a.b(this.f24732b);
    }
}
