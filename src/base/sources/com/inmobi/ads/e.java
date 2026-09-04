package com.inmobi.ads;

import android.content.Context;
import com.inmobi.media.C3271ra;
import com.inmobi.media.C3297sa;
import com.inmobi.media.Sb;
import com.inmobi.media.Sg;
import kotlin.jvm.internal.s;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3271ra f24402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiInterstitial f24403b;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.f24403b = inMobiInterstitial;
        this.f24402a = new C3271ra(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() throws JSONException {
        try {
            this.f24403b.getMAdManager$media_release().i();
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            s.g(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Sb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            this.f24403b.getMPubListener$media_release().a(this.f24403b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f24403b.f24386b = true;
        Sg sg2 = this.f24403b.f24388d;
        sg2.getClass();
        s.h("Preload", "<set-?>");
        sg2.f25697g = "Preload";
        C3297sa mAdManager$media_release = this.f24403b.getMAdManager$media_release();
        Sg sg3 = this.f24403b.f24388d;
        Context context = this.f24403b.f24385a;
        if (context == null) {
            s.w("mContext");
            context = null;
        }
        mAdManager$media_release.a(sg3, context, true, "intHtml");
        this.f24403b.getMAdManager$media_release().b(this.f24402a);
    }
}
