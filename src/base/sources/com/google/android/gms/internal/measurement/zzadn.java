package com.google.android.gms.internal.measurement;

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
public abstract class zzadn {
    static zzadf zzb(Class cls) {
        ClassLoader classLoader = zzadn.class.getClassLoader();
        if (cls.equals(zzadf.class)) {
            try {
                try {
                    return (zzadf) cls.cast(((zzadn) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).zza());
                } catch (ReflectiveOperationException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzadn.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzadf) cls.cast(((zzadn) it.next()).zza()));
            } catch (ServiceConfigurationError e11) {
                Logger.getLogger(zzada.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", TrackLoadSettingsAtom.TYPE, "Unable to load ".concat(cls.getSimpleName()), (Throwable) e11);
            }
        }
        if (arrayList.size() == 1) {
            return (zzadf) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzadf) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    protected abstract zzadf zza();
}
