package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    void close();

    T get(int i10);

    int getCount();

    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    Iterator<T> iterator();

    void release();

    Iterator<T> singleRefIterator();
}
