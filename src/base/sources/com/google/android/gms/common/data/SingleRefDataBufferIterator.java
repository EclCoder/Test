package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
        }
        int i10 = this.zab + 1;
        this.zab = i10;
        if (i10 == 0) {
            Object objCheckNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = objCheckNotNull;
            if (!(objCheckNotNull instanceof DataBufferRef)) {
                throw new IllegalStateException("DataBuffer reference of type " + String.valueOf(objCheckNotNull.getClass()) + " is not movable");
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
