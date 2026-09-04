package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<c0> f33161a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.f33161a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.f33161a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.f33161a.contains(c0Var);
    }
}
