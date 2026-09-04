package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f31386g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f31387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f31388i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31389f;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    protected boolean a() {
        return this.f31389f;
    }

    public int getOrientation() {
        return f31386g;
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f31386g, f31388i, f31387h);
    }

    private void a(int i10, int i11) {
        int iN = m0.n(c.n().d());
        int iM = m0.m(c.n().d());
        int i12 = f31386g;
        if (i12 == 1) {
            if (iM > i11 * 4) {
                setHeight(iM - i11);
                setWidth(iN);
                return;
            } else {
                setHeight(0);
                setWidth(0);
                return;
            }
        }
        if (i12 == 2) {
            if (iN > i10 * 4) {
                setWidth(iN - i10);
                setHeight(iM);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
    }

    public SplashBidRequestParams(String str, String str2, boolean z10, int i10, int i11, int i12) {
        this(str, str2, "", z10, i10, i12, i11);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z10, int i10, int i11, int i12) {
        super(str, str2, str3, 0, 0);
        this.f31389f = false;
        f31386g = i10;
        a(i11, i12);
        this.f31389f = z10;
    }
}
