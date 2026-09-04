package com.bytedance.adsdk.hnj;

import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug implements ojm {
    @Override // com.bytedance.adsdk.hnj.ojm
    public Object hnj(JSONObject jSONObject, Object[] objArr) {
        String string;
        int iIntValue;
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String str = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr.length >= 3 ? objArr[2] : null;
        if (!(obj instanceof String)) {
            return null;
        }
        String str2 = (String) obj;
        if (str == null) {
            return null;
        }
        if (str instanceof String) {
            string = str;
        } else {
            if (!(str instanceof Number)) {
                return null;
            }
            string = str.toString();
        }
        String[] strArrSplit = string.split(Pattern.quote(str2), -1);
        if (obj2 == null) {
            return strArrSplit;
        }
        if (!(obj2 instanceof Number) || (iIntValue = ((Number) obj2).intValue()) < 0 || iIntValue >= strArrSplit.length) {
            return null;
        }
        return strArrSplit[iIntValue];
    }
}
