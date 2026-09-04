package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public float f12612hn;
    public float hnj;

    public ojm(float f10, float f11) {
        this.hnj = f10;
        this.f12612hn = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ojm ojmVar = (ojm) obj;
            if (Float.compare(ojmVar.hnj, this.hnj) == 0 && Float.compare(ojmVar.f12612hn, this.f12612hn) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.hnj), Float.valueOf(this.f12612hn)});
    }
}
