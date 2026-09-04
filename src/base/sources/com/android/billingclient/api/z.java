package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class z extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l5.h f10469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(a aVar, Handler handler, l5.h hVar) {
        super(handler);
        this.f10469a = hVar;
        Objects.requireNonNull(aVar);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f10469a.a(e.b(bundle));
    }
}
