package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgyv extends AbstractSet {
    private zzgyv() {
        throw null;
    }

    static int zzd(Set set) {
        return set instanceof zzgyv ? ((zzgyv) set).zzc() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int iZzd;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (iZzd = zzd((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof zzgyv) {
            ((zzgyv) set).zzb();
            size = 0;
        } else {
            size = set.size();
        }
        if (zzc() < size) {
            return false;
        }
        zzgza it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            try {
                if (!set.contains(it.next())) {
                    return false;
                }
                i10++;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        if (i10 == iZzd) {
            return true;
        }
        if (i10 < size) {
            return false;
        }
        Iterator it2 = set.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            it2.next();
            i11++;
            if (i11 > i10) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgza iterator();

    abstract int zzb();

    abstract int zzc();

    /* synthetic */ zzgyv(byte[] bArr) {
    }
}
