package com.inmobi.ads;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C2876c2;
import com.inmobi.media.C2927e2;
import com.inmobi.media.Sb;
import com.inmobi.media.Y1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2876c2 f24400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f24401b;

    public d(InMobiBanner inMobiBanner) {
        this.f24401b = inMobiBanner;
        this.f24400a = new C2876c2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            C2927e2 mAdManager = this.f24401b.getMAdManager();
            if (mAdManager != null) {
                mAdManager.o();
            }
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            s.g(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Sb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            Y1 mPubListener = this.f24401b.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(this.f24401b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f24401b.setEnableAutoRefresh(false);
        this.f24401b.a((PublisherCallbacks) this.f24400a, "Preload", false);
    }
}
