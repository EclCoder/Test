package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zziho implements Map.Entry, ul.a {
    private final /* synthetic */ Map.Entry zza;

    public zziho(Map.Entry delegate) {
        s.h(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
