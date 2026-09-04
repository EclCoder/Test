package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.collect.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import sc.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzru {
    private final Map zza;
    private final Map zzb;
    private final List zzc;

    public zzru(List list) {
        List<zztc> list2 = Collections.EMPTY_LIST;
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzsx zzsxVar = (zzsx) it.next();
            if (TextUtils.isEmpty(zzsxVar.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                zzsx zzsxVar2 = (zzsx) this.zza.put(zzsxVar.zzc(), zzsxVar);
                if (zzsxVar2 != null) {
                    String canonicalName = zzsxVar2.getClass().getCanonicalName();
                    String canonicalName2 = zzsxVar.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb2.append("Cannot override Backend ");
                    sb2.append(canonicalName);
                    sb2.append(" with ");
                    sb2.append(canonicalName2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        for (zztc zztcVar : list2) {
            if (TextUtils.isEmpty(zztcVar.zza())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                zztc zztcVar2 = (zztc) this.zzb.put(zztcVar.zza(), zztcVar);
                if (zztcVar2 != null) {
                    String canonicalName3 = zztcVar2.getClass().getCanonicalName();
                    String canonicalName4 = zztcVar.getClass().getCanonicalName();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                    sb3.append("Cannot to override Transform ");
                    sb3.append(canonicalName3);
                    sb3.append(" with ");
                    sb3.append(canonicalName4);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
        }
        this.zzc.addAll(list2);
    }

    private final zzrs zze(Uri uri) throws zzsk {
        c0.a aVarR = c0.r();
        c0.a aVarR2 = c0.r();
        String encodedFragment = uri.getEncodedFragment();
        c0 c0VarC = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? c0.C() : c0.w(t.g("+").e().i(encodedFragment.substring(10)));
        int size = c0VarC.size();
        for (int i10 = 0; i10 < size; i10++) {
            aVarR2.a(zzsp.zza((String) c0VarC.get(i10)));
        }
        c0 c0VarM = aVarR2.m();
        int size2 = c0VarM.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String str = (String) c0VarM.get(i11);
            zztc zztcVar = (zztc) this.zzb.get(str);
            if (zztcVar == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + strValueOf.length());
                sb2.append("Requested transform isn't registered: ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(strValueOf);
                throw new zzsk(sb2.toString());
            }
            aVarR.a(zztcVar);
        }
        c0 c0VarJ = aVarR.m().J();
        zzrr zzrrVar = new zzrr(null);
        String scheme = uri.getScheme();
        zzsx zzsxVar = (zzsx) this.zza.get(scheme);
        if (zzsxVar == null) {
            throw new zzsk(String.format("Requested backend isn't registered: %s", scheme));
        }
        zzrrVar.zza(zzsxVar);
        zzrrVar.zzc(this.zzc);
        zzrrVar.zzb(c0VarJ);
        zzrrVar.zze(uri);
        if (!c0VarJ.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str2 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = c0VarJ.listIterator(c0VarJ.size());
                while (listIterator.hasPrevious()) {
                }
                arrayList.set(arrayList.size() - 1, str2);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        zzrrVar.zzd(uri);
        return new zzrs(zzrrVar);
    }

    public final Object zza(Uri uri, zzrt zzrtVar) {
        return zzrtVar.zza(zze(uri));
    }

    public final void zzb(Uri uri) throws zzsk {
        zzrs zzrsVarZze = zze(uri);
        zzrsVarZze.zza().zzk(zzrsVarZze.zzb());
    }

    public final boolean zzc(Uri uri) throws zzsk {
        zzrs zzrsVarZze = zze(uri);
        return zzrsVarZze.zza().zze(zzrsVarZze.zzb());
    }

    public final void zzd(Uri uri, Uri uri2) throws zzsk {
        zzrs zzrsVarZze = zze(uri);
        zzrs zzrsVarZze2 = zze(uri2);
        if (zzrsVarZze.zza() != zzrsVarZze2.zza()) {
            throw new zzsk("Cannot rename file across backends");
        }
        zzrsVarZze.zza().zzl(zzrsVarZze.zzb(), zzrsVarZze2.zzb());
    }
}
