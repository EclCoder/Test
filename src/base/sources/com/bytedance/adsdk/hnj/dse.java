package com.bytedance.adsdk.hnj;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements ojm {
    @Override // com.bytedance.adsdk.hnj.ojm
    /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
    public Number hnj(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberHnj = hnj(objArr[0]);
        int iHnj = hnj(objArr[1], 0);
        boolean zHnj = hnj(objArr[2], false);
        if (numberHnj == null) {
            return null;
        }
        return hnj(numberHnj, iHnj, zHnj);
    }

    public Number hnj(Number number, int i10, boolean z10) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i10, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z10 ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        return (iMax == 0 || a.a(scale).scale() <= 0) ? Long.valueOf(scale.longValue()) : Double.valueOf(scale.doubleValue());
    }

    private Number hnj(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int hnj(Object obj, int i10) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    private boolean hnj(Object obj, boolean z10) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
    }
}
