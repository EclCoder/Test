package lo;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static Object a(Object obj) throws CloneNotSupportedException {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Cloneable)) {
            throw new CloneNotSupportedException();
        }
        try {
            try {
                return obj.getClass().getMethod("clone", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                throw new IllegalAccessError(e10.getMessage());
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (cause instanceof CloneNotSupportedException) {
                    throw ((CloneNotSupportedException) cause);
                }
                throw new Error("Unexpected exception", cause);
            }
        } catch (NoSuchMethodException e12) {
            throw new NoSuchMethodError(e12.getMessage());
        }
    }
}
