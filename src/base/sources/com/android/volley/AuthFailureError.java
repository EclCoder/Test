package com.android.volley;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AuthFailureError extends VolleyError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f10480a;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f10480a != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
