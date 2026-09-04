package com.bytedance.adsdk.hn.hnj;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.hn.dkl.sk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends Paint {
    public hnj() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(sk.hnj(i10, 0, 255));
        } else {
            setColor((sk.hnj(i10, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public hnj(int i10) {
        super(i10);
    }

    public hnj(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public hnj(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
