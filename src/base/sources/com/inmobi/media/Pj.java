package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Pj implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25505a;

    public Pj(int i10) {
        this.f25505a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return jl.a.a(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f25505a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f25505a)));
    }
}
