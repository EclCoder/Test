package com.android.installreferrer.api;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ReferrerDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f10473a;

    public ReferrerDetails(Bundle bundle) {
        this.f10473a = bundle;
    }

    public String a() {
        return this.f10473a.getString("install_referrer");
    }
}
