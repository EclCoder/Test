package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Hf extends De {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hf(String vendor, String str, String url) {
        super(url, "OMID_VIEWABILITY");
        kotlin.jvm.internal.s.h(vendor, "vendor");
        kotlin.jvm.internal.s.h(url, "url");
        this.f24946c = vendor;
        this.f24947d = str;
    }
}
