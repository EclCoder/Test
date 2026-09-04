package com.bytedance.adsdk.hn.qor.hn;

import android.graphics.Paint;
import com.bytedance.adsdk.hn.hnj.hnj.apu;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj implements qor {
    private final hn aq;
    private final com.bytedance.adsdk.hn.qor.hnj.hn dkl;
    private final hnj dse;
    private final com.bytedance.adsdk.hn.qor.hnj.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.hn f12070hn;
    private final String hnj;
    private final float ojm;
    private final List<com.bytedance.adsdk.hn.qor.hnj.hn> qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.gjv f12071sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final boolean f12072ta;

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.qor.hn.oj$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        static final /* synthetic */ int[] f12073hn;
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[hn.values().length];
            f12073hn = iArr;
            try {
                iArr[hn.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12073hn[hn.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12073hn[hn.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[hnj.values().length];
            hnj = iArr2;
            try {
                iArr2[hnj.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hnj[hnj.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hnj[hnj.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hn {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join hnj() {
            int i10 = AnonymousClass1.f12073hn[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap hnj() {
            int i10 = AnonymousClass1.hnj[ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public oj(String str, com.bytedance.adsdk.hn.qor.hnj.hn hnVar, List<com.bytedance.adsdk.hn.qor.hnj.hn> list, com.bytedance.adsdk.hn.qor.hnj.hnj hnjVar, com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar, com.bytedance.adsdk.hn.qor.hnj.hn hnVar2, hnj hnjVar2, hn hnVar3, float f10, boolean z10) {
        this.hnj = str;
        this.f12070hn = hnVar;
        this.qor = list;
        this.gjv = hnjVar;
        this.f12071sk = gjvVar;
        this.dkl = hnVar2;
        this.dse = hnjVar2;
        this.aq = hnVar3;
        this.ojm = f10;
        this.f12072ta = z10;
    }

    public hn aq() {
        return this.aq;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn dkl() {
        return this.f12070hn;
    }

    public hnj dse() {
        return this.dse;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hn gjv() {
        return this.dkl;
    }

    public com.bytedance.adsdk.hn.qor.hnj.hnj hn() {
        return this.gjv;
    }

    @Override // com.bytedance.adsdk.hn.qor.hn.qor
    public com.bytedance.adsdk.hn.hnj.hnj.qor hnj(com.bytedance.adsdk.hn.ojm ojmVar, com.bytedance.adsdk.hn.dse dseVar, com.bytedance.adsdk.hn.qor.qor.hnj hnjVar) {
        return new apu(ojmVar, hnjVar, this);
    }

    public float ojm() {
        return this.ojm;
    }

    public com.bytedance.adsdk.hn.qor.hnj.gjv qor() {
        return this.f12071sk;
    }

    public List<com.bytedance.adsdk.hn.qor.hnj.hn> sk() {
        return this.qor;
    }

    public boolean ta() {
        return this.f12072ta;
    }

    public String hnj() {
        return this.hnj;
    }
}
