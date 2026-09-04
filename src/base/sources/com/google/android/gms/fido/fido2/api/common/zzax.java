package com.google.android.gms.fido.fido2.api.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzax extends Exception {
    public zzax(String str) {
        super(String.format("User verification requirement %s not supported", str));
    }
}
