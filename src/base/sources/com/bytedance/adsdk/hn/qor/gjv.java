package com.bytedance.adsdk.hn.qor;

import com.bytedance.adsdk.hn.qor.hn.jip;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    private final String dkl;
    private final double gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final char f12046hn;
    private final List<jip> hnj;
    private final double qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final String f12047sk;

    public gjv(List<jip> list, char c10, double d10, double d11, String str, String str2) {
        this.hnj = list;
        this.f12046hn = c10;
        this.qor = d10;
        this.gjv = d11;
        this.f12047sk = str;
        this.dkl = str2;
    }

    public static int hnj(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return hnj(this.f12046hn, this.dkl, this.f12047sk);
    }

    public double hn() {
        return this.gjv;
    }

    public List<jip> hnj() {
        return this.hnj;
    }
}
