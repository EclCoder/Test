package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBSplashData implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f29907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f29912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f29915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f29916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f29917k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f29907a = dyOption;
        this.f29912f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f29909c;
    }

    public String getAppInfo() {
        return this.f29908b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f29912f;
    }

    public int getClickType() {
        return this.f29917k;
    }

    public String getCountDownText() {
        return this.f29910d;
    }

    public DyOption getDyOption() {
        return this.f29907a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f29907a;
    }

    public int getLogoImage() {
        return this.f29914h;
    }

    public String getLogoText() {
        return this.f29911e;
    }

    public int getNoticeImage() {
        return this.f29913g;
    }

    public float getxInScreen() {
        return this.f29915i;
    }

    public float getyInScreen() {
        return this.f29916j;
    }

    public void setAdClickText(String str) {
        this.f29909c = str;
    }

    public void setAppInfo(String str) {
        this.f29908b = str;
    }

    public void setClickType(int i10) {
        this.f29917k = i10;
    }

    public void setCountDownText(String str) {
        this.f29910d = str;
    }

    public void setLogoImage(int i10) {
        this.f29914h = i10;
    }

    public void setLogoText(String str) {
        this.f29911e = str;
    }

    public void setNoticeImage(int i10) {
        this.f29913g = i10;
    }

    public void setxInScreen(float f10) {
        this.f29915i = f10;
    }

    public void setyInScreen(float f10) {
        this.f29916j = f10;
    }
}
