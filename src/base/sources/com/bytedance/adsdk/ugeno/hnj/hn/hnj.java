package com.bytedance.adsdk.ugeno.hnj.hn;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.hnj.sk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj {
    protected com.bytedance.adsdk.ugeno.hn.qor dse;
    protected sk gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected String f12316hn;
    protected Context hnj;
    protected Map<Float, String> qor;
    protected List<PropertyValuesHolder> dkl = new ArrayList();

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected List<Keyframe> f12317sk = new ArrayList();

    public hnj(Context context, com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, Map<Float, String> map) {
        this.hnj = context;
        this.f12316hn = str;
        this.qor = map;
        this.gjv = sk.hnj(this.f12316hn);
        this.dse = qorVar;
    }

    public abstract TypeEvaluator dkl();

    public void gjv() {
        Map<Float, String> map = this.qor;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!hnj()) {
            hn();
        }
        for (Map.Entry<Float, String> entry : this.qor.entrySet()) {
            if (entry != null) {
                hnj(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        qor();
    }

    public abstract void hn();

    public abstract void hnj(float f10, String str);

    public boolean hnj() {
        Map<Float, String> map = this.qor;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.qor.containsKey(Float.valueOf(0.0f));
    }

    public void qor() {
        Map<Float, String> map = this.qor;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.qor;
        if (map2 instanceof TreeMap) {
            Float f10 = (Float) ((TreeMap) map2).lastKey();
            if (f10.floatValue() != 100.0f) {
                hnj(100.0f, this.qor.get(f10));
            }
        }
    }

    public List<PropertyValuesHolder> sk() {
        String strHn = this.gjv.hn();
        gjv();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strHn, (Keyframe[]) this.f12317sk.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorDkl = dkl();
        if (typeEvaluatorDkl != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorDkl);
        }
        this.dkl.add(propertyValuesHolderOfKeyframe);
        return this.dkl;
    }
}
