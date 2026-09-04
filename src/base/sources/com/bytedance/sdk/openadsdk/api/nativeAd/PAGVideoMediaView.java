package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mjg.hn.dkl;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.qor.hnj;
import com.bytedance.sdk.openadsdk.utils.gjv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PAGVideoMediaView extends PAGMediaView implements hnj.InterfaceC0232hnj {
    private as gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private dkl f13232hn;
    private final com.bytedance.sdk.openadsdk.hnj.hn.hnj qor;

    public PAGVideoMediaView(Context context, View view, com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar) {
        super(context);
        hnj(view);
        this.qor = hnjVar;
    }

    private boolean hn() {
        dkl dklVar = this.f13232hn;
        if (dklVar != null) {
            return dklVar.orl();
        }
        return false;
    }

    private void hnj(View view) {
        if (view instanceof dkl) {
            dkl dklVar = (dkl) view;
            this.f13232hn = dklVar;
            addView(dklVar, -1, -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        dkl dklVar = this.f13232hn;
        if (dklVar != null) {
            dklVar.jip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.hnj.InterfaceC0232hnj
    public long getVideoProgress() {
        dkl dklVar = this.f13232hn;
        if (dklVar == null || dklVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.f13232hn.getNativeVideoController().dkl();
    }

    public void handleInterruptVideo() {
        if (hn()) {
            return;
        }
        hnj();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv.hnj(this, this.gjv);
    }

    public void setMaterialMeta(as asVar) {
        this.gjv = asVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof hnj) {
            ((hnj) onClickListener).hnj((hnj.InterfaceC0232hnj) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.hnj.hn.hnj hnjVar = this.qor;
        if (hnjVar == null) {
            return;
        }
        hnjVar.hnj(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void hnj() {
        dkl dklVar = this.f13232hn;
        if (dklVar != null) {
            dklVar.fc();
        }
    }
}
