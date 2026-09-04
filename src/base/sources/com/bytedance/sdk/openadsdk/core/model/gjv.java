package com.bytedance.sdk.openadsdk.core.model;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private com.bytedance.sdk.openadsdk.core.orl.gjv hnj = new com.bytedance.sdk.openadsdk.core.orl.gjv();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Set<com.bytedance.sdk.openadsdk.core.orl.ta> f13960hn = new HashSet();

    public Set<com.bytedance.sdk.openadsdk.core.orl.ta> hn() {
        return this.f13960hn;
    }

    public com.bytedance.sdk.openadsdk.core.orl.gjv hnj() {
        return this.hnj;
    }

    public void hn(Set<com.bytedance.sdk.openadsdk.core.orl.ta> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.f13960hn.addAll(set);
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.orl.gjv gjvVar) {
        if (gjvVar == null) {
            gjvVar = new com.bytedance.sdk.openadsdk.core.orl.gjv();
        }
        this.hnj = gjvVar;
    }

    public void hnj(Set<com.bytedance.sdk.openadsdk.core.orl.ta> set) {
        this.f13960hn = set;
    }

    public void hnj(as asVar) {
        com.bytedance.sdk.openadsdk.core.orl.gjv gjvVar = this.hnj;
        if (gjvVar != null) {
            gjvVar.hnj(asVar);
        }
    }
}
