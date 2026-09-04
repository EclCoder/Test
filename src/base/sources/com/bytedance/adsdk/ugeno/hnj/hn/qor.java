package com.bytedance.adsdk.ugeno.hnj.hn;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.hnj.sk;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends hnj {
    public qor(Context context, com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, TreeMap<Float, String> treeMap) {
        super(context, qorVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public TypeEvaluator dkl() {
        return this.gjv == sk.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public void hn() {
        if (this.gjv == sk.BACKGROUND_COLOR) {
            this.f12317sk.add(Keyframe.ofInt(0.0f, this.dse.jbd()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public void hnj(float f10, String str) {
        this.f12317sk.add(this.gjv == sk.BACKGROUND_COLOR ? Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.dse.hnj.hnj(str)) : Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.dse.qor.hnj(str, 0)));
    }
}
