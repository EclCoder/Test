package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.q0;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        q0.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        q0.a("DefaultJSVideoModule", "closeOperte:close=" + i10 + "closeViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        q0.a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        q0.a("DefaultJSVideoModule", "getCurrentProgress");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        q0.a("DefaultJSVideoModule", "notifyCloseBtn:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        q0.a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        q0.a("DefaultJSVideoModule", "progressOperate:progress=" + i10 + "progressViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        q0.a("DefaultJSVideoModule", "setCover:" + z10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        q0.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        q0.a("DefaultJSVideoModule", "setScaleFitXY:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        q0.a("DefaultJSVideoModule", "setVisible:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        q0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        q0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        q0.a("DefaultJSVideoModule", "showVideoLocation:marginTop=" + i10 + ",marginLeft=" + i11 + ",width=" + i12 + ",height=" + i13 + ",radius=" + i14 + ",borderTop=" + i15 + ",borderTop=" + i15 + ",borderLeft=" + i16 + ",borderWidth=" + i17 + ",borderHeight=" + i18);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        q0.a("DefaultJSVideoModule", "soundOperate:mute=" + i10 + ",soundViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        q0.a("DefaultJSVideoModule", "videoOperate:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        q0.a(YSHErhbVu.oXwBaOcQeSDEi, "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        q0.a("DefaultJSVideoModule", "soundOperate:mute=" + i10 + ",soundViewVisible=" + i11 + ",pt=" + str);
    }
}
