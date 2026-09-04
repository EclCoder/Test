package com.bytedance.adsdk.ugeno.hnj.hn;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.hnj.sk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends hnj {
    private List<Keyframe> aq;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.hnj.hn.gjv$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[sk.values().length];
            hnj = iArr;
            try {
                iArr[sk.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[sk.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public gjv(Context context, com.bytedance.adsdk.ugeno.hn.qor qorVar, String str, Map<Float, String> map) {
        super(context, qorVar, str, map);
        this.aq = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public TypeEvaluator dkl() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public void hn() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i10 = AnonymousClass1.hnj[this.gjv.ordinal()];
        if (i10 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.dse.fc());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.dse.jip());
        } else if (i10 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.dse.uua());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.dse.oj());
        }
        if (keyframeOfFloat != null) {
            this.f12317sk.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.aq.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public void hnj(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.gjv == sk.TRANSLATE) {
                fOptDouble = aq.hnj(this.hnj, fOptDouble);
                fOptDouble2 = aq.hnj(this.hnj, fOptDouble2);
            }
            this.f12317sk.add(Keyframe.ofFloat(f10, fOptDouble));
            this.aq.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hnj.hn.hnj
    public List<PropertyValuesHolder> sk() {
        String strHn = this.gjv.hn();
        gjv();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strHn + "X", (Keyframe[]) this.f12317sk.toArray(new Keyframe[0]));
        this.dkl.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strHn + "Y", (Keyframe[]) this.aq.toArray(new Keyframe[0]));
        this.dkl.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorDkl = dkl();
        if (typeEvaluatorDkl != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorDkl);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorDkl);
        }
        return this.dkl;
    }
}
