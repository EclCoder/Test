package com.google.android.gms.internal.ads;

import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzidw {
    static zzido zzb(Class cls) {
        ClassLoader classLoader = zzidw.class.getClassLoader();
        if (cls.equals(zzido.class)) {
            try {
                try {
                    return (zzido) cls.cast(((zzidw) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).zza());
                } catch (ReflectiveOperationException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzidw.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzido) cls.cast(((zzidw) it.next()).zza()));
            } catch (ServiceConfigurationError e11) {
                Logger.getLogger(zzidj.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", TrackLoadSettingsAtom.TYPE, "Unable to load ".concat(cls.getSimpleName()), (Throwable) e11);
            }
        }
        if (arrayList.size() == 1) {
            return (zzido) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzido) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    protected abstract zzido zza();
}
