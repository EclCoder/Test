package v;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HashMap f54904a = new HashMap();

    public float a(Object obj, String str, int i10) {
        HashMap map;
        float[] fArr;
        if (this.f54904a.containsKey(obj) && (map = (HashMap) this.f54904a.get(obj)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > i10) {
            return fArr[i10];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i10, float f10) {
        if (!this.f54904a.containsKey(obj)) {
            HashMap map = new HashMap();
            float[] fArr = new float[i10 + 1];
            fArr[i10] = f10;
            map.put(str, fArr);
            this.f54904a.put(obj, map);
            return;
        }
        HashMap map2 = (HashMap) this.f54904a.get(obj);
        if (map2 == null) {
            map2 = new HashMap();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i10 + 1];
            fArr2[i10] = f10;
            map2.put(str, fArr2);
            this.f54904a.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = (float[]) map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i10) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i10 + 1);
        }
        fArrCopyOf[i10] = f10;
        map2.put(str, fArrCopyOf);
    }
}
