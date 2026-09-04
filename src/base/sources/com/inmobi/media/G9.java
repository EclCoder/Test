package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class G9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f24847a;

    public G9(JSONObject jSONObject) {
        this.f24847a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC2972fl.c()) {
            return;
        }
        M9.a(this.f24847a);
    }
}
