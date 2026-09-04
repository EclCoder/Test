package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f3445a = new SparseIntArray(0);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap f3446a = new HashMap(0);
    }

    @Override // androidx.databinding.e
    public List a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.e
    public p b(f fVar, View view, int i10) {
        if (f3445a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f3445a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.e
    public int d(String str) {
        Integer num;
        if (str == null || (num = (Integer) a.f3446a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
