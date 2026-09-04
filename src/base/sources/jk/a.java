package jk;

import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static Object a(Class cls, Class cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new ServiceConfigurationError("Provider " + cls.getName() + " could not be instantiated.", e10);
        }
    }
}
