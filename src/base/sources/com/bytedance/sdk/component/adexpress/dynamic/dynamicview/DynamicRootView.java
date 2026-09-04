package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.gjv, com.bytedance.sdk.component.adexpress.theme.hnj {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private sk dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.hn.dnm mRenderListener;
    private com.bytedance.sdk.component.adexpress.hn.orl mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.hn muteListener;
    protected final com.bytedance.sdk.component.adexpress.hn.mjg renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.qor> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.sk videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.hn.orl orlVar, com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj hnjVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.hn.mjg mjgVar = new com.bytedance.sdk.component.adexpress.hn.mjg();
        this.renderResult = mjgVar;
        mjgVar.hnj(2);
        this.mDynamicClickListener = hnjVar;
        hnjVar.hnj(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.hnj(this);
        this.mIsMute = z10;
        this.mRenderRequest = orlVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk;
        com.bytedance.sdk.component.adexpress.dynamic.gjv.sk skVarTa = aqVar.ta();
        if (skVarTa == null || (dklVarSk = skVarTa.sk()) == null) {
            return;
        }
        this.renderResult.hn(dklVarSk.xe());
    }

    private boolean checkSizeValid() {
        sk skVar = this.dynamicBaseWidget;
        return skVar.f12550sk > 0.0f && skVar.dkl > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !aqVar.m4do()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i10, String str) {
        this.renderResult.hnj(false);
        this.renderResult.hn(i10);
        this.renderResult.hnj(str);
        this.mRenderListener.hnj(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.hn.dnm getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.hn.orl getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.qor> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.hnj
    public void onThemeChanged(int i10) {
        sk skVar = this.dynamicBaseWidget;
        if (skVar == null) {
            return;
        }
        skVar.hnj(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void onvideoComplate() {
        try {
            this.videoListener.hnj();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, int i10) {
        this.dynamicBaseWidget = renderDynamicView(aqVar, this, i10);
        this.renderResult.hnj(true);
        this.renderResult.hnj(this.dynamicBaseWidget.f12550sk);
        this.renderResult.hn(this.dynamicBaseWidget.dkl);
        this.renderResult.hnj(this.videoView);
        this.mRenderListener.hnj(this.renderResult);
    }

    public sk renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar, ViewGroup viewGroup, int i10) {
        if (aqVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> listDnm = aqVar.dnm();
        sk skVarHnj = com.bytedance.sdk.component.adexpress.dynamic.hnj.hn.hnj(this.mContext, this, aqVar);
        if (skVarHnj instanceof nyv) {
            callBackRenderFail(i10 == 3 ? 128 : Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(aqVar);
        skVarHnj.qor();
        if (viewGroup != null) {
            viewGroup.addView(skVarHnj);
            setClipChildren(viewGroup, aqVar);
        }
        if (listDnm == null || listDnm.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> it = listDnm.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), skVarHnj, i10);
        }
        return skVarHnj;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i10) {
        this.logoUnionHeight = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.hn hnVar) {
        this.muteListener = hnVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.hn.dnm dnmVar) {
        this.mRenderListener = dnmVar;
        this.mDynamicClickListener.hnj(dnmVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.scoreCountWithIcon = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.hn hnVar = this.muteListener;
        if (hnVar != null) {
            hnVar.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        for (int i12 = 0; i12 < this.timeOutListener.size(); i12++) {
            if (this.timeOutListener.get(i12) != null) {
                this.timeOutListener.get(i12).hnj(charSequence, i10 == 1, i11, z10);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.qor qorVar) {
        this.timeOutListener.add(qorVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gjv
    public void setTimeUpdate(int i10) {
        this.videoListener.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.timedown = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.sk skVar) {
        this.videoListener = skVar;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        this.renderResult.qor(d10);
        this.renderResult.gjv(d11);
        this.renderResult.sk(d12);
        this.renderResult.dkl(d13);
        this.renderResult.hnj(f10);
        this.renderResult.hn(f10);
        this.renderResult.qor(f10);
        this.renderResult.gjv(f10);
    }

    public void beginShowFromInvisible(sk skVar, int i10) {
        if (skVar == null) {
            return;
        }
        if (skVar.getBeginInvisibleAndShow()) {
            skVar.setVisibility(i10);
            View view = skVar.f12547fc;
            if (view != null) {
                view.setVisibility(i10);
            }
        }
        int childCount = skVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            if (skVar.getChildAt(i11) instanceof sk) {
                beginShowFromInvisible((sk) skVar.getChildAt(i11), i10);
            }
        }
    }
}
