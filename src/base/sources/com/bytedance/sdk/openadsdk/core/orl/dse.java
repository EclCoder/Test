package com.bytedance.sdk.openadsdk.core.orl;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private final AdEvents dkl;
    protected VastProperties gjv;
    protected String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final AdSession f14101sk;
    private boolean dse = false;
    protected boolean hnj = false;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected int f14100hn = 0;

    public dse(AdSession adSession, AdEvents adEvents, View view) {
        this.f14101sk = adSession;
        this.dkl = adEvents;
        this.qor = adSession.getAdSessionId();
        hnj(view);
    }

    public void gjv() {
        hnj(3);
    }

    void hn(int i10) {
    }

    void hnj(float f10, boolean z10) {
    }

    void qor() {
        hnj(4);
    }

    void hn() {
        hnj(1);
    }

    public void hnj(boolean z10) {
    }

    public void hnj(boolean z10, float f10) {
    }

    void hnj(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.f14101sk) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void hnj(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f14101sk;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean hnj() {
        return this.hnj;
    }

    public void hnj(int i10) {
        int i11;
        if (this.f14101sk == null || this.dkl == null || !sk.qor()) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 || (i11 = this.f14100hn) == 0 || i11 == 4) {
                        return;
                    }
                    this.f14101sk.finish();
                    this.hnj = false;
                } else {
                    if (this.dse) {
                        return;
                    }
                    int i12 = this.f14100hn;
                    if (i12 != 1 && i12 != 2) {
                        return;
                    }
                    this.dkl.impressionOccurred();
                    this.dse = true;
                }
            } else {
                if (this.f14100hn != 0) {
                    return;
                }
                this.f14101sk.start();
                if (this.gjv == null) {
                    this.gjv = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.dkl.loaded(this.gjv);
                this.hnj = true;
                this.gjv = null;
            }
        } else {
            if (this.f14100hn != 0) {
                return;
            }
            this.f14101sk.start();
            this.dkl.loaded();
            this.hnj = true;
        }
        this.f14100hn = i10;
    }

    public void hnj(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            hnj((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
