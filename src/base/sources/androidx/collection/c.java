package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class c {
    static Object[] a(Object[] objArr, int i10) {
        if (objArr.length < i10) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
