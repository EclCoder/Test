package com.bytedance.sdk.component.dse;

import com.bytedance.sdk.component.hn.hnj.ta;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    final long dkl;
    ta dse;
    final String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    final String f12824hn;
    final int hnj;
    private final boolean ojm;
    final Map<String, String> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final long f12825sk;
    private File aq = null;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private byte[] f12826ta = null;

    public hn(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.ojm = z10;
        this.hnj = i10;
        this.f12824hn = str;
        this.qor = map;
        this.gjv = str2;
        this.f12825sk = j10;
        this.dkl = j11;
    }

    public boolean dkl() {
        return this.ojm;
    }

    public ta dse() {
        return this.dse;
    }

    public String gjv() {
        return this.gjv;
    }

    public String hn() {
        return this.f12824hn;
    }

    public int hnj() {
        return this.hnj;
    }

    public Map<String, String> qor() {
        return this.qor;
    }

    public File sk() {
        return this.aq;
    }

    public void hnj(File file) {
        this.aq = file;
    }

    public void hnj(byte[] bArr) {
        this.f12826ta = bArr;
    }

    public void hnj(ta taVar) {
        this.dse = taVar;
    }
}
