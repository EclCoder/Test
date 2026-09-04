package com.bytedance.sdk.component.sk.hn.qor.hnj;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn implements com.bytedance.sdk.component.sk.hn, Cloneable {
    private static volatile com.bytedance.sdk.component.sk.hn ojm;
    private File aq;
    private boolean dkl;
    private boolean dse;
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12959hn;
    private long hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12960sk;

    public hn(int i10, int i11, int i12, long j10, File file) {
        this(i10, i11, i12, j10, i11 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.sk.hn ojm() {
        return ojm;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public File aq() {
        return this.aq;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public boolean dkl() {
        return this.dse;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public boolean dse() {
        return this.dkl;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public int gjv() {
        return this.gjv;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public int hn() {
        return this.f12959hn;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public long hnj() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public int qor() {
        return this.qor;
    }

    @Override // com.bytedance.sdk.component.sk.hn
    public boolean sk() {
        return this.f12960sk;
    }

    public hn(int i10, int i11, int i12, long j10, boolean z10, boolean z11, File file) {
        this.hnj = j10;
        this.f12959hn = i10;
        this.qor = i11;
        this.gjv = i12;
        this.f12960sk = z10;
        this.dkl = z11;
        this.aq = file;
        this.dse = i12 != 0;
    }

    public static void hnj(Context context, com.bytedance.sdk.component.sk.hn hnVar) {
        if (hnVar != null) {
            ojm = hnVar;
        } else {
            ojm = hnj(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.sk.hn hnj(File file) {
        long jHnj;
        int iQor;
        int iGjv;
        file.mkdirs();
        if (ojm == null) {
            iQor = 10;
            iGjv = 14;
            jHnj = 20;
        } else {
            jHnj = ojm.hnj();
            iQor = ojm.qor();
            iGjv = ojm.gjv();
        }
        return new hn(0, iQor, iGjv, jHnj, file);
    }
}
