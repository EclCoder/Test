package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2868bk extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        kotlin.jvm.internal.s.h(network, "network");
        ConcurrentHashMap concurrentHashMap = AbstractC2894ck.f26353a;
        kotlin.jvm.internal.s.g("ck", "access$getTAG$p(...)");
        super.onAvailable(network);
        ((Fc) Xi.f26025e.getValue()).b(new J2(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.s.h(network, "network");
        ConcurrentHashMap concurrentHashMap = AbstractC2894ck.f26353a;
        kotlin.jvm.internal.s.g("ck", "access$getTAG$p(...)");
        super.onLost(network);
        ((Fc) Xi.f26025e.getValue()).b(new J2(10, 4, "lost"));
    }
}
