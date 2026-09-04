package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static <T, V> ObjectAnimator a(T t10, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
        }
    }

    static ObjectAnimator a(Object obj, Property property, Path path) {
        return a.a(obj, property, path);
    }
}
