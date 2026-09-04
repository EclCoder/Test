package com.vungle.ads.internal.presenter;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static final C0525a Companion = new C0525a(null);
    private static final String TAG = "AdEventListener";
    private boolean adRewarded;
    private Placement placement;
    private final b playAdCallback;

    /* JADX INFO: renamed from: com.vungle.ads.internal.presenter.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0525a {
        public /* synthetic */ C0525a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0525a() {
        }
    }

    public a(b bVar, Placement placement) {
        this.playAdCallback = bVar;
        this.placement = placement;
    }

    public final void onError(VungleError error, String str) {
        s.h(error, "error");
        b bVar = this.playAdCallback;
        if (bVar != null) {
            bVar.onFailure(error);
            q.Companion.e(TAG, "AdEventListener#PlayAdCallback " + str, error);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(String s10, String str, String str2) {
        Placement placement;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        s.h(s10, "s");
        q.Companion.d(TAG, "s=" + s10 + ", value=" + str + ", id=" + str2);
        switch (s10.hashCode()) {
            case -1912374177:
                if (s10.equals(g.SUCCESSFUL_VIEW) && (placement = this.placement) != null && placement.isRewardedVideo() && !this.adRewarded) {
                    this.adRewarded = true;
                    b bVar5 = this.playAdCallback;
                    if (bVar5 != null) {
                        bVar5.onAdRewarded(str2);
                    }
                }
                break;
            case -1627831289:
                if (s10.equals("adViewed") && (bVar = this.playAdCallback) != null) {
                    bVar.onAdImpression(str2);
                }
                break;
            case 100571:
                if (s10.equals(TtmlNode.END) && (bVar2 = this.playAdCallback) != null) {
                    bVar2.onAdEnd(str2);
                }
                break;
            case 3417674:
                if (s10.equals(g.OPEN)) {
                    if (s.c(str, "adClick")) {
                        b bVar6 = this.playAdCallback;
                        if (bVar6 != null) {
                            bVar6.onAdClick(str2);
                        }
                        break;
                    } else if (s.c(str, "adLeftApplication") && (bVar3 = this.playAdCallback) != null) {
                        bVar3.onAdLeftApplication(str2);
                        break;
                    }
                }
                break;
            case 109757538:
                if (s10.equals("start") && (bVar4 = this.playAdCallback) != null) {
                    bVar4.onAdStart(str2);
                }
                break;
        }
    }
}
