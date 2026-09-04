package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor {
    protected final hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final as f13205hn;
    protected final Activity hnj;
    protected String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected String f13206sk;

    public qor(Activity activity, as asVar, hn hnVar) {
        this.hnj = activity;
        this.f13205hn = asVar;
        if (asVar != null) {
            this.qor = hqh.m35do(asVar);
        }
        if (activity != null) {
            this.f13206sk = String.valueOf(activity.hashCode());
        }
        this.gjv = hnVar;
    }

    public abstract int aq();

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.qor bug();

    public aq dnm() {
        return null;
    }

    public abstract List<as> fc();

    public boolean gjv() {
        return false;
    }

    public void hn() {
    }

    public abstract void hn(aq aqVar, int i10);

    public void hnj() {
    }

    public abstract void hnj(int i10);

    public abstract boolean hnj(aq aqVar, int i10);

    public sk mjg() {
        return null;
    }

    public abstract void oj();

    public aq orl() {
        return null;
    }

    public boolean sk() {
        return true;
    }

    public abstract int ta();

    public abstract void xn();

    public void hn(Activity activity) {
    }

    public void hnj(float f10) {
    }

    public void hnj(int i10, int i11) {
    }

    public void hnj(Activity activity) {
    }

    public void hnj(Bundle bundle) {
    }

    public void hnj(View view) {
    }

    public void hnj(View view, boolean z10) {
    }

    public void hnj(aq aqVar) {
    }

    public void hnj(aq aqVar, aq aqVar2, hn.sk skVar) {
    }

    public void hnj(aq aqVar, hn.sk skVar) {
    }

    public void hnj(aq aqVar, boolean z10) {
    }

    public void hnj(aq aqVar, boolean z10, boolean z11, boolean z12, int i10) {
    }

    public void hnj(hnj hnjVar, boolean z10) {
    }

    public void hnj(Map<String, Object> map, aq aqVar, float f10, float f11) {
    }

    public void hnj(boolean z10) {
    }

    public void dkl() {
    }

    public void dse() {
    }

    public void jip() {
    }

    public void ojm() {
    }

    public void qor() {
    }

    public void uua() {
    }
}
