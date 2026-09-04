package com.bytedance.sdk.openadsdk.component.ojm;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.core.widget.uua;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor extends com.bytedance.sdk.openadsdk.core.dkl.dse {
    final dse aq;
    com.bytedance.sdk.openadsdk.core.widget.qor bug;
    uua dkl;
    com.bytedance.sdk.openadsdk.core.dkl.aq dnm;
    com.bytedance.sdk.openadsdk.core.dkl.aq dse;
    PAGLogoView gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.dkl.qor f13371hn;
    com.bytedance.sdk.openadsdk.core.dkl.gjv hnj;
    uua ojm;
    com.bytedance.sdk.openadsdk.core.dkl.gjv qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.dkl.aq f13372sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.dkl.aq f13373ta;

    public qor(Context context) {
        super(context);
        this.aq = new dse(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.dkl.gjv getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.gjv;
    }

    public abstract com.bytedance.sdk.openadsdk.core.dkl.aq getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.dkl.gjv getBackImage() {
        return this.hnj;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.aq getClickButton() {
        return this.f13372sk;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.aq getContent() {
        return this.dnm;
    }

    public com.bytedance.sdk.openadsdk.core.widget.qor getDspAdChoice() {
        return this.bug;
    }

    public uua getHostAppIcon() {
        return this.dkl;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.aq getHostAppName() {
        return this.dse;
    }

    public uua getIconOnlyView() {
        return this.ojm;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.gjv getImageView() {
        return this.qor;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.sk getOverlayLayout() {
        return null;
    }

    public abstract jip getScoreBar();

    public com.bytedance.sdk.openadsdk.core.dkl.aq getTitle() {
        return this.f13373ta;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.aq getTopCountDown() {
        dse dseVar = this.aq;
        if (dseVar != null) {
            return dseVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        dse dseVar = this.aq;
        if (dseVar != null) {
            return dseVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.dkl.gjv getTopSkip() {
        dse dseVar = this.aq;
        if (dseVar != null) {
            return dseVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.dkl.qor getVideoContainer() {
        return this.f13371hn;
    }
}
