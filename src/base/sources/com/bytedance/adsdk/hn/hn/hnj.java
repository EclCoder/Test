package com.bytedance.adsdk.hn.hn;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.hn.qor;
import com.bytedance.adsdk.hn.qor.dse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private final AssetManager gjv;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private qor f11959sk;
    private final dse<String> hnj = new dse<>();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Map<dse<String>, Typeface> f11958hn = new HashMap();
    private final Map<String, Typeface> qor = new HashMap();
    private String dkl = ".ttf";

    public hnj(Drawable.Callback callback, qor qorVar) {
        this.f11959sk = qorVar;
        if (callback instanceof View) {
            this.gjv = ((View) callback).getContext().getAssets();
        } else {
            this.gjv = null;
        }
    }

    private Typeface hn(com.bytedance.adsdk.hn.qor.qor qorVar) {
        Typeface typefaceCreateFromAsset;
        String strHnj = qorVar.hnj();
        Typeface typeface = this.qor.get(strHnj);
        if (typeface != null) {
            return typeface;
        }
        String strQor = qorVar.qor();
        String strHn = qorVar.hn();
        qor qorVar2 = this.f11959sk;
        if (qorVar2 != null) {
            typefaceCreateFromAsset = qorVar2.hnj(strHnj, strQor, strHn);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f11959sk.hnj(strHnj);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        qor qorVar3 = this.f11959sk;
        if (qorVar3 != null && typefaceCreateFromAsset == null) {
            String strHn2 = qorVar3.hn(strHnj, strQor, strHn);
            if (strHn2 == null) {
                strHn2 = this.f11959sk.hn(strHnj);
            }
            if (strHn2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.gjv, strHn2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (qorVar.gjv() != null) {
            return qorVar.gjv();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.gjv, "fonts/" + strHnj + this.dkl);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.qor.put(strHnj, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void hnj(qor qorVar) {
        this.f11959sk = qorVar;
    }

    public void hnj(String str) {
        this.dkl = str;
    }

    public Typeface hnj(com.bytedance.adsdk.hn.qor.qor qorVar) {
        this.hnj.hnj(qorVar.hnj(), qorVar.qor());
        Typeface typeface = this.f11958hn.get(this.hnj);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceHnj = hnj(hn(qorVar), qorVar.qor());
        this.f11958hn.put(this.hnj, typefaceHnj);
        return typefaceHnj;
    }

    private Typeface hnj(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
