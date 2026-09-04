package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;

/* JADX INFO: renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3356uh implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityResult f27630a;

    public C3356uh(AdQualityResult result) {
        kotlin.jvm.internal.s.h(result, "result");
        this.f27630a = result;
    }

    @Override // com.inmobi.media.M0
    public final Object a() {
        boolean z10;
        try {
            z10 = true;
            em.j.b(null, new C3330th(this, null), 1, null);
        } catch (SQLiteException unused) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
