package com.bytedance.adsdk.ugeno.hnj.hn;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.hnj.sk;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.hnj.hn.hn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[sk.values().length];
            hnj = iArr;
            try {
                iArr[sk.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[sk.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hnj[sk.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hnj[sk.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hnj[sk.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hnj[sk.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                hnj[sk.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                hnj[sk.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                hnj[sk.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public hn(Context context, com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, TreeMap<Float, String> treeMap) {
        super(context, qorVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public TypeEvaluator dkl() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public void hn() {
        float fFc;
        switch (AnonymousClass1.hnj[this.gjv.ordinal()]) {
            case 1:
                fFc = this.dse.fc();
                break;
            case 2:
                fFc = this.dse.jip();
                break;
            case 3:
                fFc = this.dse.uua();
                break;
            case 4:
                fFc = this.dse.oj();
                break;
            case 5:
                fFc = this.dse.xn();
                if (this.dse.dnm() != null) {
                    this.dse.dnm().setCameraDistance(10000.0f);
                }
                break;
            case 6:
                fFc = this.dse.apu();
                if (this.dse.dnm() != null) {
                    this.dse.dnm().setCameraDistance(10000.0f);
                }
                break;
            case 7:
                fFc = this.dse.eum();
                break;
            case 8:
                fFc = this.dse.wu();
                break;
            case 9:
                fFc = this.dse.as();
                break;
            default:
                fFc = 0.0f;
                break;
        }
        this.f12317sk.add(Keyframe.ofFloat(0.0f, fFc));
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public void hnj(float f10, String str) {
        this.f12317sk.add(Keyframe.ofFloat(f10, (this.f12316hn.startsWith(sk.TRANSLATE.hnj()) || this.gjv == sk.BORDER_RADIUS) ? aq.hnj(this.hnj, com.bytedance.adsdk.ugeno.dse.qor.hnj(str, 0.0f)) : com.bytedance.adsdk.ugeno.dse.qor.hnj(str, 0.0f)));
    }
}
